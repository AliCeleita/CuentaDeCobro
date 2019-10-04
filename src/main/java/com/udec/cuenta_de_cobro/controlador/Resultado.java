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
 *
 * @author angie
 */
@Named
@RequestScoped
public class Resultado {

   @Inject
   private Datos datos;
   private String label;
   private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
   @PostConstruct
    public void definirGenero(){
        if(datos.getGenero().equals("H")){
            label="Señor";
        }else if (datos.getGenero().equals("M")){
            label="Señora";
        }
        calculos();
    }
    
    public void calculos(){
        Logica calcular=new Logica(datos);
        resultado=calcular.calcular();
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
}