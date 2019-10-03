/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuenta_de_cobro.controlador;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author angie
 */
@Named(value = "resultado")
@RequestScoped
public class Resultado {

   @Inject
   private Datos datos;
    
    public Resultado() {
    }
    
    public String definirGenero(){
        if(datos.getGenero()== "H"){
            return "Señor";
        }else if (datos.getGenero()=="M"){
            return "Señora";
        }
        return "";
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
    
}