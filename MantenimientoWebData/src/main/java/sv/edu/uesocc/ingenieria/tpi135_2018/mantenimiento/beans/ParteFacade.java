/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Parte;

/**
 *
 * @author joker
 */
@Stateless
public class ParteFacade extends AbstractFacade<Parte> implements ParteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_MantenimientoWebData_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParteFacade() {
        super(Parte.class);
    }

    @Override
    public List<Parte> findByNombreLike(String name, Integer first, Integer pageSize) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
