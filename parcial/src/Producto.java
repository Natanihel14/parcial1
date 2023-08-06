class Producto implements ElementoVenta {
    private String nombre;
    private double precio;
    private String codigoBarras;
    private int cantidadStock;

    public Producto(String nombre, double precio, String codigoBarras, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadStock(int cantidad) {
        this.cantidadStock = cantidad;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
