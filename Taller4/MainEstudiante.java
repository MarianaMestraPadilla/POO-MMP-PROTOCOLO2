package Taller4;

public class MainEstudiante {
   public static void main(String[] args) {
        Estudiante est = new Estudiante("Mariana", 17, 4.6);
        
        System.out.println("--- DATOS DEL ESTUDIANTE ---");
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Edad: " + est.getEdad());
        System.out.println("Nota Promedio: " + est.getNotaPromedio());
    }
}
