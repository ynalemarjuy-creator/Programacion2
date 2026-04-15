package Practica03.ejercicio2;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: el número debe ser PAR");
                return false;
            }
        }
        return false;
    }
}