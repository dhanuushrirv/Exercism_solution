import com.thoughtworks.Rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class RupeeTest {
    @Test
    void shouldNotBeSameWhenTwoDifferentTenRupeesAreGiven() {
        Rupee rupee = new Rupee(10);
        Rupee anotherRupee = new Rupee(10);

        assertNotSame(rupee,anotherRupee);
    }
}
