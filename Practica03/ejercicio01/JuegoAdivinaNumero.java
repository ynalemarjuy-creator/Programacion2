package Practica03.ejercicio01;
import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }
    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        numeroAAdivinar = rand.nextInt(11);
        int numero;
        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            numero = sc.nextInt();
            if (numero == numeroAAdivinar) {
                System.out.println("¡Acertaste! 🎉");
                actualizaRecord();
                break;
            } else {
                boolean sigue = quitaVida();
                if (sigue) {
                    if (numero < numeroAAdivinar) {
                        System.out.println("El número es mayor");
                    } else {
                        System.out.println("El número es menor");
                    }
                } else {
                    break;
                }
            }
        }
    }
}