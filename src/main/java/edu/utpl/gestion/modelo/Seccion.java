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
public class Seccion {
    Integer sec_id;  
    String sec_nombre;
    String sec_despcripcion;
    String sec_id_departamento;

    public Integer getSec_id() {
        return sec_id;
    }

    public void setSec_id(Integer sec_id) {
        this.sec_id = sec_id;
    }

    public String getSec_nombre() {
        return sec_nombre;
    }

    public void setSec_nombre(String sec_nombre) {
        this.sec_nombre = sec_nombre;
    }

    public String getSec_despcripcion() {
        return sec_despcripcion;
    }

    public void setSec_despcripcion(String sec_despcripcion) {
        this.sec_despcripcion = sec_despcripcion;
    }

    public String getSec_id_departamento() {
        return sec_id_departamento;
    }

    public void setSec_id_departamento(String sec_id_departamento) {
        this.sec_id_departamento = sec_id_departamento;
    }

    public Seccion(Integer sec_id, String sec_nombre, String sec_despcripcion, String sec_id_departamento) {
        this.sec_id = sec_id;
        this.sec_nombre = sec_nombre;
        this.sec_despcripcion = sec_despcripcion;
        this.sec_id_departamento = sec_id_departamento;
    }

    public Seccion() {
    }
    
    
    
}
