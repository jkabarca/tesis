/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.gestion.negocio;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;
import edu.utpl.gestion.modelo.Persona;

/**
 *
 * @author cesar
 */
@Stateless
public class PersonaService {

    @EJB
    PersistenceService ps;

    public List<Persona> findPersonas() {

        Query q = ps.getEntityManager().createNativeQuery("{call get_all_persona()}", Persona.class);
        //q.setParameter("", null);
        return q.getResultList();
    }
}
