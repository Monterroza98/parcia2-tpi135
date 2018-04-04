/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Calendario;

/**
 *
 * @author joker
 */
@Local
public interface CalendarioFacadeLocal {

    void create(Calendario calendario);

    void edit(Calendario calendario);

    void remove(Calendario calendario);

    Calendario find(Object id);

    List<Calendario> findAll();

    List<Calendario> findRange(int[] range);

    int count();
    
}
