package org.vistas;

import org.example.*;
import org.example.Expendedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//a
class PanelComprador extends JPanel implements ActionListener {
    private JComboBox<String> opcionesProductos;
    private JLabel textoSeleccion;
    private JButton botonComprar;
    private JLabel textoMoneda;
    private JRadioButton moneda1000, moneda1500, moneda500, moneda100;
    private ButtonGroup monedas;
    private Seleccion eleccion;
    private int monedaElegida;
    private Comprador comprador;


    public PanelComprador(Expendedor exp) {
        this.setLayout(new BorderLayout());
        textoSeleccion = new JLabel("Selecciona un producto:");
        opcionesProductos = new JComboBox<>(new String[]{"Fanta", "CocaCola", "Sprite", "Snickers", "Super8"});
        botonComprar = new JButton("Comprar");
        textoMoneda = new JLabel("Inserta una moneda:");
        moneda1000 = new JRadioButton("1000");
        moneda1500 = new JRadioButton("1500");
        moneda500 = new JRadioButton("500");
        moneda100 = new JRadioButton("100");

        monedas = new ButtonGroup();
        monedas.add(moneda1500);
        monedas.add(moneda1000);
        monedas.add(moneda500);
        monedas.add(moneda100);

        botonComprar.addActionListener(this);

        JPanel contenedorPrincipal = new JPanel();
        contenedorPrincipal.setLayout(new BorderLayout());
        contenedorPrincipal.add(textoSeleccion, BorderLayout.NORTH);
        contenedorPrincipal.add(opcionesProductos, BorderLayout.CENTER);
        contenedorPrincipal.add(botonComprar, BorderLayout.SOUTH);

        JPanel contenedorMonedas = new JPanel();
        contenedorMonedas.setLayout(new GridLayout(0, 1));
        contenedorMonedas.add(textoMoneda);
        contenedorMonedas.add(moneda1500);
        contenedorMonedas.add(moneda1000);
        contenedorMonedas.add(moneda500);
        contenedorMonedas.add(moneda100);

        JPanel contenedorVuelto = new JPanel();
        contenedorVuelto.setLayout(new GridLayout(0, 1));
        contenedorVuelto.add(new JButton("Aquí va el vuelto"));
        contenedorVuelto.add(new JButton("Aquí va el vuelto"));
        contenedorVuelto.add(new JButton("Aquí va el vuelto"));

        this.add(contenedorPrincipal, BorderLayout.CENTER);
        this.add(contenedorMonedas, BorderLayout.NORTH);
        this.add(contenedorVuelto, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String producto = (String) opcionesProductos.getSelectedItem();
        Moneda mon;
       
        switch (producto) {
            case "CocaCola":
                eleccion = Seleccion.COCACOLA;
                break;
            case "Sprite":
                eleccion = Seleccion.SPRITE;
                break;
            case "Fanta":
                eleccion = Seleccion.FANTA;
                break;
            case "Snickers":
                eleccion = Seleccion.SNICKERS;
                break;
            case "Super8":
                eleccion = Seleccion.SUPER8;
                break;
            default:
                eleccion = null;
                break;
        }

        if (moneda1500.isSelected()) {
            monedaElegida = 1500;
            mon = new Moneda1500();
        } else if (moneda1000.isSelected()) {
            monedaElegida = 1000;
            mon = new Moneda1000();
        } else if (moneda500.isSelected()) {
            monedaElegida = 500;
            mon = new Moneda500();
        } else if (moneda100.isSelected()) {
            monedaElegida = 100;
            mon = new Moneda100();
        } else {
            mon = null;
        }


    }


    public void paint(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 90; i++) {
            //g.setColor(Color.RED);
            //g.drawRect(50+i*5, 400+5*i, 50, 50);
        }
    }
}