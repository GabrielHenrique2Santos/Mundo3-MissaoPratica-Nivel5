/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "dm_database_external_policy_principals")
@NamedQueries({
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findAll", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByAadObjectId", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.aadObjectId = :aadObjectId"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByType", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.type = :type"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByTypeDesc", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.typeDesc = :typeDesc"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByAuthenticationType", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.authenticationType = :authenticationType"),
    @NamedQuery(name = "DmDatabaseExternalPolicyPrincipals.findByAuthenticationTypeDesc", query = "SELECT d FROM DmDatabaseExternalPolicyPrincipals d WHERE d.authenticationTypeDesc = :authenticationTypeDesc")})
public class DmDatabaseExternalPolicyPrincipals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Column(name = "aad_object_id")
    private String aadObjectId;
    @Column(name = "type")
    private String type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "authentication_type")
    private Integer authenticationType;
    @Column(name = "authentication_type_desc")
    private String authenticationTypeDesc;

    public DmDatabaseExternalPolicyPrincipals() {
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getAadObjectId() {
        return aadObjectId;
    }

    public void setAadObjectId(String aadObjectId) {
        this.aadObjectId = aadObjectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Integer getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getAuthenticationTypeDesc() {
        return authenticationTypeDesc;
    }

    public void setAuthenticationTypeDesc(String authenticationTypeDesc) {
        this.authenticationTypeDesc = authenticationTypeDesc;
    }
    
}
