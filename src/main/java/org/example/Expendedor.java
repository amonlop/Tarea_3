package org.example;

class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;

    private Deposito<Moneda> monVu;

    private PrecioYSeleccion p_precio_seleccion;

    public Expendedor(int cantProductos) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();

        //numero de serie
        for(int i = 0; i < cantProductos; i++) {
            coca.addElemento(new CocaCola(i));
            sprite.addElemento(new Sprite(i+cantProductos));
            fanta.addElemento(new Fanta(i+2*cantProductos));
            snickers.addElemento(new Snickers(i+3*cantProductos));
            super8.addElemento(new Super8(i+4*cantProductos));
        }

    }

    public Producto comprarProducto(Moneda m, int seleccion){
        Producto producto = null;

        if(m == null) { // excepcion PagoIncorrecto
            return null;
        }

        switch (seleccion) {
            case 1:
                p_precio_seleccion = PrecioYSeleccion.COCACOLA;
                break;
            case 2:
                p_precio_seleccion = PrecioYSeleccion.SPRITE;
                break;
            case 3:
                p_precio_seleccion = PrecioYSeleccion.FANTA;
                break;
            case 4:
                p_precio_seleccion = PrecioYSeleccion.SNICKERS;
                break;
            case 5:
                p_precio_seleccion = PrecioYSeleccion.SUPER8;
                break;
            default:
                p_precio_seleccion = null;
                break;
        }

        if(p_precio_seleccion == null) { //numero de seleccion equivocado excepcion NOhayproducto
            return null;
        }

        if(m!=null && m.getValor() >= p_precio_seleccion.getPrecio()){
            switch (p_precio_seleccion.getOpcion()) {
                case 1:
                    producto = coca.getElemento();
                    break;
                case 2:
                    producto = sprite.getElemento();
                    break;
                case 3:
                    producto = fanta.getElemento();
                    break;
                case 4:
                    producto = snickers.getElemento();
                    break;
                case 5:
                    producto = super8.getElemento();
                    break;
                default:
                    producto = null;
                    break;

            }
            if(producto!=null){
                int n = (m.getValor() - p_precio_seleccion.getPrecio())/100;
                while (n>0) {
                    monVu.addElemento(new Moneda100());
                    n--;
                }
            }
        }

        if(producto == null) { //excepcion NOhayproducto
            monVu.addElemento(m);
        } else if(m.getValor() < p_precio_seleccion.getPrecio()) { // excepcion pagoinsuficiente
            monVu.addElemento(m);
        } 

        return producto;

    }

    public Moneda getVuelto() {
        return monVu.getElemento();
    }
}
