package Practica04;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario; // composición

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
        autores = new ArrayList<>();
        prestamos = new ArrayList<>();
        horario = new Horario("Lunes-Viernes", "08:00", "18:00");
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro); // agregación
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor); // agregación
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo p = new Prestamo(
                "10/05/2026",
                "17/05/2026",
                estudiante,
                libro
        );

        prestamos.add(p);
    }

    public void mostrarEstado() {

        System.out.println("Biblioteca: " + nombre);

        System.out.println("\nAutores:");
        for (Autor a : autores) {
            a.mostrarInfo();
        }

        System.out.println("\nLibros:");
        for (Libro l : libros) {
            System.out.println(l.getTitulo());
        }

        System.out.println("\nPrestamos:");
        for (Prestamo p : prestamos) {
            p.mostrarInfo();
        }

        System.out.println("\nHorario:");
        horario.mostrarHorario();
    }

    public void cerrarBiblioteca() {
        prestamos.clear();
        System.out.println("\nBiblioteca cerrada");
    }
}