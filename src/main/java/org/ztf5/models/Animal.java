package org.ztf5.models;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="animales")
public class Animal {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idanimales")
    public int id;
    @Column(name="Nombre")
    public String nombre;
    @Column(name="Tipo")
    public String tipo;

    public enum Familia {
        CANIDOS, FELIDOS, REPTILES, LEPORIDAE, MUSTELIDS
    };

    @Column(name="Familia")
    public Familia familia;
    @Column(name="Género")
    public String genero;
    @Column(name="Fecha")
    public Date fecha;
    @Column(name="Imagen")
    public String img;

    public Animal() {
    }

    public Animal(int id, String nombre, String tipo, Familia familia, String genero, Date fecha, String img) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.familia = familia;
        this.genero = genero;
        this.fecha = fecha;
        this.img = img;

    }

    public Familia getFamilia() {
        return this.familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public int getId() {
        return this.id;
    }

    // public void setId(int id) {
    //     this.id = id;
    // }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
