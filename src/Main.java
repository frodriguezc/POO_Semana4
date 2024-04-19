//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 1200000, 190);
        Producto smartphone = new Producto("Smartphone", 800000, 150);
        Producto camara = new Producto("Cámara digital", 400000, 210);
        Producto televisor = new Producto("Televisor", 1500000, 300);
        Producto cableUSB = new Producto("Accesorios", 19990, 400);
        Producto energetica = new Producto("Bebidas", 1900, 21);

        Inventario inventario = new Inventario();
        inventario.aplicarDescuentos(laptop);
        inventario.aplicarDescuentos(smartphone);
        inventario.aplicarDescuentos(camara);
        inventario.aplicarDescuentos(televisor);
        inventario.aplicarDescuentos(cableUSB);
        inventario.aplicarDescuentos(energetica);

        System.out.println("Precio original de " + laptop.getCategoria() + ": $" + laptop.getPrecioOriginal() + "\nPrecio ajustado de " + laptop.getCategoria() + ": $ " + laptop.getPrecioActual());
        System.out.println("Precio original de " + smartphone.getCategoria() + ": $" + smartphone.getPrecioOriginal() + "\nPrecio ajustado de " + smartphone.getCategoria() + ": $ " + smartphone.getPrecioActual());
        System.out.println("Precio original de " + camara.getCategoria() + ": $" + camara.getPrecioOriginal() + "\nPrecio ajustado de " + camara.getCategoria() + ": $ " + camara.getPrecioActual());
        System.out.println("Precio original de " + televisor.getCategoria() + ": $" + televisor.getPrecioOriginal() + "\nPrecio ajustado de " + televisor.getCategoria() + ": $ " + televisor.getPrecioActual());
        System.out.println("Precio original de " + cableUSB.getCategoria() + ": $" + cableUSB.getPrecioOriginal() + "\nPrecio ajustado de " + cableUSB.getCategoria() + ": $ " + cableUSB.getPrecioActual());
        System.out.println("Precio original de " + energetica.getCategoria() + ": $" + energetica.getPrecioOriginal() + "\nPrecio ajustado de " + energetica.getCategoria() + ": $ " + energetica.getPrecioActual());

    }
}