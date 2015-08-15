/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.gestion.controlador;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import edu.utpl.gestion.modelo.Persona;
import edu.utpl.gestion.negocio.PersonaService;

/**
 *
 * @author cesar
 */
@Named
@ViewScoped
public class TestController implements Serializable {

    @EJB
    PersonaService personaService;

    //static final Logger logger = Logger.getLogger(TestController.class.getName());

    public List<Persona> obtenerPersonas() {
        //logger.log(Level.INFO, "Ingreso a buscar personas");
        return personaService.findPersonas();
    }
}
