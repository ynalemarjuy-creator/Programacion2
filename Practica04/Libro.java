package Practica04;
import java.util.ArrayList;
import java.util.List;
public class Libro {

    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        paginas = new ArrayList<>();
    }

    public void agregarPagina(int numero, String contenido) {
        paginas.add(new Pagina(numero, contenido)); // composición
    }

    public void leer() {
        System.out.println("Libro: " + titulo);

        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }

    public String getTitulo() {
        return titulo;
    }
}