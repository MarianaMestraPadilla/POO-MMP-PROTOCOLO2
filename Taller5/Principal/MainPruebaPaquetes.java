package Taller5.Principal;

import Taller5.Vehiculos.Vehiculo;
import Taller5.Vehiculos.Moto;

public class MainPruebaPaquetes {
    public static void main(String[] args) {
        System.out.println("--- TALLER 5: EJERCICIO 2 (PRUEBA DE PAQUETES) ---");
        
        Class<Vehiculo> refVehiculo = Vehiculo.class;
        Class<Moto> refMoto = Moto.class;
        
        System.out.println("Clase importada exitosamente: " + refVehiculo.getName());
        System.out.println("Clase importada exitosamente: " + refMoto.getName());

        /* 
         * OBSERVACIÓN DE ERRORES DE COMPILACIÓN (Ejercicio 2 de la guía):
         * Si intentaras instanciar o acceder directamente a los miembros de paquete (default) 
         * desde este paquete externo ('principal'), obtendrías un error de compilación:
         * 
         * Vehiculo v = new Vehiculo(); // Falla si el constructor no es public
         * System.out.println(v.tipo);  // Error: 'tipo' tiene visibilidad de paquete y no es accesible aquí
         */
        
        System.out.println("\nConclusión: Los miembros con modificador de paquete (default) bloquean " +
                           "totalmente el acceso directo desde otros paquetes externos.");
    }
}
