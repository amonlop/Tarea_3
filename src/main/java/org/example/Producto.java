package org.example;
abstract class Producto {
    private int serie;
    public Producto(int serie){
        this.serie=serie;
    }
    public void SetProducto(int serie){
        this.serie=serie;
    }
    public int GetProducto(){
        return serie;
    }
}
