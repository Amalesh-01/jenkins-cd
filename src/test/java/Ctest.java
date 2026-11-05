import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ctest{
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(77.0,
                Main.celsiusToFahrenheit(25),
                0.001);


    }
}