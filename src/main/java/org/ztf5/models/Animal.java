package org.ztf5.models;

import java.util.*;

public class Animal {

    public int id;
    public String nombre;
    public String tipo;

    public enum familia {
        CANIDOS, FELIDOS, REPTILES, LEPORIDAE, MUSTELIDS
    };

    public String genero;
    public Date fecha;
    public String img;

    public Animal() {
    }

    public Animal(int id, String nombre, String tipo, String genero, Date fecha, String img) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.fecha = fecha;
        this.img = img;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Animal id(int id) {
        setId(id);
        return this;
    }

    public Animal nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Animal tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public Animal genero(String genero) {
        setGenero(genero);
        return this;
    }

    public Animal fecha(Date fecha) {
        setFecha(fecha);
        return this;
    }

    public Animal img(String img) {
        setImg(img);
        return this;
    }
}
