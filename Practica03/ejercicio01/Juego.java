package Practica03.ejercicio01;
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    private int vidasIniciales;
    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.vidasIniciales = vidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        this.numeroDeVidas = vidasIniciales;
        System.out.println("---- Nueva partida ----");
    }
    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
        System.out.println("Record actual: " + record);
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas");
        if (numeroDeVidas > 0) {
            return true;
        } else {
            System.out.println("Te quedaste sin vidas");
            return false;
        }
    }
}
