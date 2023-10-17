package org.example;

class Snickers extends Dulce {

    public Snickers(int serie, int precio) {
        super(serie, precio);
    }

    @Override
    public String consumir() {
        return "snickers";
    }
    
}
