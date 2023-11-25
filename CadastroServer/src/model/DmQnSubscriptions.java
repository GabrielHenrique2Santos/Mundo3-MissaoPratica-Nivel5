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
@Table(name = "dm_qn_subscriptions")
@NamedQueries({
    @NamedQuery(name = "DmQnSubscriptions.findAll", query = "SELECT d FROM DmQnSubscriptions d"),
    @NamedQuery(name = "DmQnSubscriptions.findById", query = "SELECT d FROM DmQnSubscriptions d WHERE d.id = :id"),
    @NamedQuery(name = "DmQnSubscriptions.findByDatabaseId", query = "SELECT d FROM DmQnSubscriptions d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmQnSubscriptions.findByObjectId", query = "SELECT d FROM DmQnSubscriptions d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmQnSubscriptions.findByCreated", query = "SELECT d FROM DmQnSubscriptions d WHERE d.created = :created"),
    @NamedQuery(name = "DmQnSubscriptions.findByTimeout", query = "SELECT d FROM DmQnSubscriptions d WHERE d.timeout = :timeout"),
    @NamedQuery(name = "DmQnSubscriptions.findByStatus", query = "SELECT d FROM DmQnSubscriptions d WHERE d.status = :status")})
public class DmQnSubscriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "timeout")
    private int timeout;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;

    public DmQnSubscriptions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
