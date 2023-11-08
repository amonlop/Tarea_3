package org.vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        super();
        this.setTitle("Simulador");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new PanelPrincipal());
        this.setSize(900,500);
        this.setVisible(true); 
    } 
}
