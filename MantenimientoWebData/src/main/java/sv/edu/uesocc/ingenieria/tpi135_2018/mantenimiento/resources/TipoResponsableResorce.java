/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.resources;

import java.io.Serializable;
import java.util.List;
import javafx.scene.media.Media;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans.TipoResponsableFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.TipoResponsable;

/**
 *
 * @author joker
 */
@Path("tipoResponsable")
public class TipoResponsableResorce implements  Serializable{
    
    @EJB
    private TipoResponsableFacadeLocal trfl;
    
//    @GET
//    @Path("all")
//    @Produces({MediaType.APPLICATION_JSON})
//    public List<TipoResponsable> findAll
    
    
    
}