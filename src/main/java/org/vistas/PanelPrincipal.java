package org.vistas;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal () {
        this.setLayout(new BorderLayout());
        this.exp = new PanelExpendedor ();
        this.com = new PanelComprador();
        this.add(exp, BorderLayout.CENTER);
        this.add(com, BorderLayout.WEST);
        this.setBackground(Color.white);
    }
    public void paint (Graphics g) { 
        super.paint(g); 
        com.paint(g); 
        exp.paint(g); 
    }
     
}
