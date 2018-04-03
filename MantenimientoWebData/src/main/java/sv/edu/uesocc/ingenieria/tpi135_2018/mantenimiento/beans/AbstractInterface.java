/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;

/**
 *
 * @author alexander
 */
public interface AbstractInterface<T> {

    void create(T marca);

    void edit(T marca);

    void remove(T marca);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int first,int Pagesize);

    int count();

    //public List findRange(int first, int pageSize);
}
