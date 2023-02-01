package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/numbers.csv")

    public void calcTrue(int expected, int first, int second) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(first, second);

        Assertions.assertEquals(expected, actual);

    }
}
