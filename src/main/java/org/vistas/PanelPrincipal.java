package org.vistas;

import org.example.Expendedor;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
class PanelPrincipal extends JPanel {
    private Expendedor expend;
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal () {
        expend = new Expendedor(5);
        this.setLayout(new BorderLayout());
        this.exp = new PanelExpendedor (expend);
        this.com = new PanelComprador(expend);
        this.add(exp, BorderLayout.CENTER);
        this.add(com, BorderLayout.WEST);
        this.setBackground(Color.white);
    }

     
}
