package Practica03.ejercicio2;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: el número debe ser IMPAR");
                return false;
            }
        }
        return false;
    }
}