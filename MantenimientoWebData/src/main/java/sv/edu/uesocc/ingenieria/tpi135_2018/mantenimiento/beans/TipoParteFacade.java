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
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.TipoParte;

/**
 *
 * @author joker
 */
@Stateless
public class TipoParteFacade extends AbstractFacade<TipoParte> implements TipoParteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_MantenimientoWebData_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoParteFacade() {
        super(TipoParte.class);
    }

    @Override
    public List<TipoParte> findByNombreLike(String name, Integer first, Integer pageSize) {
        Query query = em.createNamedQuery("TipoParte.findByNombreLike");
        List<TipoParte> lista= query.getResultList();
        return lista;
    }

}
