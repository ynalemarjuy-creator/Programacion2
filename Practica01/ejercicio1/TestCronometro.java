import java.util.Random;

public class TestCronometro {

    public static void main(String[] args) {

        int[] numeros = new int[100000];
        Random rand = new Random();

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(100000);
        }

        Cronometro c = new Cronometro();
        c.inicia();

    
        for(int i = 0; i < numeros.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < numeros.length; j++){
                if(numeros[j] < numeros[min]){
                    min = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = temp;
        }

        c.detener();

        System.out.println("Tiempo en milisegundos: " + c.lapsoDeTiempo());
    }
}