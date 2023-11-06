package org.vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        super();
        this.setTitle("Simulador");
        this.setLayout(new GridLayout());

        this.add(new PanelPrincipal()); 

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,450);
        this.setVisible(true); 
    } 
}
