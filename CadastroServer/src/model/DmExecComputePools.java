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
@Table(name = "dm_exec_compute_pools")
@NamedQueries({
    @NamedQuery(name = "DmExecComputePools.findAll", query = "SELECT d FROM DmExecComputePools d"),
    @NamedQuery(name = "DmExecComputePools.findByComputePoolId", query = "SELECT d FROM DmExecComputePools d WHERE d.computePoolId = :computePoolId"),
    @NamedQuery(name = "DmExecComputePools.findByName", query = "SELECT d FROM DmExecComputePools d WHERE d.name = :name"),
    @NamedQuery(name = "DmExecComputePools.findByLocation", query = "SELECT d FROM DmExecComputePools d WHERE d.location = :location")})
public class DmExecComputePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "compute_pool_id")
    private int computePoolId;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;

    public DmExecComputePools() {
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
