package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor expendedor;

    @BeforeEach
    void setUp() {
        // Inicializar un expendedor con una cantidad de productos (por ejemplo, 10 productos de cada tipo)
        expendedor = new Expendedor(10);
    }

    @AfterEach
    void tearDown() {
        // Realizar las limpiezas necesarias después de cada prueba si es necesario
    }

    @Test
    void comprarProductoConMonedaSuficiente() {
        Moneda moneda1000 = new Moneda1000();
        int seleccion = 1; // Por ejemplo, comprar una Coca-Cola

        try {
            expendedor.comprarProducto(moneda1000, seleccion);
            Producto producto = expendedor.getProducto();

            assertNotNull(producto);
            assertEquals("cocacola", producto.consumir());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            fail("No se esperaba una excepción: " + e.getClass().getName());
        }
    }


    @Test
    void comprarProductoConMonedaInsuficiente() {
        Moneda moneda500 = new Moneda500();
        int seleccion = 3;

        assertThrows(PagoInsuficienteException.class, () -> {
            expendedor.comprarProducto(moneda500, seleccion);
        });
    }

    @Test
    void getVuelto() {
        Moneda moneda1500 = new Moneda1500(); // Moneda de 1500 (suficiente para comprar cualquier producto)
        int seleccion = 1; // Por ejemplo, comprar una Coca-Cola

        try {
            // Comprar un producto con una moneda de 1500
            expendedor.comprarProducto(moneda1500, seleccion);
            Producto producto = expendedor.getProducto();
            Moneda vuelto = expendedor.getVuelto();

            assertEquals(100, vuelto.getValor());//ya que el vuelto se devuelve de a monedas de a 100
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            fail("No se esperaba una excepción: " + e.getClass().getName());
        }
    }
    @Test
    void getVueltoNull() {
        Moneda moneda1000 = new Moneda1000();
        int seleccion = 1; // Por ejemplo, comprar una Coca-Cola

        try {
            // Comprar un producto con una moneda de 1000
            expendedor.comprarProducto(moneda1000, seleccion);
            Producto producto = expendedor.getProducto();
            Moneda vuelto = expendedor.getVuelto();
            assertNull(vuelto);//es el vuelto esperado de un pago exacto
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            fail("No se esperaba una excepción: " + e.getClass().getName());
        }
    }


    @Test
    void comprarProductoSinMoneda() {
        int seleccion = 5; // Por ejemplo, comprar un Super8

        assertThrows(PagoIncorrectoException.class, () -> {
            expendedor.comprarProducto(null, seleccion);
        });
    }

    @Test
    void comprarProductoNumeroSeleccionNoExistente() {
        Moneda moneda1000 = new Moneda1000();
        int seleccion = 10; // Número de selección no existente

        assertThrows(NoHayProductoException.class, () -> {
            expendedor.comprarProducto(moneda1000, seleccion);
        });
    }


}
