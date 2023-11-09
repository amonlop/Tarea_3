package org.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import org.example.Expendedor;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelExpendedor extends JPanel {
    private Expendedor exp;
    private int initsize;

    public PanelExpendedor(Expendedor exp) {
        this.exp = exp;
        initsize = exp.MiraDeposito(1);
        this.setBackground(Color.CYAN);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 20;
        int y = 20;
        // Dibuja la cantidad de Cocacola
        dibujarProducto(g, x, y, exp.MiraDeposito(1), "Cocacola", Color.BLACK);
        y += 55;

        // Dibuja la cantidad de Sprite
        dibujarProducto(g, x, y, exp.MiraDeposito(2), "Sprite", Color.GREEN);
        y += 55; // Aumenta el espacio horizontal entre productos

        // Dibuja la cantidad de Fanta
        dibujarProducto(g, x, y, exp.MiraDeposito(3), "Fanta", Color.ORANGE);
        y += 55;

        // Dibuja la cantidad de Snickers
        dibujarProducto(g, x, y, exp.MiraDeposito(4), "Snickers", Color.YELLOW);
        y += 55;

        // Dibuja la cantidad de Super8
        dibujarProducto(g, x, y, exp.MiraDeposito(5), "Super8", Color.MAGENTA);
        y += 55;
        //dibuja las monedas
        paintMonVu(g, x, y);


    }

    // Método para dibujar un producto con la cantidad especificada
    private void dibujarProducto(Graphics g, int x, int y, int cantidad, String nombreProducto, Color color) {
        for (int i = 0; i < cantidad; i++) {
            g.setColor(color);
            g.fillRect(x, y, 50, 50);
            g.setColor(Color.WHITE);
            g.drawString(nombreProducto, x + 5, y + 15);

            // Dibujar el borde del rectángulo
            g.setColor(Color.WHITE);
            g.drawRect(x, y, 50, 50);

            x += 30; // Espacio horizontal entre productos
        }
    }
    // Método para dibujar un monedas con la cantidad especificada
    public void paintMonVu(Graphics g, int x, int y){
    }
    private void dibujarMonedas(Graphics g, int x, int y, int cantidad, String valor, Color color) {
        for (int i = 0; i < cantidad; i++) {
            g.setColor(color);
            g.fillOval(x, y, 50, 50);
            g.setColor(Color.WHITE);
            g.drawString(valor, x + 5, y + 15);

            // Dibujar el borde del círculo
            g.setColor(Color.WHITE);
            g.drawOval(x, y, 50, 50);

            x += 20; // Espacio horizontal entre productos
        }
    }
    public void handleMouseClick(int x, int y) {
        exp.rellenarVoids(initsize);
        // Después de procesar el clic, llama a repaint para actualizar la interfaz gráfica.
        repaint();
    }
}
