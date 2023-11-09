package org.example;

import java.util.ArrayList;

public class Comprador {
    private String sabor;
    private int vuelto;

    public Comprador(Moneda m, int eleccion, Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        exp.comprarProducto(m, eleccion);
        Producto p = getProductoExp(exp);

        // Moneda moneda = null;
        // while((moneda = exp.getVuelto()) != null) {
        //     this.vuelto += moneda.getValor();
        // }  
        if(p != null) {
            this.sabor = p.consumir();
        }
    }

    public Producto getProductoExp(Expendedor exp) {
        return exp.getProducto();
    }

    public ArrayList<Moneda> getMonedasVueltoC(Expendedor exp) {
        return exp.getMonedasVuelto();
    }

    
    /** 
     * @return int
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    
    /** 
     * @return String
     */
    public String queConsumiste() {
        return sabor;
    }


}
