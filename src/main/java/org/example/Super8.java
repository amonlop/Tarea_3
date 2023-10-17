package org.example;

class Super8 extends Dulce {

    public Super8(int serie, int precio) {
        super(serie, precio);
    }

    @Override
    public String consumir() {
        return "super8";
    }
    
}
