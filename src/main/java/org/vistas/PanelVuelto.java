package org.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.example.*;

class PanelVuelto extends JPanel {
    private int eleccionProducto;
    private Expendedor exp;

    public PanelVuelto(Expendedor exp) {
        this.exp = exp;
        this.setBackground(Color.RED);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 20;
        int y = 20;

        dibujarProducto(g, x, y, this.eleccionProducto);
        x += 20;

        new PaintMon(g, x, y, exp.getMonedasVuelto());

    }

    public void setEleccionProducto(int eleccion) {
        eleccionProducto = eleccion;
    }

    public void dibujarProducto(Graphics g,int x, int y, int producto) {
        String queProducto = "";
        Color color = Color.white; 
        switch (producto) {
            case 1:
                queProducto = "CocaCola";
                color = Color.BLACK;
                break;
            case 2:
                queProducto = "Sprite";
                color = Color.GREEN;
                break;
            case 3:
                queProducto = "Fanta";
                color = Color.ORANGE;
                break;
            case 4:
                queProducto = "Snickers";
                color = Color.YELLOW;
                break;
            case 5:
                queProducto = "Super8";
                color = Color.MAGENTA;
                break;
            default:
                break;
        }

        g.setColor(color);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.WHITE);
        g.drawString(queProducto, x + 5, y + 15);

        // Dibujar el borde del rectángulo
        g.setColor(Color.WHITE);
        g.drawRect(x, y, 50, 50);

    }

}
