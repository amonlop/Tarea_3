package org.example;

class Moneda500 extends Moneda implements Comparable<Moneda> {

    public Moneda500() {
        super();
    }

    @Override
    public int getValor() {
        return 500;
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
