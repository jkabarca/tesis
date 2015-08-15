/*
 * Copyright 2014 wduck.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.utpl.gestion.controlador.seguridad;

import org.picketlink.annotations.PicketLink;
import org.picketlink.authentication.BaseAuthenticator;


/**
 *
 * @author wduck
 */
@PicketLink
//@Named(value = "authenticator")
public class AutenticadorPicketLinkController extends BaseAuthenticator {

    @Override
    public void authenticate() {
        setStatus(AuthenticationStatus.SUCCESS);
    }
   
    /* @Inject
    private DefaultLoginCredentials credentials;

    @EJB
    UsuarioService usuarioService;

    @Inject
    private SesionUsuario sesionUsuario;

    //@Inject
    //private FacesContext facesContext;
    @Override
    public void authenticate() {
        Usuario usuario = null;
        try {
            usuario = usuarioService.autenticar(credentials.getUserId(),
                    credentials.getPassword());
        } catch(PasswordExpiradoException ex ){
            Messages.addFlashGlobalError("La cuenta de usuario {0} ha expirado, por favor reingrese su clave nuevamente", credentials.getUserId());
            String url = "/faces/seguridad/cambiarContrasena.xhtml";
            JsfUtil.redirect(url);
        } catch (UsuarioNoExisteException | NombreUsuarioExisteException | UsuarioNoActivoException | UsuarioNoVigenteException ex) {
            Messages.addFlashGlobalError("Error en autenticación: {0}", ex.getMessage());            
            Logger.getLogger(AutenticadorPicketLinkController.class.getName()).log(Level.SEVERE, "Error en autenticación ", ex);
        } catch (EJBException ex) {
            Logger.getLogger(AutenticadorPicketLinkController.class.getName()).log(Level.SEVERE, "Error en autenticación EJB", ex);
            Messages.addFlashGlobalError("Error en autenticación EJB {0}", ex);            
        } catch (Exception ex) {
            Logger.getLogger(AutenticadorPicketLinkController.class.getName()).log(Level.SEVERE, "Error en autenticación GENERAL", ex);
            Messages.addFlashGlobalError("Error en autenticación GENERAL {0}", ex);
        }

        if (usuario != null) {
            setStatus(AuthenticationStatus.SUCCESS);
            setAccount(new User(usuario.getNombre()));
            UsuarioSimple usuarioSimple = usuarioService.encontrarUsuarioSimplePorNombre(usuario.getNombre());
            sesionUsuario.setUsuario(usuario);
            sesionUsuario.setUsuarioSimple(usuarioSimple);
            //sesionUsuario.getDireccionConeccion();
            String nombreEntidad = sesionUsuario.getUsuarioSimple().getNombreEntidad();
            Messages.addGlobal(new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Bienvenido <i>" + nombreEntidad + "</i>",
                    "El acceso actual se hizo a través de su cuenta de usuario: <b>" + usuario.getNombre() + "</b>"));
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
//                    "Bienvenido <i>" + nombreEntidad + "</i>",
//                    "El acceso actual se hizo a través de su cuenta de usuario: <b>" + usuario.getNombre() + "</b>"));
        } else {
            setStatus(AuthenticationStatus.FAILURE);
        }
    } */

}
