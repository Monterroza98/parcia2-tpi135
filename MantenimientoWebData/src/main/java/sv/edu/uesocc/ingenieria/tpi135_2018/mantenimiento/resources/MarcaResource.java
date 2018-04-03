/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans.MarcaFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Marca;

/**
 *
 * @author joker
 */
@Path("marca")
public class MarcaResource implements Serializable{
    
    @EJB
    private MarcaFacadeLocal mfl;

    @GET
    @Path("all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Marca> findAll() {
        List lista=null;
        try {
            lista = mfl.findAll();
            if (lista!=null) {
                return lista;
            }
        } catch (Exception e) {
        }finally{
            lista=new ArrayList();
        }
        
        return lista;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Marca> findRange(
            @DefaultValue("0") @QueryParam("first") int first,
            @DefaultValue("0") @QueryParam("pagesize") int pageSize
    ) {
        List lista=null;
        try {
            lista = mfl.findRange(first,pageSize);
            if (lista!=null) {
                return lista;
            }
        } catch (Exception e) {
        }finally{
            lista=new ArrayList();
        }
        
        return lista;
    }    
    
//    @DELETE
//    @Produces({MediaType.APPLICATION_JSON})
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Object Marca()
//    {
//    
//    }    
//    
}
