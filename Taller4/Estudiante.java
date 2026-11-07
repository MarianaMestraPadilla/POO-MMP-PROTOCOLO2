package Taller4;
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    // 2. Métodos get y set con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        }
    }
}
