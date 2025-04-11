package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testAdd() {
        HelloWorld hw = new HelloWorld();
        assertEquals(5, hw.add(2, 3));
    }
}