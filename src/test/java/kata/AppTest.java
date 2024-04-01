package kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static Stream<Arguments> getArabicNumbers() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(14, "XIV"),
                Arguments.of(40, "XL"),
                Arguments.of(50, "L"),
                Arguments.of(90, "XC"),
                Arguments.of(100, "C"),
                Arguments.of(400, "CD"),
                Arguments.of(500, "D"),
                Arguments.of(900, "CM"),
                Arguments.of(1000, "M")
        );
    }

    @Test
    public void shouldReturnEmptyFor0() {
        assertEquals("", App.convertArabicToRoman(0));
    }
    @ParameterizedTest
    @MethodSource("getArabicNumbers")
    public void shouldReturnRomanNumeralForArabicNumber(int number, String expectedRoman) {
        assertEquals(expectedRoman, App.convertArabicToRoman(number));
    }
    @Test
    public void shouldReturnMCMIIIfor1903() {
        assertEquals("MCMIII", App.convertArabicToRoman(1903));
    }
    @Test
    public void shouldReturnMCMXLIVfor2944() {
        assertEquals("MCMXLIV", App.convertArabicToRoman(1944));
    }
}