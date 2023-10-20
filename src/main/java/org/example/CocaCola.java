package org.example;

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    
    /** 
     * @return String
     */
    @Override
    public String consumir() {
        return "cocacola";
    }
    
}
