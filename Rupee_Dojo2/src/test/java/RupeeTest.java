import com.thoughtworks.Rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void shouldNotBeSameWhenTwoDifferentTenRupeesAreGiven() {
        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(tenRupee, anotherTenRupee);
    }

    @Test
    void shouldBeEqualWhenTwoDifferentTenRupeesAreGiven() {
        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertEquals(tenRupee, anotherTenRupee);
    }

    @Test
    void shouldNotBeEqualToTenRupeeWhenTenAndFiveRupeesAreGiven() {
        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(5);

        assertNotEquals(tenRupee,anotherTenRupee);
    }
}
