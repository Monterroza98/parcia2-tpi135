/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Marca;

/**
 *
 * @author joker
 */
@Local
public interface MarcaFacadeLocal {

    void create(Marca marca);

    void edit(Marca marca);

    void remove(Marca marca);

    Marca find(Object id);

    List<Marca> findAll();

    List<Marca> findRange(int[] range);

    int count();

    public List findRange(int first, int pageSize);
    
}