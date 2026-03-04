package ejercicio4;
import java.util.Scanner;

public class EstadisticaModular {

    public static double promedio(double[] datos){
        double suma = 0;
        for(double x : datos){
            suma += x;
        }
        return suma / datos.length;
    }

    public static double desviacion(double[] datos){
        double prom = promedio(datos);
        double suma = 0;

        for(double x : datos){
            suma += Math.pow(x - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for(int i = 0; i < 10; i++){
            datos[i] = sc.nextDouble();
        }

        System.out.printf("El promedio es %.2f%n", promedio(datos));
        System.out.printf("La desviacion estandar es %.5f%n", desviacion(datos));

        sc.close();
    }
}