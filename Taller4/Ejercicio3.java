package Taller4;

class PersonaPrivada {
    private String claveSecreta = "12345";

    public void mostrarClaveInternamente() {
        System.out.println("Acceso interno permitido (dentro de la misma clase): " + claveSecreta);
    }
}

class EmpleadoHermetico {
    private double salario;

    public EmpleadoHermetico(double salario) {
        this.salario = salario;
    }
    
    public void mostrarSalarioInterno() {
        System.out.println("Salario almacenado de forma privada (sin get/set externos): " + salario);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("--- TALLER 4: EJERCICIO 3 ---");

        PersonaPrivada p = new PersonaPrivada();
        p.mostrarClaveInternamente(); 
        
        /* 
         * NOTA:
         * Si intentaras escribir aquí: System.out.println(p.claveSecreta);
         * Java arrojaría un ERROR DE COMPILACIÓN porque 'claveSecreta' es private.
         */

        // Discusión sobre la falta de métodos get y set
        EmpleadoHermetico emp = new EmpleadoHermetico(2500000.0);
        emp.mostrarSalarioInterno();
        
        System.out.println("\nDiscusión Punto 2: Al no tener get ni set, el atributo salario " +
                           "queda totalmente blindado hacia el exterior, impidiendo que otras clases " +
                           "lo modifiquen o consulten directamente, lo que protege el dato pero limita la flexibilidad.");
    }
}
