package org.example;

class Moneda1000 extends Moneda implements Comparable {

    public Moneda1000() {
        super();
    }

    @Override
    public int getValor() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Serie: " + super.getSerie() + ", valor: " + getValor();
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
