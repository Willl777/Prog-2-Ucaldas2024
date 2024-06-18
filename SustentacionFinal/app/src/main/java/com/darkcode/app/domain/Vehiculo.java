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
@Table(name = "Vehiculo")

public class Vehiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Marca")
    private String Marca;

    @Column(name = "Modelo", nullable = false)
    private int Modelo;

    @Column(name = "Año", nullable = false)
    private int Año;

    @Column(name = "Color")
    private String Color;

    @Column(name = "Precio", nullable = false)
    private int Precio;

    @Column(name = "Tipo")
    private String Tipo;

    @Column(name = "Concesionaria")
    private String Concesionaria;




    public Vehiculo(Long id, String Marca, int Modelo, int Año, String Color , int Precio,
    String Tipo, String Concesionaria) {
this.id = id;
this.Marca = Marca;
this.Modelo = Modelo;
this.Año = Año;
this.Color = Color;
this.Precio = Precio;
this.Tipo = Tipo;
this.Concesionaria = Concesionaria;
}




    public Long getId() {
        return id;
    }




    public void setId(Long id) {
        this.id = id;
    }




    public String getMarca() {
        return Marca;
    }




    public void setMarca(String marca) {
        Marca = marca;
    }




    public int getModelo() {
        return Modelo;
    }




    public void setModelo(int modelo) {
        Modelo = modelo;
    }




    public int getAño() {
        return Año;
    }




    public void setAño(int año) {
        Año = año;
    }




    public String getColor() {
        return Color;
    }




    public void setColor(String color) {
        Color = color;
    }




    public int getPrecio() {
        return Precio;
    }




    public void setPrecio(int precio) {
        Precio = precio;
    }




    public String getTipo() {
        return Tipo;
    }




    public void setTipo(String tipo) {
        Tipo = tipo;
    }




    public String getConcesionaria() {
        return Concesionaria;
    }




    public void setConcesionaria(String concesionaria) {
        Concesionaria = concesionaria;
    }



    
}
