package Practica04;
public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("UMSA");

        Autor autor1 = new Autor("Melany Yujra", "Boliviano");

        Libro libro1 = new Libro("Java Básico", "123");
        libro1.agregarPagina(1, "Introducción");
        libro1.agregarPagina(2, "Variables");

        Estudiante estudiante1 = new Estudiante("001", "Carlos");

        biblioteca.agregarAutor(autor1);
        biblioteca.agregarLibro(libro1);

        biblioteca.prestarLibro(estudiante1, libro1);

        biblioteca.mostrarEstado();

        biblioteca.cerrarBiblioteca();
    }
}