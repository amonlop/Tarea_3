package org.example;

class CocaCola extends Bebida {

    public CocaCola(int serie, int precio) {
        super(serie, precio);
    }

    @Override
    public String consumir() {
        return "cocacola";
    }
    
}
