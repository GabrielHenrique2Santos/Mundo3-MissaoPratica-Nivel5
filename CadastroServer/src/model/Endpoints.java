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
@Table(name = "endpoints")
@NamedQueries({
    @NamedQuery(name = "Endpoints.findAll", query = "SELECT e FROM Endpoints e"),
    @NamedQuery(name = "Endpoints.findByName", query = "SELECT e FROM Endpoints e WHERE e.name = :name"),
    @NamedQuery(name = "Endpoints.findByEndpointId", query = "SELECT e FROM Endpoints e WHERE e.endpointId = :endpointId"),
    @NamedQuery(name = "Endpoints.findByPrincipalId", query = "SELECT e FROM Endpoints e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "Endpoints.findByProtocol", query = "SELECT e FROM Endpoints e WHERE e.protocol = :protocol"),
    @NamedQuery(name = "Endpoints.findByProtocolDesc", query = "SELECT e FROM Endpoints e WHERE e.protocolDesc = :protocolDesc"),
    @NamedQuery(name = "Endpoints.findByType", query = "SELECT e FROM Endpoints e WHERE e.type = :type"),
    @NamedQuery(name = "Endpoints.findByTypeDesc", query = "SELECT e FROM Endpoints e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "Endpoints.findByState", query = "SELECT e FROM Endpoints e WHERE e.state = :state"),
    @NamedQuery(name = "Endpoints.findByStateDesc", query = "SELECT e FROM Endpoints e WHERE e.stateDesc = :stateDesc"),
    @NamedQuery(name = "Endpoints.findByIsAdminEndpoint", query = "SELECT e FROM Endpoints e WHERE e.isAdminEndpoint = :isAdminEndpoint")})
public class Endpoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "endpoint_id")
    private int endpointId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @Column(name = "protocol")
    private short protocol;
    @Column(name = "protocol_desc")
    private String protocolDesc;
    @Basic(optional = false)
    @Column(name = "type")
    private short type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "state")
    private Short state;
    @Column(name = "state_desc")
    private String stateDesc;
    @Basic(optional = false)
    @Column(name = "is_admin_endpoint")
    private boolean isAdminEndpoint;

    public Endpoints() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(int endpointId) {
        this.endpointId = endpointId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public short getProtocol() {
        return protocol;
    }

    public void setProtocol(short protocol) {
        this.protocol = protocol;
    }

    public String getProtocolDesc() {
        return protocolDesc;
    }

    public void setProtocolDesc(String protocolDesc) {
        this.protocolDesc = protocolDesc;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public boolean getIsAdminEndpoint() {
        return isAdminEndpoint;
    }

    public void setIsAdminEndpoint(boolean isAdminEndpoint) {
        this.isAdminEndpoint = isAdminEndpoint;
    }
    
}
