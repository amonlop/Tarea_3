package org.example;

enum Seleccion {
    COCACOLA(1), SPRITE(2), FANTA(3), SNICKERS(4), SUPER8(5);

    private int opcion;

    Seleccion(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }
}