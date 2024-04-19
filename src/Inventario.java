public class Inventario {

    private static final double DESCUENTO_TECNOLOGIA_6_MESES = 0.75;
    private static final double DESCUENTO_TECNOLOGIA_MENOS_6_MESES = 0.90;
    private static final double DESCUENTO_ACCESORIOS_1_AÑO = 0.85;
    private static final int UMBRAL_DIAS_TECNOLOGIA = 180;
    private static final int UMBRAL_DIAS_ACCESORIOS = 365;

    public void aplicarDescuentos(Producto producto) {
        switch (producto.getCategoria()) {
            case "Laptop":
                aplicarDescuentoTecnologia(producto, 1000000, UMBRAL_DIAS_TECNOLOGIA);
                break;
            case "Smartphone":
                aplicarDescuentoTecnologia(producto, 800000, UMBRAL_DIAS_TECNOLOGIA);
                break;
            case "Cámara digital":
                aplicarDescuentoTecnologia(producto, 400000, UMBRAL_DIAS_TECNOLOGIA);
                break;
            case "Televisor":
                aplicarDescuentoTecnologia(producto, 1500000, UMBRAL_DIAS_TECNOLOGIA);
                break;
            case "Accesorios":
                aplicarDescuentoAccesorios(producto);
                break;
            default:
                System.out.println("Categoría " + producto.getCategoria() + " no reconocida. No se aplica descuento.");
                break;
        }
    }

    private void aplicarDescuentoTecnologia(Producto producto, double precioBase, int umbralDias) {
        if (producto.getDiasEnInventario() > umbralDias) {
            producto.setPrecioActual(precioBase * DESCUENTO_TECNOLOGIA_6_MESES);
        } else {
            producto.setPrecioActual(precioBase * DESCUENTO_TECNOLOGIA_MENOS_6_MESES);
        }
    }

    private void aplicarDescuentoAccesorios(Producto producto) {
        if (producto.getDiasEnInventario() > UMBRAL_DIAS_ACCESORIOS) {
            producto.setPrecioActual(producto.getPrecioActual() * DESCUENTO_ACCESORIOS_1_AÑO);
        }
    }
}
