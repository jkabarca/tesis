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
public class Programa {
    Integer pra_id;
    String pra_codigo;
    String pra_nombre;
    Integer mod_id;
    Integer nac_id;

    public Integer getPra_id() {
        return pra_id;
    }

    public void setPra_id(Integer pra_id) {
        this.pra_id = pra_id;
    }

    public String getPra_codigo() {
        return pra_codigo;
    }

    public void setPra_codigo(String pra_codigo) {
        this.pra_codigo = pra_codigo;
    }

    public String getPra_nombre() {
        return pra_nombre;
    }

    public void setPra_nombre(String pra_nombre) {
        this.pra_nombre = pra_nombre;
    }

    public Integer getMod_id() {
        return mod_id;
    }

    public void setMod_id(Integer mod_id) {
        this.mod_id = mod_id;
    }

    public Integer getNac_id() {
        return nac_id;
    }

    public void setNac_id(Integer nac_id) {
        this.nac_id = nac_id;
    }

    public Programa(Integer pra_id, String pra_codigo, String pra_nombre, Integer mod_id, Integer nac_id) {
        this.pra_id = pra_id;
        this.pra_codigo = pra_codigo;
        this.pra_nombre = pra_nombre;
        this.mod_id = mod_id;
        this.nac_id = nac_id;
    }

    public Programa() {
    }
    
    
    
}
