package Practica04;
public class Horario {
    private String dias;
    private String apertura;
    private String cierre;

    public Horario(String dias, String apertura, String cierre) {
        this.dias = dias;
        this.apertura = apertura;
        this.cierre = cierre;
    }

    public void mostrarHorario() {
        System.out.println(dias + " " + apertura + " - " + cierre);
    }
}