package org.example;

abstract class Moneda {

    public Moneda() {
        
    }

    
    /** 
     * @return Moneda
     */
    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public abstract String toStringM();
    
}
