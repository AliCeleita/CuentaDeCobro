/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuenta_de_cobro.controlador;

import com.udec.cuenta_de_cobro.modelo.Logica;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Clase que se encarga de la inyección de dependencias con la otra vista y
 * mostrar resultado de la cuenta de cobro
 *
 * @author Angie Manrique, Alisson Celeita
 */
@Named
@RequestScoped
public class Resultado {

    /**
     * Variable del managed bean datos
     */
    @Inject
    private Datos datos;
    //variable que guarda los idiomas del trabajador
    private String idioma;
    //variable que guarda el resultado total de la cuenta de cobro
    private int resultado;
    //variable que se muestra cuando el trabajador selecciona algun idioma
    private String labelidi;

    /**
     * Método para obtener el label de idioma
     *
     * @return labelidi
     */
    public String getLabelidi() {
        return labelidi;
    }

    /**
     * Método para darle valor al label de idioam
     *
     * @param labelidi
     */
    public void setLabelidi(String labelidi) {
        this.labelidi = labelidi;
    }

    /**
     * Método para obtener los idiomas del trabajador
     *
     * @return
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Método para darle valor a los idiomas del trabajador
     *
     * @param idioma
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Método para obtener el resultado de la cuenta
     *
     * @return resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Método para darle valor al resultado de la cuenta
     *
     * @param resultado
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * Método que se ejecuta después del constructor encargado de los cálculos
     * realizados en lógica
     */
    @PostConstruct
    public void calculos() {

        Logica log = new Logica(datos);
        resultado = log.calcular();
        datos.setGenero(log.definirGenero());
        datos.setProfesion(log.definirProfesion());
        datos.setUbicacion(log.definirUbicacion());
        if (log.definirIdioma().equals("")) {
            labelidi = "";
        } else {
            labelidi = "Y sus idiomas: ";
            idioma=log.definirIdioma();
        }
    }

    /**
     * Método para obtener la instancia al managedBean datos
     *
     * @return datos
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     * Método para darle valor a las variables contenidas en datos
     *
     * @param datos
     */
    public void setDatos(Datos datos) {
        this.datos = datos;
    }
}
