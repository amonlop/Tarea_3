package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DepositoTest {
    private Deposito<String> deposito;

    @BeforeEach
    public void setUp() {
        deposito = new Deposito<>();
    }

    @Test
    public void testAddElemento() {
        deposito.addElemento("Elemento 1");
        deposito.addElemento("Elemento 2");
        deposito.addElemento("Elemento 3");
        // Verifica que los elementos se agregaron correctamente.
        assertEquals("Elemento 1", deposito.getElemento());
        assertEquals("Elemento 2", deposito.getElemento());
        assertEquals("Elemento 3", deposito.getElemento());
    }


    @Test
    public void testGetElemento() {
        deposito.addElemento("Elemento 1");
        deposito.addElemento("Elemento 2");

        String elemento1 = deposito.getElemento();
        String elemento2 = deposito.getElemento();
        String elemento3 = deposito.getElemento(); // Debería devolver null ya que no hay más elementos.

        // Verifica que los elementos se devuelvan en el orden correcto.
        assertEquals("Elemento 1", elemento1);
        assertEquals("Elemento 2", elemento2);
        assertNull(elemento3); // Debería ser null.
    }
}