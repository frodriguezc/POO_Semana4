public class Producto {

    private final String categoria;
    private final double precioOriginal;
    private double precioActual;
    private int diasEnInventario;

    public Producto(String categoria, double precio, int diasEnInventario) {
        this.categoria = categoria;
        this.precioOriginal = precio;
        this.precioActual = precio;
        this.diasEnInventario = diasEnInventario;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precio) {
        this.precioActual = precio;
    }

    public int getDiasEnInventario() {
        return diasEnInventario;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }
}
