package Taller13.IvsC1;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10); 
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());

        Figura triangulo = new Triangulo(5, 10); 
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}

