package org.vistas;

import org.example.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
//a
class PanelComprador extends JPanel implements ActionListener {
    private JButton coca, sprite, fanta, snickers, super8, M100, M500, M1000, M1500;
    private ButtonGroup bebidaGroup,monedaGroup;
    private int eleccion, moneda;

    public PanelComprador() {
        bebidaGroup = new ButtonGroup();
        monedaGroup = new ButtonGroup();

        coca = new JButton("Coca");
        coca.addActionListener(this);
        bebidaGroup.add(coca);
        add(coca);

        sprite = new JButton("Sprite");
        sprite.addActionListener(this);
        bebidaGroup.add(sprite);
        add(sprite);

        fanta = new JButton("Fanta");
        fanta.addActionListener(this);
        bebidaGroup.add(fanta);
        add(fanta);

        snickers = new JButton("Snickers");
        snickers.addActionListener(this);
        bebidaGroup.add(snickers);
        add(snickers);

        super8 = new JButton("Super 8");
        super8.addActionListener(this);
        bebidaGroup.add(super8);
        add(super8);

        M100 = new JButton("100");
        M100.addActionListener(this);
        monedaGroup.add(M100);
        add(M100);

        M500 = new JButton("500");
        M500.addActionListener(this);
        monedaGroup.add(M500);
        add(M500);

        M1000 = new JButton("1000");
        M1000.addActionListener(this);
        monedaGroup.add(M1000);
        add(M1000);

        M1500 = new JButton("1500");
        M1500.addActionListener(this);
        monedaGroup.add(M1500);
        add(M1500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        if (bebidaGroup.isSelected(button.getModel())) {
            // Se ha seleccionado un botón de bebida
            switch (buttonText) {
                case "Coca":
                    eleccion = 1;
                    break;
                case "Sprite":
                    eleccion = 2;
                    break;
                case "Fanta":
                    eleccion = 3;
                    break;
                case "Snickers":
                    eleccion = 4;
                    break;
                case "Super 8":
                    eleccion = 5;
                    break;
            }
        }

        if (monedaGroup.isSelected(button.getModel())) {
            // Se ha seleccionado un botón de moneda
            switch (buttonText) {
                case "100":
                    moneda = 100;
                    break;
                case "500":
                    moneda = 500;
                    break;
                case "1000":
                    moneda = 1000;
                    break;
                case "1500":
                    moneda = 1500;
                    break;
            }
        }
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 90; i++) {
            g.setColor(Color.RED);
            g.drawRect(50+i*50, 50, 50, 50);
        }
    }
}