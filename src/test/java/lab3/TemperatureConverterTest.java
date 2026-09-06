package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, tc.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, tc.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, tc.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, tc.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(273.15, tc.celsiusToKelvin(0), 0.01);
    }

    @Test
    void testRoundTrip() {
        double x = 37.5;
        double result = tc.fahrenheitToCelsius(tc.celsiusToFahrenheit(x));
        assertEquals(x, result, 0.01);
    }
}