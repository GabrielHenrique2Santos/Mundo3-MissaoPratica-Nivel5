/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "trusted_assemblies")
@NamedQueries({
    @NamedQuery(name = "TrustedAssemblies.findAll", query = "SELECT t FROM TrustedAssemblies t"),
    @NamedQuery(name = "TrustedAssemblies.findByDescription", query = "SELECT t FROM TrustedAssemblies t WHERE t.description = :description"),
    @NamedQuery(name = "TrustedAssemblies.findByCreateDate", query = "SELECT t FROM TrustedAssemblies t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "TrustedAssemblies.findByCreatedBy", query = "SELECT t FROM TrustedAssemblies t WHERE t.createdBy = :createdBy")})
public class TrustedAssemblies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "hash")
    private byte[] hash;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "created_by")
    private String createdBy;

    public TrustedAssemblies() {
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
}
