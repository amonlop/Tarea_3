package org.vistas;

import org.example.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;


//a
class PanelComprador extends JPanel implements ActionListener {
    private PanelProductos panelProductos;
    private PanelElegirMoneda panelMonedas;
    private PanelVuelto panelVuelto;
    private Seleccion eleccion;
    private Comprador comprador;
    private Expendedor exp;


    public PanelComprador(Expendedor exp) {
        this.exp = exp;
        this.setLayout(new BorderLayout());
        this.panelProductos = new PanelProductos();
        this.panelMonedas = new PanelElegirMoneda();
        this.panelVuelto = new PanelVuelto(exp);

        JButton botonComprar = panelProductos.getBotonComprar();
        botonComprar.addActionListener(this);

        this.add(panelProductos, BorderLayout.CENTER);
        this.add(panelMonedas, BorderLayout.NORTH);
        this.add(panelVuelto, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String producto = (String) panelProductos.getOpcionesProducto().getSelectedItem();
        Moneda mon;

        //ver el switch
        switch (Objects.requireNonNull(producto)) {
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


        if (panelMonedas.getMoneda1500().isSelected()) {
            mon = new Moneda1500();
        } else if (panelMonedas.getMoneda1000().isSelected()) {
            mon = new Moneda1000();
        } else if (panelMonedas.getMoneda500().isSelected()) {
            mon = new Moneda500();
        } else if (panelMonedas.getMoneda100().isSelected()) {
            mon = new Moneda100();
        } else {
            mon = null;
        }

        System.out.println(eleccion.getOpcion());


        try {
            this.comprador = new Comprador(mon, eleccion.getOpcion(), exp);
            panelVuelto.setEleccionProducto(eleccion.getOpcion());
        } catch (PagoIncorrectoException error1) {
            System.out.println(error1.getMessage());
        } catch (NoHayProductoException error2) {
            System.out.println(error2.getMessage());
        } catch (PagoInsuficienteException error3) {
            System.out.println(error3.getMessage());
        }


        panelVuelto.setEleccionProducto(eleccion.getOpcion());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        panelVuelto.paint(g);
    }
}