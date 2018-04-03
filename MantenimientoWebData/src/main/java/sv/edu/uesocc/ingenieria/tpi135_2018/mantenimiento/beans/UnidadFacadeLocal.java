/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Unidad;

/**
 *
 * @author joker
 */
@Local
public interface UnidadFacadeLocal {

    void create(Unidad unidad);

    void edit(Unidad unidad);

    void remove(Unidad unidad);

    Unidad find(Object id);

    List<Unidad> findAll();

    List<Unidad> findRange(int[] range);

    int count();

    public List findRange(int first, int pageSize);
    
}
