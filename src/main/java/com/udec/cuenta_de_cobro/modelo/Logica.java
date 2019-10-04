/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cuenta_de_cobro.modelo;

import com.udec.cuenta_de_cobro.controlador.Datos;

/**
 * @author alice
 */
public class Logica {
    private Datos datos;
    
    
    public Logica(Datos datos) {
        this.datos=datos;
    }
    
    public int calcular(){
        int resultado=0;
        String[] idiomas;
        idiomas=datos.getIdioma();
        if(datos.getDias()>=1){
            resultado=(datos.getDias()*Integer.parseInt(datos.getProfesion()));
            if(datos.getIdioma().length>0){
                for(int i=0; i<idiomas.length; i++){
                    resultado=resultado+Integer.parseInt(idiomas[i]);
                }
            }
            resultado=resultado+Integer.parseInt(datos.getUbicacion());
            
        }
        return resultado;
    }
}
