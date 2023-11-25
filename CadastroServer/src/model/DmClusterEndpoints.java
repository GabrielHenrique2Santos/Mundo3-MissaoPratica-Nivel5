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
@Table(name = "dm_cluster_endpoints")
@NamedQueries({
    @NamedQuery(name = "DmClusterEndpoints.findAll", query = "SELECT d FROM DmClusterEndpoints d"),
    @NamedQuery(name = "DmClusterEndpoints.findByName", query = "SELECT d FROM DmClusterEndpoints d WHERE d.name = :name"),
    @NamedQuery(name = "DmClusterEndpoints.findByDescription", query = "SELECT d FROM DmClusterEndpoints d WHERE d.description = :description"),
    @NamedQuery(name = "DmClusterEndpoints.findByEndpoint", query = "SELECT d FROM DmClusterEndpoints d WHERE d.endpoint = :endpoint"),
    @NamedQuery(name = "DmClusterEndpoints.findByProtocolDesc", query = "SELECT d FROM DmClusterEndpoints d WHERE d.protocolDesc = :protocolDesc")})
public class DmClusterEndpoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "endpoint")
    private String endpoint;
    @Column(name = "protocol_desc")
    private String protocolDesc;

    public DmClusterEndpoints() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getProtocolDesc() {
        return protocolDesc;
    }

    public void setProtocolDesc(String protocolDesc) {
        this.protocolDesc = protocolDesc;
    }
    
}
