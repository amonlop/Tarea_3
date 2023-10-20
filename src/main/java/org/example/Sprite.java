package org.example;

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    
    /** 
     * @return String
     */
    @Override
    public String consumir() {
        return "sprite";
    }
    
}
