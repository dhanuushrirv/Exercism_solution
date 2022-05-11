import com.thoughtworks.Rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class RupeeTest {
    @Test
    void shouldNotBeSameWhenTwoDifferentTenRupeesAreGiven() {
        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(tenRupee,anotherTenRupee);
    }

    @Test
    void shouldBeEqualWhenTwoDifferentTenRupeesAreGiven() {
        Rupee tenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertEquals(tenRupee,anotherTenRupee);

    }
}
