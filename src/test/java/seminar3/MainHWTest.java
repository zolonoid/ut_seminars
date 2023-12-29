package seminar3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8})
    void isNumberEven(int number) {
        assertTrue(MainHW.isNumberEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 50, 100})
    void isNumberInRange(int number) {
        assertTrue(MainHW.isNumberInRange(number));
    }
}