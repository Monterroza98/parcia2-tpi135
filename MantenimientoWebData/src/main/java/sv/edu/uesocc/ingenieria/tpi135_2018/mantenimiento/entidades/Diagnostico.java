/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author joker
 */
@Entity
@Table(name = "diagnostico", catalog = "mantenimientodb", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diagnostico.findAll", query = "SELECT d FROM Diagnostico d")
    , @NamedQuery(name = "Diagnostico.findByIdDiagnostico", query = "SELECT d FROM Diagnostico d WHERE d.idDiagnostico = :idDiagnostico")
    , @NamedQuery(name = "Diagnostico.findByNombre", query = "SELECT d FROM Diagnostico d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Diagnostico.findByNombreLike", query = "SELECT m FROM Diagnostico m WHERE LOWER(m.nombre) LIKE CONCAT('%',LOWER(\"n\"),'%') ")
    , @NamedQuery(name = "Diagnostico.findByDescripcion", query = "SELECT d FROM Diagnostico d WHERE d.descripcion = :descripcion")})
public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_diagnostico")
    private Integer idDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idDiagnostico")
    private Collection<DiagnosticoParte> diagnosticoParteCollection;
    @OneToMany(mappedBy = "idDiagnostico")
    private Collection<Procedimiento> procedimientoCollection;

    public Diagnostico() {
    }

    public Diagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Diagnostico(Integer idDiagnostico, String nombre) {
        this.idDiagnostico = idDiagnostico;
        this.nombre = nombre;
    }

    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<DiagnosticoParte> getDiagnosticoParteCollection() {
        return diagnosticoParteCollection;
    }

    public void setDiagnosticoParteCollection(Collection<DiagnosticoParte> diagnosticoParteCollection) {
        this.diagnosticoParteCollection = diagnosticoParteCollection;
    }

    @XmlTransient
    public Collection<Procedimiento> getProcedimientoCollection() {
        return procedimientoCollection;
    }

    public void setProcedimientoCollection(Collection<Procedimiento> procedimientoCollection) {
        this.procedimientoCollection = procedimientoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiagnostico != null ? idDiagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnostico)) {
            return false;
        }
        Diagnostico other = (Diagnostico) object;
        if ((this.idDiagnostico == null && other.idDiagnostico != null) || (this.idDiagnostico != null && !this.idDiagnostico.equals(other.idDiagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.Diagnostico[ idDiagnostico=" + idDiagnostico + " ]";
    }
    
}
