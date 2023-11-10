package org.vistas;

import org.example.Moneda;

import java.awt.*;
import java.util.ArrayList;

public class PaintMon {
    public PaintMon(Graphics g, int x, int y, ArrayList<Moneda> mon){
        for (int i = 0; i < mon.size(); i++) {
            switch(mon.get(i).getValor()){
                case 100:
                    dibujarMonedas(g, x, y ,"100", Color.lightGray);
                    break;
                case 500:
                    dibujarMonedas(g, x, y ,"500", Color.gray);
                    break;
                case 1000:
                    dibujarMonedas(g, x, y ,"1000", Color.darkGray);
                    break;
                case 1500:
                    dibujarMonedas(g, x, y ,"1500", Color.black);
                    break;
            }

            x =+ i*35;
        }
    }
    private void dibujarMonedas(Graphics g, int x, int y, String valor, Color color) {
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
        g.setColor(Color.WHITE);
        g.drawString(valor, x + 5, y + 30);

        // Dibujar el borde del círculo
        g.setColor(Color.WHITE);
        g.drawOval(x, y, 50, 50);
    }
}
