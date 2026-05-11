package Practica04;
public class Pagina {
    private int numero;
    private String contenido;

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    public void mostrarPagina() {
        System.out.println("Página " + numero + ": " + contenido);
    }
}
