package org.example;

enum PrecioYSeleccion {
    COCACOLA(1, 1000), SPRITE(2,500), FANTA(3,800), SNICKERS(4,700), SUPER8(5,300);

    private final int precio;
    private final int opcion;

    private PrecioYSeleccion(int opcion, int precio) {
        this.opcion = opcion;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public int getOpcion() {
        return opcion;
    }

}
