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
@Table(name = "database_principals")
@NamedQueries({
    @NamedQuery(name = "DatabasePrincipals.findAll", query = "SELECT d FROM DatabasePrincipals d"),
    @NamedQuery(name = "DatabasePrincipals.findByName", query = "SELECT d FROM DatabasePrincipals d WHERE d.name = :name"),
    @NamedQuery(name = "DatabasePrincipals.findByPrincipalId", query = "SELECT d FROM DatabasePrincipals d WHERE d.principalId = :principalId"),
    @NamedQuery(name = "DatabasePrincipals.findByType", query = "SELECT d FROM DatabasePrincipals d WHERE d.type = :type"),
    @NamedQuery(name = "DatabasePrincipals.findByTypeDesc", query = "SELECT d FROM DatabasePrincipals d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DatabasePrincipals.findByDefaultSchemaName", query = "SELECT d FROM DatabasePrincipals d WHERE d.defaultSchemaName = :defaultSchemaName"),
    @NamedQuery(name = "DatabasePrincipals.findByCreateDate", query = "SELECT d FROM DatabasePrincipals d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DatabasePrincipals.findByModifyDate", query = "SELECT d FROM DatabasePrincipals d WHERE d.modifyDate = :modifyDate"),
    @NamedQuery(name = "DatabasePrincipals.findByOwningPrincipalId", query = "SELECT d FROM DatabasePrincipals d WHERE d.owningPrincipalId = :owningPrincipalId"),
    @NamedQuery(name = "DatabasePrincipals.findByIsFixedRole", query = "SELECT d FROM DatabasePrincipals d WHERE d.isFixedRole = :isFixedRole"),
    @NamedQuery(name = "DatabasePrincipals.findByAuthenticationType", query = "SELECT d FROM DatabasePrincipals d WHERE d.authenticationType = :authenticationType"),
    @NamedQuery(name = "DatabasePrincipals.findByAuthenticationTypeDesc", query = "SELECT d FROM DatabasePrincipals d WHERE d.authenticationTypeDesc = :authenticationTypeDesc"),
    @NamedQuery(name = "DatabasePrincipals.findByDefaultLanguageName", query = "SELECT d FROM DatabasePrincipals d WHERE d.defaultLanguageName = :defaultLanguageName"),
    @NamedQuery(name = "DatabasePrincipals.findByDefaultLanguageLcid", query = "SELECT d FROM DatabasePrincipals d WHERE d.defaultLanguageLcid = :defaultLanguageLcid"),
    @NamedQuery(name = "DatabasePrincipals.findByAllowEncryptedValueModifications", query = "SELECT d FROM DatabasePrincipals d WHERE d.allowEncryptedValueModifications = :allowEncryptedValueModifications"),
    @NamedQuery(name = "DatabasePrincipals.findByTenantId", query = "SELECT d FROM DatabasePrincipals d WHERE d.tenantId = :tenantId")})
public class DatabasePrincipals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "principal_id")
    private int principalId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "default_schema_name")
    private String defaultSchemaName;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "owning_principal_id")
    private Integer owningPrincipalId;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Basic(optional = false)
    @Column(name = "is_fixed_role")
    private boolean isFixedRole;
    @Basic(optional = false)
    @Column(name = "authentication_type")
    private int authenticationType;
    @Column(name = "authentication_type_desc")
    private String authenticationTypeDesc;
    @Column(name = "default_language_name")
    private String defaultLanguageName;
    @Column(name = "default_language_lcid")
    private Integer defaultLanguageLcid;
    @Basic(optional = false)
    @Column(name = "allow_encrypted_value_modifications")
    private boolean allowEncryptedValueModifications;
    @Column(name = "tenant_id")
    private String tenantId;

    public DatabasePrincipals() {
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

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getDefaultSchemaName() {
        return defaultSchemaName;
    }

    public void setDefaultSchemaName(String defaultSchemaName) {
        this.defaultSchemaName = defaultSchemaName;
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

    public Integer getOwningPrincipalId() {
        return owningPrincipalId;
    }

    public void setOwningPrincipalId(Integer owningPrincipalId) {
        this.owningPrincipalId = owningPrincipalId;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public boolean getIsFixedRole() {
        return isFixedRole;
    }

    public void setIsFixedRole(boolean isFixedRole) {
        this.isFixedRole = isFixedRole;
    }

    public int getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(int authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getAuthenticationTypeDesc() {
        return authenticationTypeDesc;
    }

    public void setAuthenticationTypeDesc(String authenticationTypeDesc) {
        this.authenticationTypeDesc = authenticationTypeDesc;
    }

    public String getDefaultLanguageName() {
        return defaultLanguageName;
    }

    public void setDefaultLanguageName(String defaultLanguageName) {
        this.defaultLanguageName = defaultLanguageName;
    }

    public Integer getDefaultLanguageLcid() {
        return defaultLanguageLcid;
    }

    public void setDefaultLanguageLcid(Integer defaultLanguageLcid) {
        this.defaultLanguageLcid = defaultLanguageLcid;
    }

    public boolean getAllowEncryptedValueModifications() {
        return allowEncryptedValueModifications;
    }

    public void setAllowEncryptedValueModifications(boolean allowEncryptedValueModifications) {
        this.allowEncryptedValueModifications = allowEncryptedValueModifications;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
}
