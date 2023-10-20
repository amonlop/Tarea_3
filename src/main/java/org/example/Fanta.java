package org.example;

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    
    /** 
     * @return String
     */
    @Override
    public String consumir() {
        return "fanta";
    }
    
}
