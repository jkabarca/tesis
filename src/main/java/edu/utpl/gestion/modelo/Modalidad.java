/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.gestion.modelo;

/**
 *
 * @author Miguel Tenezaca
 */
public class Modalidad {
    
    Integer mod_id;
    String mod_codigo;
    String mod_nombre;

    public Integer getMod_id() {
        return mod_id;
    }

    public void setMod_id(Integer mod_id) {
        this.mod_id = mod_id;
    }

    public String getMod_codigo() {
        return mod_codigo;
    }

    public void setMod_codigo(String mod_codigo) {
        this.mod_codigo = mod_codigo;
    }

    public String getMod_nombre() {
        return mod_nombre;
    }

    public void setMod_nombre(String mod_nombre) {
        this.mod_nombre = mod_nombre;
    }

    public Modalidad() {
    }

    public Modalidad(Integer mod_id, String mod_codigo, String mod_nombre) {
        this.mod_id = mod_id;
        this.mod_codigo = mod_codigo;
        this.mod_nombre = mod_nombre;
    }
       
    
    
    
}
