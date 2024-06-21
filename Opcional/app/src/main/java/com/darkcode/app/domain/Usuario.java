package com.darkcode.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Correo_Electronico")
    private String correo;

    @Column(name = "Pelicula")
    private String pelicula;

    @Column(name = "Fecha")
    private String fecha;

    @Column(name = "Hora")
    private String hora;

    @Column(name = "Cantidad_de_adultos")
    private int adultos;

    @Column(name = "Cantidad_de_niños")
    private int niños;

    @Column(name = "Preferencia_de_Asientos")
    private String preferencia;

    @Column(name = "Notificaciones")
    private String notificaciones;



    public Usuario(){}

    public Usuario(String nombre, String apellido, String correo, String pelicula, String fecha, String hora, int adultos, int niños,
            String preferencia, String notificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.hora = hora;
        this.adultos = adultos;
        this.niños = niños;
        this.preferencia = preferencia;
        this.notificaciones = notificaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPelicula(){
        return pelicula;
    }

    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getNiños() {
        return niños;
    }

    public void setNiños(int niños) {
        this.niños = niños;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(String notificaciones) {
        this.notificaciones = notificaciones;
    }
}