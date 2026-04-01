package Practica02.ejercicio3;

public class Main {
    public static void main(String[] args) {

        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        System.out.println("Suma: " + a.sumar(b));
        System.out.println("Escalar: " + a.multiplicar(2));
        System.out.println("Longitud: " + a.longitud());
        System.out.println("Normal: " + a.normalizar());
        System.out.println("Producto escalar: " + a.productoEscalar(b));
        System.out.println("Producto vectorial: " + a.productoVectorial(b));
        System.out.println("Perpendicular: " + a.esPerpendicular(b));
        System.out.println("Proyección de a sobre b: " + a.proyeccion(b));
    }
}
