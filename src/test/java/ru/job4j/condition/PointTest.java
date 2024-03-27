package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when31to4Minus1then2Dot23() {
        double expected = 2.23;
        int x1 = 3;
        int y1 = 1;
        int x2 = 4;
        int y2 = -1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to34then2Dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus40toMinus25then9Dot05() {
        double expected = 9.05;
        int x1 = -1;
        int y1 = -4;
        int x2 = -2;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}