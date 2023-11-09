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
        expend = new Expendedor(20);
        this.setLayout(new BorderLayout());
        this.exp = new PanelExpendedor (expend);
        this.com = new PanelComprador(expend);
        this.add(exp, BorderLayout.CENTER);
        this.add(com, BorderLayout.WEST);
        this.setBackground(Color.white);
        // Agregar un MouseListener para manejar eventos de clic del mouse en PanelPrincipal
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtener la posición del clic del mouse
                int x = e.getX();
                int y = e.getY();

                // Verificar si el clic del mouse ocurrió en PanelExpendedor
                if (exp.getBounds().contains(x, y)) {
                    // Procesar el clic del mouse en PanelExpendedor
                    exp.handleMouseClick(x, y);
                }

                // Verificar si el clic del mouse ocurrió en PanelComprador
                if (com.getBounds().contains(x, y)) {
                    // Procesar el clic del mouse en PanelComprador
                    //com.handleMouseClick(x, y);
                }

                // Llamar a repaint para actualizar la interfaz gráfica
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }



}
