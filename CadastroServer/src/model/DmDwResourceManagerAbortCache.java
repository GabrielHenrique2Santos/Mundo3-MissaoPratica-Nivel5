/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "dm_dw_resource_manager_abort_cache")
@NamedQueries({
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findAll", query = "SELECT d FROM DmDwResourceManagerAbortCache d"),
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findByAsn", query = "SELECT d FROM DmDwResourceManagerAbortCache d WHERE d.asn = :asn"),
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findByBsn", query = "SELECT d FROM DmDwResourceManagerAbortCache d WHERE d.bsn = :bsn"),
    @NamedQuery(name = "DmDwResourceManagerAbortCache.findByNestedId", query = "SELECT d FROM DmDwResourceManagerAbortCache d WHERE d.nestedId = :nestedId")})
public class DmDwResourceManagerAbortCache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "asn")
    private long asn;
    @Basic(optional = false)
    @Column(name = "bsn")
    private long bsn;
    @Basic(optional = false)
    @Column(name = "nested_id")
    private long nestedId;

    public DmDwResourceManagerAbortCache() {
    }

    public long getAsn() {
        return asn;
    }

    public void setAsn(long asn) {
        this.asn = asn;
    }

    public long getBsn() {
        return bsn;
    }

    public void setBsn(long bsn) {
        this.bsn = bsn;
    }

    public long getNestedId() {
        return nestedId;
    }

    public void setNestedId(long nestedId) {
        this.nestedId = nestedId;
    }
    
}
