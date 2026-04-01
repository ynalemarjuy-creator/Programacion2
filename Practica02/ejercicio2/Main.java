package Practica02.ejercicio2;

public class Main {
    public static void main(String[] args) {

        AlgebraVectorial a = new AlgebraVectorial(2, 4);
        AlgebraVectorial b = new AlgebraVectorial(1, 2);

        System.out.println("Perpendicular (a·b=0): " + a.perpendicular3(b));
        System.out.println("Paralela (a×b=0): " + a.paralela2(b));

        System.out.println("Perpendicular1: " + a.perpendicular1(b));
        System.out.println("Perpendicular2: " + a.perpendicular2(b));
        System.out.println("Perpendicular4: " + a.perpendicular4(b));

        System.out.println("Paralela1: " + a.paralela1(b));

        AlgebraVectorial proj = a.proyeccion(b);
        System.out.println("Proyección de a sobre b: " + proj);

        double comp = a.componente(b);
        System.out.println("Componente de a en b: " + comp);
    }
}
