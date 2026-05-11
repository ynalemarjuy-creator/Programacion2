package Practica04;
public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;

    private Estudiante estudiante;
    private Libro libro;
    public Prestamo(
            String fechaPrestamo,
            String fechaDevolucion,
            Estudiante estudiante,
            Libro libro
    ) {

        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;

        this.estudiante = estudiante;
        this.libro = libro;
    }

    public void mostrarInfo() {

        System.out.println(
                estudiante.getNombre()
                        + " prestó "
                        + libro.getTitulo()
                        + " | "
                        + fechaPrestamo
                        + " - "
                        + fechaDevolucion
        );
    }
}