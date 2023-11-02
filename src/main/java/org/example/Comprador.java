package org.example;

class Comprador {
    private String sabor;
    private int vuelto;

    public Comprador(Moneda m, int eleccion, Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        exp.comprarProducto(m, eleccion);
        Producto p = exp.getProducto();

        Moneda moneda = null;
        while((moneda = exp.getVuelto()) != null) {
            this.vuelto += moneda.getValor();
        }  
        if(p != null) {
            this.sabor = p.consumir();
        }
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
