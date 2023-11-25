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
@Table(name = "dm_hadr_instance_node_map")
@NamedQueries({
    @NamedQuery(name = "DmHadrInstanceNodeMap.findAll", query = "SELECT d FROM DmHadrInstanceNodeMap d"),
    @NamedQuery(name = "DmHadrInstanceNodeMap.findByAgResourceId", query = "SELECT d FROM DmHadrInstanceNodeMap d WHERE d.agResourceId = :agResourceId"),
    @NamedQuery(name = "DmHadrInstanceNodeMap.findByInstanceName", query = "SELECT d FROM DmHadrInstanceNodeMap d WHERE d.instanceName = :instanceName"),
    @NamedQuery(name = "DmHadrInstanceNodeMap.findByNodeName", query = "SELECT d FROM DmHadrInstanceNodeMap d WHERE d.nodeName = :nodeName")})
public class DmHadrInstanceNodeMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ag_resource_id")
    private String agResourceId;
    @Basic(optional = false)
    @Column(name = "instance_name")
    private String instanceName;
    @Basic(optional = false)
    @Column(name = "node_name")
    private String nodeName;

    public DmHadrInstanceNodeMap() {
    }

    public String getAgResourceId() {
        return agResourceId;
    }

    public void setAgResourceId(String agResourceId) {
        this.agResourceId = agResourceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    
}
