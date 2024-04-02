package Punto2;

import java.util.ArrayList;
import java.util.List;

public class RegistroBiblioteca {
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;

    public RegistroBiblioteca() {
        libros = new ArrayList<>();
        autores = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado correctamente.");
    }

    public void registrarAutor(Autor autor) {
        autores.add(autor);
        System.out.println("Autor registrado correctamente.");
    }

    public void registrarPrestamo(Prestamo prestamo) {
        if (prestamo.getLibro().getEjemplares() > 0) {
            prestamo.getLibro().prestar();
            prestamos.add(prestamo);
            System.out.println("Préstamo registrado correctamente.");
        } else {
            System.out.println("No hay ejemplares disponibles de este libro.");
        }
    }

    public void registrarDevolucion(Prestamo prestamo) {
        prestamo.getLibro().devolver();
        prestamos.remove(prestamo);
        System.out.println("Devolución registrada correctamente.");
    }

    public void listarLibros() {
        System.out.println("Lista de libros registrados:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void listarAutores() {
        System.out.println("Lista de autores registrados:");
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }

    public void listarPrestamos() {
        System.out.println("Lista de préstamos activos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
