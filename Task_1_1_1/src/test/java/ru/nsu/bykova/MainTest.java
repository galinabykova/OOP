package ru.nsu.bykova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void CheckSum() {
        assertEquals(3, Main.sum(1, 2));
    }
}
