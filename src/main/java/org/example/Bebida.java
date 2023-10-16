package org.example;

abstract class Bebida extends Producto {
    public Bebida(int serie, int precio) {
        super(serie, precio);
    }
    public abstract String beber();
}

