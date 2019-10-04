package com.udec.cuenta_de_cobro.controlador;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * Esta clase sirve como encapsulamiento de la información para los datos
 * correspondientes de la cuenta de cobro
 *
 * @author Alisson Celeita, Angie Manrique
 */
@Named
@RequestScoped
public class Datos {

    //Esta variable guarda el nombre del trabajador

    private String nombre;
    //Esta variable guarda el apellido del trabajador
    private String apellido;
    //Esta variable guarda la profesión del trabajador
    private String profesion;
    //Esta variable guarda el género del trabajador
    private String genero;
    //Esta variable guarda los idiomas que habla el trabajador
    private String[] idioma;
    //Esta variable guarda la ubicacion de residencia del trabajador
    private String ubicacion;
    //Esta variable guarda la cantidad de dias de trabajo
    private int dias;

    /**
     * Método que obtiene el nombre
     *
     * @return nombre trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que le da valor al nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el apellido
     *
     * @return apellido trabajador
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método que le da valor al apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que obtiene la profesion
     *
     * @return profesion trabajador
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Método que le da valor a la profesión
     *
     * @param profesion
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * Método que obtiene el género
     *
     * @return género trabajador
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Método que le da valor al género
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método que obtiene los idiomas
     *
     * @return idiomas trabajador
     */
    public String[] getIdioma() {
        return idioma;
    }

    /**
     * Método que le da valor al idioma
     *
     * @param idioma
     */
    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    /**
     * Método que obtiene la ubicación
     *
     * @return ubicación trabajador
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Método que le da valor a la ubicación
     *
     * @param ubicacion
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Método que obtiene la cantidad de dias trabajados
     *
     * @return dias trabajo
     */
    public int getDias() {
        return dias;
    }

    /**
     * Método que le da valor a los dias
     *
     * @param dias
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * Método para dirigirse a la otra vista
     *
     * @return vista resultado
     */
    public String irResultado() {
        return "resultado";
    }
}
