package Taller6.Ejercicio1;

public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        System.out.println("--- DETALLES DEL GERENTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}
