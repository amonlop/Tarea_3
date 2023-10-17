package org.example;

class Fanta extends Bebida {

    public Fanta(int serie, int precio) {
        super(serie, precio);
    }

    @Override
    public String consumir() {
        return "fanta";
    }
    
}
