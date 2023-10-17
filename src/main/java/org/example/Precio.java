package org.example;

enum Precio {
    COCACOLA(1, 1000), SPRITE(2,500), FANTA(3,800), SNICKERS(4,700), SUPER8(5,300);

    private int precio;
    private int opcion;

    private Precio(int opcion, int precio) {
        this.opcion = opcion;
        this.precio = precio;
    }

    //valor modificable?
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }

}
