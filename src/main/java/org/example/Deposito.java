package org.example;

import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> elementos;

    public Deposito() {
        elementos = new ArrayList<T>();
    }

    
    /** 
     * @param elemento
     */
    public void addElemento(T elemento) {
        elementos.add(elemento);
    }

    public T getElemento() {
        if(elementos.size() == 0) {
            return null;
        }
        return elementos.remove(0);
    }
}
