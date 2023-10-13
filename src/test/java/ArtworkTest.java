import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork wall;
    Artist john;

    @BeforeEach
    public void setUp(){
        john = new Artist("john");
        wall = new Artwork("wall",john,100);

    }

    @Test
    public void canGetTitle(){
        assertThat(wall.getTitle()).isEqualTo("wall");
    }

    @Test
    public void canSetTitle(){
        wall.setTitle("portrait");
        assertThat(wall.getTitle()).isEqualTo("portrait");
    }

    @Test
    public void canGetArtist(){
        assertThat(wall.getArtist()).isEqualTo("john");
    }

//    @Test
//    public void canSetArtist() {
//        wall.setArtist("luke");
//        assertThat(wall.getArtist()).isEqualTo("luke");
//    }

    @Test
    public void canGetPrice(){
        assertThat(wall.getPrice()).isEqualTo(100);
    }

    @Test
    public void canSetPrice(){
    wall.setPrice(130);
    assertThat(wall.getPrice()).isEqualTo(130);
    }
}


