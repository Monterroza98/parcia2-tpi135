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
import javax.persistence.Query;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.TipoResponsable;

/**
 *
 * @author joker
 */
@Stateless
public class TipoResponsableFacade extends AbstractFacade<TipoResponsable> implements TipoResponsableFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_MantenimientoWebData_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoResponsableFacade() {
        super(TipoResponsable.class);
    }

    @Override
    public List<TipoResponsable> findByNombreLike(String name, Integer first, Integer pageSize) {
        Query query = em.createNamedQuery("TipoResponsable.findByNombreLike");
        List<TipoResponsable> lista= query.getResultList();
        return lista;
    }

}
