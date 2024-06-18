package com.darkcode.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_LIBRO")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "genero")
    private String genero;

    @Column(name = "fecha_publicacion")
    private String fechaPublicacion;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "cantidad_disponible", nullable = false)
    private int cantidadDisponible;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "imagen_portada")
    private String imagenPortada;

    public Libro(Long id, String titulo, String autor, String genero, String fechaPublicacion, String isbn,
                 int cantidadDisponible, String descripcion, String imagenPortada) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.cantidadDisponible = cantidadDisponible;
        this.descripcion = descripcion;
        this.imagenPortada = imagenPortada;
    }

    public Libro() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }
}