import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery tate;

    @BeforeEach
    public void setUp() {
        tate = new Gallery("tate");
        Artist steve = new Artist("steve");
        Artwork sky = new Artwork("sky", steve, 50);
        Artist bob = new Artist("bob");
        Artwork ball = new Artwork("ball", bob, 150);
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



}