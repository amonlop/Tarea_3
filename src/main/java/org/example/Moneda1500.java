package org.example;

public class Moneda1500 extends Moneda implements Comparable<Moneda> {

    public Moneda1500() {
        super();
    }

    
    /** 
     * @return int
     */
    @Override
    public int getValor() {
        return 1500;
    }

    @Override
    public String toStringM() {
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
