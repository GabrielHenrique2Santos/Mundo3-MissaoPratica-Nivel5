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
@Table(name = "dm_exec_dms_services")
@NamedQueries({
    @NamedQuery(name = "DmExecDmsServices.findAll", query = "SELECT d FROM DmExecDmsServices d"),
    @NamedQuery(name = "DmExecDmsServices.findByDmsCoreId", query = "SELECT d FROM DmExecDmsServices d WHERE d.dmsCoreId = :dmsCoreId"),
    @NamedQuery(name = "DmExecDmsServices.findByComputeNodeId", query = "SELECT d FROM DmExecDmsServices d WHERE d.computeNodeId = :computeNodeId"),
    @NamedQuery(name = "DmExecDmsServices.findByStatus", query = "SELECT d FROM DmExecDmsServices d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDmsServices.findByComputePoolId", query = "SELECT d FROM DmExecDmsServices d WHERE d.computePoolId = :computePoolId")})
public class DmExecDmsServices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "dms_core_id")
    private Integer dmsCoreId;
    @Column(name = "compute_node_id")
    private Integer computeNodeId;
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDmsServices() {
    }

    public Integer getDmsCoreId() {
        return dmsCoreId;
    }

    public void setDmsCoreId(Integer dmsCoreId) {
        this.dmsCoreId = dmsCoreId;
    }

    public Integer getComputeNodeId() {
        return computeNodeId;
    }

    public void setComputeNodeId(Integer computeNodeId) {
        this.computeNodeId = computeNodeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
