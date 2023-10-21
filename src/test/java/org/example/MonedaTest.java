package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonedaTest {
    @Test
    public void testGetValor() {
        Moneda100 moneda100 = new Moneda100();
        assertEquals(100, moneda100.getValor());
    }//


    @Test
    public void testCompareTo() {
        Moneda100 moneda100A = new Moneda100();
        Moneda100 moneda100B = new Moneda100();
        Moneda500 moneda500 = new Moneda500();

        assertEquals(0, moneda100A.compareTo(moneda100B)); // Igual valor
        assertTrue(moneda100A.compareTo(moneda500) < 0); // moneda100A < moneda500
        assertTrue(moneda500.compareTo(moneda100A) > 0); // moneda500 > moneda100A
    }
}