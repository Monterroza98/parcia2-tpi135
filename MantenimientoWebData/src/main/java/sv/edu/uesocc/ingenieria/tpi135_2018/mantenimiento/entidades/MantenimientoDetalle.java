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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author joker
 */
@Entity
@Table(name = "mantenimiento_detalle", catalog = "mantenimientodb", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MantenimientoDetalle.findAll", query = "SELECT m FROM MantenimientoDetalle m")
    , @NamedQuery(name = "MantenimientoDetalle.findByIdMantenimientoDetalle", query = "SELECT m FROM MantenimientoDetalle m WHERE m.idMantenimientoDetalle = :idMantenimientoDetalle")
    , @NamedQuery(name = "MantenimientoDetalle.findByIdEquipoDetalle", query = "SELECT m FROM MantenimientoDetalle m WHERE m.idEquipoDetalle = :idEquipoDetalle")})
public class MantenimientoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mantenimiento_detalle")
    private Long idMantenimientoDetalle;
    @Column(name = "id_equipo_detalle")
    private Integer idEquipoDetalle;
    @JoinColumn(name = "id_oden_trabajo", referencedColumnName = "id_orden_trabajo")
    @ManyToOne
    private OrdenTrabajo idOdenTrabajo;
    @OneToMany(mappedBy = "idMantenimientoDetalle")
    private Collection<EstadoMantenimientoDetalle> estadoMantenimientoDetalleCollection;

    public MantenimientoDetalle() {
    }

    public MantenimientoDetalle(Long idMantenimientoDetalle) {
        this.idMantenimientoDetalle = idMantenimientoDetalle;
    }

    public Long getIdMantenimientoDetalle() {
        return idMantenimientoDetalle;
    }

    public void setIdMantenimientoDetalle(Long idMantenimientoDetalle) {
        this.idMantenimientoDetalle = idMantenimientoDetalle;
    }

    public Integer getIdEquipoDetalle() {
        return idEquipoDetalle;
    }

    public void setIdEquipoDetalle(Integer idEquipoDetalle) {
        this.idEquipoDetalle = idEquipoDetalle;
    }

    public OrdenTrabajo getIdOdenTrabajo() {
        return idOdenTrabajo;
    }

    public void setIdOdenTrabajo(OrdenTrabajo idOdenTrabajo) {
        this.idOdenTrabajo = idOdenTrabajo;
    }

    @XmlTransient
    public Collection<EstadoMantenimientoDetalle> getEstadoMantenimientoDetalleCollection() {
        return estadoMantenimientoDetalleCollection;
    }

    public void setEstadoMantenimientoDetalleCollection(Collection<EstadoMantenimientoDetalle> estadoMantenimientoDetalleCollection) {
        this.estadoMantenimientoDetalleCollection = estadoMantenimientoDetalleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMantenimientoDetalle != null ? idMantenimientoDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MantenimientoDetalle)) {
            return false;
        }
        MantenimientoDetalle other = (MantenimientoDetalle) object;
        if ((this.idMantenimientoDetalle == null && other.idMantenimientoDetalle != null) || (this.idMantenimientoDetalle != null && !this.idMantenimientoDetalle.equals(other.idMantenimientoDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.entidades.MantenimientoDetalle[ idMantenimientoDetalle=" + idMantenimientoDetalle + " ]";
    }
    
}
