package Taller4;
public class Coche {
   private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        setVelocidadMaxima(velocidadMaxima);
    }
    
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Vehículo acelerado. Nueva velocidad máxima: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento de velocidad debe ser positivo.");
        }
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima >= 0) this.velocidadMaxima = velocidadMaxima;
        else System.out.println("Error: La velocidad máxima no puede ser negativa.");
    }
}
