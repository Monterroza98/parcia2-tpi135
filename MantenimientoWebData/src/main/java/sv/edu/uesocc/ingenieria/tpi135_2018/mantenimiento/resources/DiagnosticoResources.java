/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.resources;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans.DiagnosticoFacadeLocal;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Diagnostico;

/**
 *
 * @author alexander
 */
@Path("diagnostico")
public class DiagnosticoResources {
    @EJB
    private DiagnosticoFacadeLocal dfl;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
     public List<Diagnostico> findAll() {
        List lista=null;
        try {
            lista = dfl.findAll();
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
    public List<Diagnostico> findRange(
            @DefaultValue("0") @QueryParam("first") int first,
            @DefaultValue("0") @QueryParam("pagesize") int pageSize
    ) {
        List lista=null;
        try {
            lista = dfl.findRange(first,pageSize);
            if (lista!=null) {
                return lista;
            }
        } catch (Exception e) {
        }finally{
            lista=new ArrayList();
        }
        
        return lista;
    }}    

