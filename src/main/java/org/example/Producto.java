package org.example;

abstract class Producto {
    private int serie;
    private int precio;

    public Producto(int serie, int precio){
        this.serie=serie;
        this.precio=precio;
    }
    // public void SetProducto(int serie){
    //     this.serie=serie;
    // }
    public int getSerie(){
        return serie;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }

    public int getPrecio(){
        return precio;
    }

    public abstract String consumir();
    
}
