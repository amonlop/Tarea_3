package org.example;

enum Precio {
    COCACOLA(1000), SPRITE(500), FANTA(800), SNICKERS(700), SUPER8(300);

    private final int precio;

    private Precio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

}
