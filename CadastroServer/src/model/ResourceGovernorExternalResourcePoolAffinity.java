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
@Table(name = "resource_governor_external_resource_pool_affinity")
@NamedQueries({
    @NamedQuery(name = "ResourceGovernorExternalResourcePoolAffinity.findAll", query = "SELECT r FROM ResourceGovernorExternalResourcePoolAffinity r"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePoolAffinity.findByExternalPoolId", query = "SELECT r FROM ResourceGovernorExternalResourcePoolAffinity r WHERE r.externalPoolId = :externalPoolId"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePoolAffinity.findByProcessorGroup", query = "SELECT r FROM ResourceGovernorExternalResourcePoolAffinity r WHERE r.processorGroup = :processorGroup"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePoolAffinity.findByCpuMask", query = "SELECT r FROM ResourceGovernorExternalResourcePoolAffinity r WHERE r.cpuMask = :cpuMask")})
public class ResourceGovernorExternalResourcePoolAffinity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "external_pool_id")
    private int externalPoolId;
    @Basic(optional = false)
    @Column(name = "processor_group")
    private short processorGroup;
    @Basic(optional = false)
    @Column(name = "cpu_mask")
    private long cpuMask;

    public ResourceGovernorExternalResourcePoolAffinity() {
    }

    public int getExternalPoolId() {
        return externalPoolId;
    }

    public void setExternalPoolId(int externalPoolId) {
        this.externalPoolId = externalPoolId;
    }

    public short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public long getCpuMask() {
        return cpuMask;
    }

    public void setCpuMask(long cpuMask) {
        this.cpuMask = cpuMask;
    }
    
}
