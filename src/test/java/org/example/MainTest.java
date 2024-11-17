package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @Test
    void testOne() {
        int[] encoded={1,2,3};
        int [] actual =Main.decode(encoded,1);
        int []expected={1,0,2,1};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    void testTwo() {
        int[] encoded={6,2,7,3};
        int [] actual =Main.decode(encoded,4);
        int []expected={4,2,0,7,4};
        Assertions.assertArrayEquals(actual,expected);
    }

}