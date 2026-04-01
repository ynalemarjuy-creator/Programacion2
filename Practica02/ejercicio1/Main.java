package Practica02.ejercicio1;

public class Main {
    public static void main(String[] args) {

        MiPunto p1 = new MiPunto();          
        MiPunto p2 = new MiPunto(10, 30.5);

        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);

        double d1 = p1.distancia(p2);
        System.out.println("Distancia entre puntos: " + d1);

        double d2 = p1.distancia(10, 30.5);
        System.out.println("Distancia usando coordenadas: " + d2);
    }
}