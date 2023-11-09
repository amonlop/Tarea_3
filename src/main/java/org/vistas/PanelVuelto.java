package org.vistas;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.example.*;

class PanelVuelto extends JPanel {
    
    public PanelVuelto() {
        this.setLayout(new GridLayout(0, 1));
        this.add(new JButton("Aquí va el vuelto"));
        this.add(new JButton("Aquí va el vuelto"));
        this.add(new JButton("Aquí va el vuelto"));
    }

    public void dibujarMonedasVuelto(Graphics g, ArrayList<Moneda> monedasVuelto) {
        
    }

    public void dibujarProducto() {

    }
}
