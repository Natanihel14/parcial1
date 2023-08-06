import java.util.ArrayList;

class CarritoDeCompras {
    private ArrayList<ElementoVenta> elementos = new ArrayList<>();

    public void agregarElemento(ElementoVenta elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(ElementoVenta elemento) {
        elementos.remove(elemento);
    }

    public double calcularTotal() {
        double total = 0;
        for (ElementoVenta elemento : elementos) {
            total += elemento.calcularPrecio();
        }
        return total;
    }

    public ArrayList<ElementoVenta> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<ElementoVenta> elementos) {
        this.elementos = elementos;
    }
}

