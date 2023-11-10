package org.vistas;

import java.awt.BorderLayout;

import javax.swing.*;

class PanelProductos extends JPanel {
    private JLabel textoSeleccion;
    private JComboBox<String> opcionesProductos;
    private JButton botonComprar;

    public PanelProductos() {
        textoSeleccion = new JLabel("Selecciona un producto:");
        opcionesProductos = new JComboBox<>(new String[]{"Fanta", "CocaCola", "Sprite", "Snickers", "Super8"});
        botonComprar = new JButton("Comprar");
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(textoSeleccion);
        this.add(opcionesProductos);
        this.add(botonComprar);
    }

    public JComboBox<String> getOpcionesProducto() {
        return opcionesProductos;
    }

    public JButton getBotonComprar() {
        return botonComprar;
    }
    
}
