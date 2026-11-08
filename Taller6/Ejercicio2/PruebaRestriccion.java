package Taller6.Ejercicio2;

public class PruebaRestriccion {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Automóvil", "Toyota");
        
        System.out.println("--- PRUEBA DE RESTRICCIÓN PROTECTED ---");
        System.out.println("Objeto instanciado de tipo: " + miVehiculo.getClass().getSimpleName());

        /* 
         * PRUEBA DE RESTRICCIÓN:
         * Si intentaras acceder directamente a 'miVehiculo.marca' o 'miVehiculo.tipo'
         * desde una clase no relacionada, el compilador generaría un error bloqueante:
         * 
         * System.out.println(miVehiculo.marca); // Error: 'marca' has protected access
         * System.out.println(miVehiculo.tipo);  // Error: 'tipo' has protected access
         */
        
        System.out.println("Verificación: El modificador 'protected' bloquea el acceso externo no autorizado.");
    }
}
