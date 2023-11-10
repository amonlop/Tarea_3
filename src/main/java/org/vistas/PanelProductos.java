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
        this.setLayout(new BorderLayout());
        this.add(textoSeleccion, BorderLayout.NORTH);
        this.add(opcionesProductos, BorderLayout.CENTER);
        this.add(botonComprar, BorderLayout.SOUTH);
    }

    public JComboBox<String> getOpcionesProducto() {
        return opcionesProductos;
    }

    public JButton getBotonComprar() {
        return botonComprar;
    }

}

