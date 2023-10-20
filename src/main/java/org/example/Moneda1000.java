package org.example;

class Moneda1000 extends Moneda implements Comparable<Moneda> {

    public Moneda1000() {
        super();
    }

    
    /** 
     * @return int
     */
    @Override
    public int getValor() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Serie: " + super.getSerie() + ", valor: " + getValor();
    }

    @Override
    public int compareTo(Moneda mon) {
        if(this.getValor() > mon.getValor()) {
            return 1;
        } else if(this.getValor() < mon.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
