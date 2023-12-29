package seminar3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8})
    void testEvenOddNumberWithEven(int number) {
        assertTrue(MainHW.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 9})
    void testEvenOddNumberWithOdd(int number) {
        assertFalse(MainHW.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 50, 100})
    void testNumberInInterval(int number) {
        assertTrue(MainHW.numberInInterval(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 0, 110})
    void testNotNumberInInterval(int number) {
        assertFalse(MainHW.numberInInterval(number));
    }
}