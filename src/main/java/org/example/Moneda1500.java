package org.example;

class Moneda1500 extends Moneda implements Comparable<Moneda> {

    public Moneda1500() {
        super();
    }

    @Override
    public int getValor() {
        return 1500;
    }

    @Override
    public String toString() {
        return "Serie: " + super.getSerie() + ", valor: " + getValor();
    }

    @Override
    public int compareTo(Moneda mon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
    
}
