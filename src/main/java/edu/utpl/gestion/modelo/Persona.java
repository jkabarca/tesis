/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.gestion.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Miguel Tenezaca
 */
@Entity(name = "pft_persona")
public class Persona implements Serializable {

    @Id
    Integer entId;
    String entIdentificacion;
    String perGeneroId;
    String perNombre;
    String perPrimerNombre;
    String perSegundoNombre;
    String perPrimerApellido;
    String perSegundoApellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date perFechaNacimiento;
    String perUsuario;
    String perClave;
    Integer per_id_rol;
    Integer per_id_departamento;
    Integer per_id_seccion;
    Integer pra_id;
    Integer ecvId;

    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    public String getEntIdentificacion() {
        return entIdentificacion;
    }

    public void setEntIdentificacion(String entIdentificacion) {
        this.entIdentificacion = entIdentificacion;
    }

    public String getPerGeneroId() {
        return perGeneroId;
    }

    public void setPerGeneroId(String perGeneroId) {
        this.perGeneroId = perGeneroId;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerPrimerNombre() {
        return perPrimerNombre;
    }

    public void setPerPrimerNombre(String perPrimerNombre) {
        this.perPrimerNombre = perPrimerNombre;
    }

    public String getPerSegundoNombre() {
        return perSegundoNombre;
    }

    public void setPerSegundoNombre(String perSegundoNombre) {
        this.perSegundoNombre = perSegundoNombre;
    }

    public String getPerPrimerApellido() {
        return perPrimerApellido;
    }

    public void setPerPrimerApellido(String perPrimerApellido) {
        this.perPrimerApellido = perPrimerApellido;
    }

    public String getPerSegundoApellido() {
        return perSegundoApellido;
    }

    public void setPerSegundoApellido(String perSegundoApellido) {
        this.perSegundoApellido = perSegundoApellido;
    }

    public Date getPerFechaNacimiento() {
        return perFechaNacimiento;
    }

    public void setPerFechaNacimiento(Date perFechaNacimiento) {
        this.perFechaNacimiento = perFechaNacimiento;
    }

    public String getPerUsuario() {
        return perUsuario;
    }

    public void setPerUsuario(String perUsuario) {
        this.perUsuario = perUsuario;
    }

    public String getPerClave() {
        return perClave;
    }

    public void setPerClave(String perClave) {
        this.perClave = perClave;
    }

    public Integer getPer_id_rol() {
        return per_id_rol;
    }

    public void setPer_id_rol(Integer per_id_rol) {
        this.per_id_rol = per_id_rol;
    }

    public Integer getPer_id_departamento() {
        return per_id_departamento;
    }

    public void setPer_id_departamento(Integer per_id_departamento) {
        this.per_id_departamento = per_id_departamento;
    }

    public Integer getPer_id_seccion() {
        return per_id_seccion;
    }

    public void setPer_id_seccion(Integer per_id_seccion) {
        this.per_id_seccion = per_id_seccion;
    }

    public Integer getPra_id() {
        return pra_id;
    }

    public void setPra_id(Integer pra_id) {
        this.pra_id = pra_id;
    }

    public Integer getEcvId() {
        return ecvId;
    }

    public void setEcvId(Integer ecvId) {
        this.ecvId = ecvId;
    }

    public Persona(Integer entId, String entIdentificacion, String perGeneroId, String perNombre, String perPrimerNombre, String perSegundoNombre, String perPrimerApellido, String perSegundoApellido, Date perFechaNacimiento, String perUsuario, String perClave, Integer per_id_rol, Integer per_id_departamento, Integer per_id_seccion, Integer pra_id, Integer ecvId) {
        this.entId = entId;
        this.entIdentificacion = entIdentificacion;
        this.perGeneroId = perGeneroId;
        this.perNombre = perNombre;
        this.perPrimerNombre = perPrimerNombre;
        this.perSegundoNombre = perSegundoNombre;
        this.perPrimerApellido = perPrimerApellido;
        this.perSegundoApellido = perSegundoApellido;
        this.perFechaNacimiento = perFechaNacimiento;
        this.perUsuario = perUsuario;
        this.perClave = perClave;
        this.per_id_rol = per_id_rol;
        this.per_id_departamento = per_id_departamento;
        this.per_id_seccion = per_id_seccion;
        this.pra_id = pra_id;
        this.ecvId = ecvId;
    }

    public Persona() {
    }

}
