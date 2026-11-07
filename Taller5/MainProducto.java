package Taller5;

public class MainProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado Mecánico", 150000.0, 12);
        
        System.out.println("--- TALLER 5: EJERCICIO 1 ---");
        p.mostrarInfo();
        
        p.stock = 15;
        System.out.println("Stock actualizado (dentro del mismo paquete): " + p.stock);
    }
}
