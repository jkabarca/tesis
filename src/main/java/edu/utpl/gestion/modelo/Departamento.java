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
public class Departamento {
    Integer dep_id;
    String dep_nombre;
    String dep_descripcion;

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_nombre() {
        return dep_nombre;
    }

    public void setDep_nombre(String dep_nombre) {
        this.dep_nombre = dep_nombre;
    }

    public String getDep_descripcion() {
        return dep_descripcion;
    }

    public void setDep_descripcion(String dep_descripcion) {
        this.dep_descripcion = dep_descripcion;
    }

    public Departamento(Integer dep_id, String dep_nombre, String dep_descripcion) {
        this.dep_id = dep_id;
        this.dep_nombre = dep_nombre;
        this.dep_descripcion = dep_descripcion;
    }

    public Departamento() {
    }
    
    
    
}
