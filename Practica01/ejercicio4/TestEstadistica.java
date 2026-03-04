package ejercicio4;
import java.util.Scanner;

public class TestEstadistica {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for(int i = 0; i < 10; i++){
            datos[i] = sc.nextDouble();
        }

        Estadistica e = new Estadistica(datos);

        System.out.printf("El promedio es %.2f%n", e.promedio());
        System.out.printf("La desviacion estandar es %.5f%n", e.desviacion());

        sc.close();
    }
}