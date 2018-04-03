/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.DiagnosticoParte;

/**
 *
 * @author joker
 */
@Local
public interface DiagnosticoParteFacadeLocal {

    void create(DiagnosticoParte diagnosticoParte);

    void edit(DiagnosticoParte diagnosticoParte);

    void remove(DiagnosticoParte diagnosticoParte);

    DiagnosticoParte find(Object id);

    List<DiagnosticoParte> findAll();

    List<DiagnosticoParte> findRange(int[] range);

    int count();
    
}