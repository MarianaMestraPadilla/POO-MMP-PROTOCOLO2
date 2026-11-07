package Taller5;

class Persona {
    private String nombre; 
    int edad;              

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class PersonaComparacion {
    public static void main(String[] args) {
        Persona per = new Persona("Mariana", 20);

        System.out.println("Edad inicial (default): " + per.edad);
        per.edad = 21;
        System.out.println("Edad modificada directamente: " + per.edad);

        System.out.println("Nombre inicial (private vía get): " + per.getNombre());
        per.setNombre("Mariana Michell");
        System.out.println("Nombre modificado (private vía set): " + per.getNombre());
    }
}
