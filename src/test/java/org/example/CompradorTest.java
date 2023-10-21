package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    private Expendedor expendedor;
    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(10);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testCompraExitosa() {
        try {
            Moneda moneda1000 = new Moneda1000(); // Moneda de 1000
            Comprador comprador = new Comprador(moneda1000, 1, expendedor); // Comprar una Coca-Cola (selección 1).

            assertEquals("cocacola", comprador.queConsumiste()); // Verificar que se consumió una Coca-Cola.
            assertEquals(0, comprador.cuantoVuelto()); // Verificar que no hay vuelto.
        } catch (Exception e) {
            fail("No se esperaba ninguna excepción: " + e.getMessage());
        }
    }

    @Test
    public void testCompraSinMoneda() {
        try {
            Comprador comprador = new Comprador(null, 1, expendedor); // Intentar comprar sin insertar una moneda.
            fail("Se esperaba una PagoIncorrectoException");
        } catch (PagoIncorrectoException e) {
            assertEquals("No se ingresó una moneda", e.getMessage());
        } catch (Exception e) {
            fail("Se esperaba una PagoIncorrectoException, pero se lanzó: " + e.getClass().getName());
        }
    }

    @Test
    public void testCompraPagoInsuficiente() {
        try {
            Moneda moneda500 = new Moneda500(); // Moneda de 500
            Comprador comprador = new Comprador(moneda500, 1, expendedor); // Intentar comprar una Coca-Cola con moneda de 500.
            fail("Se esperaba una PagoInsuficienteException");
        } catch (PagoInsuficienteException e) {
            assertEquals("Dinero insuficiente", e.getMessage());
        } catch (Exception e) {
            fail("Se esperaba una PagoInsuficienteException, pero se lanzó: " + e.getClass().getName());
        }
    }

    @Test
    public void testCompraProductoNoDisponible() {
        try {
            Moneda moneda1000 = new Moneda1000(); // Moneda de 1000
            Comprador comprador = new Comprador(moneda1000, 6, expendedor); // Intentar comprar un producto no disponible (selección 6).
            fail("Se esperaba una NoHayProductoException");
        } catch (NoHayProductoException e) {
            assertEquals("Número de selección no existe", e.getMessage());
        } catch (Exception e) {
            fail("Se esperaba una NoHayProductoException, pero se lanzó: " + e.getClass().getName());
        }
    }
}
