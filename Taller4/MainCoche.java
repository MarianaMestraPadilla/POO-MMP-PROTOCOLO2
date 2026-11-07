package Taller4;

public class MainCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Chevrolet", "Onix", 120.0);
        
        miCoche.acelerar(15.5);
        System.out.println("Velocidad máxima actualizada: " + miCoche.getVelocidadMaxima() + " km/h");

        /* 
         * 3. OBSERVACIÓN DE ERRORES DE COMPILACIÓN:
         * Si intentas ejecutar las siguientes líneas, Java generará un error de compilación
         * porque las variables son 'private' y no se pueden leer ni modificar directamente:
         * 
         * System.out.println(miCoche.marca); // Error: marca tiene acceso privado
         * miCoche.velocidadMaxima = 200.0;   // Error: velocidadMaxima tiene acceso privado
         */
        System.out.println("Prueba del Ejercicio 2 completada: Acceso directo bloqueado por el modificador private.");
    }
}
