package org.example;

class Comprador {
    private String sabor;
    private int vuelto;

    public Comprador(Moneda m, int eleccion, Expendedor exp) {
        Producto p = exp.comprarProducto(m, eleccion);

        Moneda moneda = null;
        while((moneda = exp.getVuelto()) != null) {
            this.vuelto += moneda.getValor();
        }  
        if(p != null) {
            this.sabor = p.consumir();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queConsumiste() {
        return sabor;
    }


}
