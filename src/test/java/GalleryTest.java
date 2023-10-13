import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery tate;
    Artist steve;
    Artwork sky;
    Artist bob;
    Artwork ball;

    @BeforeEach
    public void setUp() {
        tate = new Gallery("tate");
        steve = new Artist("steve");
        sky = new Artwork("sky", steve, 50);
        bob = new Artist("bob");
        ball = new Artwork("ball", bob, 150);
        tate.addStock(sky);
        tate.addStock(ball);
    }

    @Test
    public void canGetName() {
        assertThat(tate.getName()).isEqualTo("tate");
    }

    @Test
    public void canSetName() {
        tate.setName("hayward");
        assertThat(tate.getName()).isEqualTo("hayward");
    }

    @Test
    public void canGetTill() {
        assertThat(tate.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill() {
        tate.setTill(600);
        assertThat(tate.getTill()).isEqualTo(600);
    }

    @Test
    public void canGetStock(){
        assertThat(tate.getStock().size()).isEqualTo(tate.getStockCount());
    }

    @Test
    public void canAddStock(){
        Artist steve = new Artist("steve");
        Artwork sunrise = new Artwork("sunrise",steve,200);
        tate.addStock(sunrise);
        assertThat(tate.getStockCount()).isEqualTo(3);
    }

    @Test
    public void canSellArtwork(){
        Customer tom = new Customer("tom");
        tate.sellArtwork(sky,tom);
        assertThat(tate.getTill()).isEqualTo(50);
        assertThat(tom.getWallet()).isEqualTo(450);
        assertThat(tom.getArtCollectionCount()).isEqualTo(1);
    }

    @Test
    public void canRemoveArtwork(){
        Customer tom = new Customer("tom");
        tate.sellArtwork(sky,tom);
        assertThat(tate.getStockCount()).isEqualTo(1);
    }

    @Test
    public void canNotSellArtwork(){
        Customer tom = new Customer("tom");
        tom.setWallet(20);
        tate.sellArtwork(sky,tom);
        assertThat(tate.getTill()).isEqualTo(0);
        assertThat(tom.getWallet()).isEqualTo(20);

    }

    @Test
    public void canGetStockValue(){
        assertThat(tate.stock_take()).isEqualTo(200);
    }





}