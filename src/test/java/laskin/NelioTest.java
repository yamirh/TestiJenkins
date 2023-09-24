package laskin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NelioTest {

    private Laskin laskin = new Laskin();

    @ParameterizedTest
    @CsvSource({
        "2, 4",
        "4, 16",
        "-3, 9",
        "5, 25",
        "0, 0"
    })
    public void testNelio(double syote, double odotettuTulos) {
        assertEquals(odotettuTulos, laskin.nelio(syote), 0.0001);  // delta-arvo 0.0001
    }
}
