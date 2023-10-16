package org.example;

class Moneda100 extends Moneda implements Comparable {

    public Moneda100() {
        super();
    }

    @Override
    public int getValor() {
        return 100;
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
