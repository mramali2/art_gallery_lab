import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer greg;

    @BeforeEach
    public void setup(){
    greg = new Customer("greg");
    }

    @Test
    public void canGetName(){
        assertThat(greg.getName()).isEqualTo("greg");
    }

    @Test
    public void canGetWallet(){
    assertThat(greg.getWallet()). isEqualTo(0);
    }
    
    @Test
    public void canSetWallet(){
        greg.setWallet(20);
        assertThat(greg.getWallet()).isEqualTo(20);
    }
    
    @Test
    public void canBuyArtwork(){
       
    }
}
