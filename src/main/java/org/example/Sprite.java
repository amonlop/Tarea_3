package org.example;

class Sprite extends Bebida {

    public Sprite(int serie, int precio) {
        super(serie, precio);
    }

    @Override
    public String consumir() {
        return "sprite";
    }
    
}
