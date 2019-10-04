package com.udec.cuenta_de_cobro.controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alisson Celeita
 */
@Named
@RequestScoped
public class Datos {
    private String nombre;
    private String apellido;
    private String profesion;
    private String genero;
    private String[] idioma;
    private String ubicacion;
    private int dias;

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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public String irResultado(){
        return "resultado";
    }
}
