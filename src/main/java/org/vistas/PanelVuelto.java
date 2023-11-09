package org.vistas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class PanelVuelto extends JPanel {
    
    public PanelVuelto() {
        this.setLayout(new GridLayout(0, 1));
        this.add(new JButton("Aquí va el vuelto"));
        this.add(new JButton("Aquí va el vuelto"));
        this.add(new JButton("Aquí va el vuelto"));
    }
}
