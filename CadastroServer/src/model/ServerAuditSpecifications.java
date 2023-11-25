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
@Table(name = "server_audit_specifications")
@NamedQueries({
    @NamedQuery(name = "ServerAuditSpecifications.findAll", query = "SELECT s FROM ServerAuditSpecifications s"),
    @NamedQuery(name = "ServerAuditSpecifications.findByServerSpecificationId", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.serverSpecificationId = :serverSpecificationId"),
    @NamedQuery(name = "ServerAuditSpecifications.findByName", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.name = :name"),
    @NamedQuery(name = "ServerAuditSpecifications.findByCreateDate", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerAuditSpecifications.findByModifyDate", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerAuditSpecifications.findByAuditGuid", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.auditGuid = :auditGuid"),
    @NamedQuery(name = "ServerAuditSpecifications.findByIsStateEnabled", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.isStateEnabled = :isStateEnabled"),
    @NamedQuery(name = "ServerAuditSpecifications.findByIsSessionContextEnabled", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.isSessionContextEnabled = :isSessionContextEnabled"),
    @NamedQuery(name = "ServerAuditSpecifications.findBySessionContextKeys", query = "SELECT s FROM ServerAuditSpecifications s WHERE s.sessionContextKeys = :sessionContextKeys")})
public class ServerAuditSpecifications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "server_specification_id")
    private int serverSpecificationId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "audit_guid")
    private String auditGuid;
    @Column(name = "is_state_enabled")
    private Boolean isStateEnabled;
    @Column(name = "is_session_context_enabled")
    private Boolean isSessionContextEnabled;
    @Column(name = "session_context_keys")
    private String sessionContextKeys;

    public ServerAuditSpecifications() {
    }

    public int getServerSpecificationId() {
        return serverSpecificationId;
    }

    public void setServerSpecificationId(int serverSpecificationId) {
        this.serverSpecificationId = serverSpecificationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid;
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }

    public Boolean getIsSessionContextEnabled() {
        return isSessionContextEnabled;
    }

    public void setIsSessionContextEnabled(Boolean isSessionContextEnabled) {
        this.isSessionContextEnabled = isSessionContextEnabled;
    }

    public String getSessionContextKeys() {
        return sessionContextKeys;
    }

    public void setSessionContextKeys(String sessionContextKeys) {
        this.sessionContextKeys = sessionContextKeys;
    }
    
}
