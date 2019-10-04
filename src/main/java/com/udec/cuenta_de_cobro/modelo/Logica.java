/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuenta_de_cobro.modelo;

import com.udec.cuenta_de_cobro.controlador.Datos;

/**
 * Clase que contiene los cálculos del resultado de la cuenta y la lógica del
 * reporte
 *
 * @author Alisson Celeita, Angie Manrique
 */
public class Logica {

    /**
     * Variable de instancia del managedBean datos
     */
    private Datos datos;

    /**
     * Método constructor de la clase
     *
     * @param datos
     */
    public Logica(Datos datos) {
        this.datos = datos;
    }

    /**
     * Método que hace el cálculo del resultado total de la cuenta de cobro
     *
     * @return resultado
     */
    public int calcular() {
        int resultado = 0;
        String[] idiomas;
        idiomas = datos.getIdioma();
        if (datos.getDias() >= 1) {
            resultado = (datos.getDias() * Integer.parseInt(datos.getProfesion()));
            if (datos.getIdioma().length > 0) {
                for (int i = 0; i < idiomas.length; i++) {
                    resultado = resultado + Integer.parseInt(idiomas[i]);
                }
            }
            resultado = resultado + Integer.parseInt(datos.getUbicacion());
        }
        return resultado;
    }

    /**
     * Método para definir la profesión que tiene el trabajador
     *
     * @return profesion
     */
    public String definirProfesion() {
        String profesion = "";
        if (datos.getProfesion().equals("200000")) {
            profesion = "ingeniero";
        } else if (datos.getProfesion().equals("150000")) {
            profesion = "tecnólogo";
        } else if (datos.getProfesion().equals("100000")) {
            profesion = "técnico";
        } else if (datos.getProfesion().equals("50000")) {
            profesion = "auxiliar";
        }
        return profesion;
    }

    /**
     * Método para definir el género que tiene el trabajador
     *
     * @return genero
     */
    public String definirGenero() {
        String genero = "";
        if (datos.getGenero().equals("H")) {
            genero = "Señor";
        } else if (datos.getGenero().equals("M")) {
            genero = "Señora";
        }
        return genero;
    }

    /**
     * Método para definir la ubicación de residencia que tiene el trabajador
     *
     * @return ubicacion
     */
    public String definirUbicacion() {
        String ubi = "";
        if (datos.getUbicacion().equals("0")) {
            ubi = "Facatativá";
        } else if (datos.getUbicacion().equals("80000")) {
            ubi = "las afueras";
        }
        return ubi;
    }

    /**
     * Método para definir los idiomas que habla el trabajador
     *
     * @return idiomas
     */
    public String definirIdioma() {
        String idiomas = "";
        if (datos.getIdioma().length > 0) {
            for (String idi : datos.getIdioma()) {
                if (idi.equals("250000")) {
                    idiomas = idiomas + " Inglés ";
                } else if (idi.equals("330000")) {
                    idiomas = idiomas + " Francés ";
                } else if (idi.equals("500000")) {
                    idiomas = idiomas + " Alemán ";
                }
            }
        }
        return idiomas;
    }
}
