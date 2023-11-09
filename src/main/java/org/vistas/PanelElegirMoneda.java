package org.vistas;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class PanelElegirMoneda extends JPanel{
    private JLabel textoMoneda;
    private JRadioButton moneda1000, moneda1500, moneda500, moneda100;
    private ButtonGroup botonesMoneda;

    
    public PanelElegirMoneda() {
        textoMoneda = new JLabel("Inserta una moneda:");
        moneda1000 = new JRadioButton("1000");
        moneda1500 = new JRadioButton("1500");
        moneda500 = new JRadioButton("500");
        moneda100 = new JRadioButton("100");
        botonesMoneda = new ButtonGroup();
        botonesMoneda.add(moneda1500);
        botonesMoneda.add(moneda100);
        botonesMoneda.add(moneda1000);
        botonesMoneda.add(moneda500);

        this.setLayout(new GridLayout(0, 1));
        this.add(textoMoneda);
        this.add(moneda1500);
        this.add(moneda1000);
        this.add(moneda500);
        this.add(moneda100);
    }

    public ButtonGroup getBotonesMoneda() {
        return botonesMoneda;
    }

    public JRadioButton getMoneda1000() {
        return moneda1000;
    }

    public JRadioButton getMoneda1500() {
        return moneda1500;
    }

    public JRadioButton getMoneda100() {
        return moneda100;
    }

    public JRadioButton getMoneda500() {
        return moneda500;
    }

}
