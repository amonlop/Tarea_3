package org.vistas;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal () {
        this.exp = new PanelExpendedor ();
        this.com = new PanelComprador();
        this.setBackground(Color.white);
    }
    public void paint (Graphics g) { 
        super.paint(g); 
        com.paint(g); 
        exp.paint(g); 
    } 
}
