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
@Table(name = "database_scoped_credentials")
@NamedQueries({
    @NamedQuery(name = "DatabaseScopedCredentials.findAll", query = "SELECT d FROM DatabaseScopedCredentials d"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByName", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.name = :name"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByPrincipalId", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.principalId = :principalId"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByCredentialId", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.credentialId = :credentialId"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByCredentialIdentity", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.credentialIdentity = :credentialIdentity"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByCreateDate", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByModifyDate", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.modifyDate = :modifyDate"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByTargetType", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.targetType = :targetType"),
    @NamedQuery(name = "DatabaseScopedCredentials.findByTargetId", query = "SELECT d FROM DatabaseScopedCredentials d WHERE d.targetId = :targetId")})
public class DatabaseScopedCredentials implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @Column(name = "credential_id")
    private int credentialId;
    @Column(name = "credential_identity")
    private String credentialIdentity;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "target_type")
    private String targetType;
    @Column(name = "target_id")
    private Integer targetId;

    public DatabaseScopedCredentials() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(int principalId) {
        this.principalId = principalId;
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }

    public String getCredentialIdentity() {
        return credentialIdentity;
    }

    public void setCredentialIdentity(String credentialIdentity) {
        this.credentialIdentity = credentialIdentity;
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

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }
    
}
