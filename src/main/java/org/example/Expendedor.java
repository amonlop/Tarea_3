package org.example;

public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;

    private Deposito<Moneda> monVu;
    private Deposito<Moneda> monVuGUI;

    private DepositoProducto productoUnico;

    public Expendedor(int cantProductos) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();
        monVuGUI = new Deposito<>();

        //numero de serie
        for(int i = 0; i < cantProductos; i++) {
            coca.addElemento(new CocaCola(i));
            sprite.addElemento(new Sprite(i+cantProductos));
            fanta.addElemento(new Fanta(i+2*cantProductos));
            snickers.addElemento(new Snickers(i+3*cantProductos));
            super8.addElemento(new Super8(i+4*cantProductos));
        }

    }

    
    public void comprarProducto(Moneda m, int seleccion) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException { 
        Producto producto = null;
        Precio precio;
        Seleccion opcion;
        

        if(m == null)  { // excepcion PagoIncorrecto
            throw new PagoIncorrectoException("No se ingresó una moneda");
        }

        switch (seleccion) {
            case 1:
                opcion = Seleccion.COCACOLA;
                precio = Precio.COCACOLA;
                break;
            case 2:
                opcion = Seleccion.SPRITE;
                precio = Precio.SPRITE;

                break;
            case 3:
                opcion = Seleccion.FANTA;
                precio = Precio.FANTA;

                break;
            case 4:
                opcion = Seleccion.SNICKERS;
                precio = Precio.SNICKERS;

                break;
            case 5:
                opcion = Seleccion.SUPER8;
                precio = Precio.SUPER8;

                break;
            default:
                opcion = null;
                precio = null;
                break;
        }

        if(opcion == null) { //numero de seleccion equivocado excepcion NOhayproducto
            monVu.addElemento(m);
            throw new NoHayProductoException("Número de selección no existe");
        }

        if(m!=null && m.getValor() >= precio.getPrecio()){
            switch (opcion.getOpcion()) {
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
                int n = (m.getValor() - precio.getPrecio())/100;
                while (n>0) {
                    monVu.addElemento(new Moneda100());
                    n--;
                }
            }
        }


        if(m.getValor() < precio.getPrecio()){ // excepcion pagoinsuficiente
            monVu.addElemento(m);
            throw new PagoInsuficienteException("Dinero insuficiente"); 
        }
        if(producto == null) { //excepcion NOhayproducto
            monVu.addElemento(m);
            throw new NoHayProductoException("No hay más producto: " + precio.name());
        }

        this.productoUnico = new DepositoProducto(producto);

    }

    public Moneda getVuelto() {
        return monVu.getElemento();
    }

    public Producto getProducto() {
        return productoUnico.getProducto();
    }
    public int MiraDeposito(int CualProducto) {
        int Cantidad=0;
        switch (CualProducto) {
            case 1:
                Cantidad = coca.size();
                break;
            case 2:
                Cantidad = sprite.size();
                break;
            case 3:
                Cantidad = fanta.size();
                break;
            case 4:
                Cantidad = snickers.size();
                break;
            case 5:
                Cantidad = super8.size();
                break;
        }
        return Cantidad;
    }
}
