package org.example;
abstract class Producto {
    private int serie;
    private int precio;
    public Producto(int serie, int precio){
        this.serie=serie;
        this.precio=precio;
    }
    public void SetProducto(int serie){
        this.serie=serie;
    }
    public int GetProducto(){
        return serie;
    }
    public void SetPrecio(int precio){
        this.precio=precio;
    }

    public int GetPrecio(){
        return precio;
    }
}
