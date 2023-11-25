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
@Table(name = "resource_governor_external_resource_pools")
@NamedQueries({
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findAll", query = "SELECT r FROM ResourceGovernorExternalResourcePools r"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findByExternalPoolId", query = "SELECT r FROM ResourceGovernorExternalResourcePools r WHERE r.externalPoolId = :externalPoolId"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findByName", query = "SELECT r FROM ResourceGovernorExternalResourcePools r WHERE r.name = :name"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findByMaxCpuPercent", query = "SELECT r FROM ResourceGovernorExternalResourcePools r WHERE r.maxCpuPercent = :maxCpuPercent"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findByMaxMemoryPercent", query = "SELECT r FROM ResourceGovernorExternalResourcePools r WHERE r.maxMemoryPercent = :maxMemoryPercent"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findByMaxProcesses", query = "SELECT r FROM ResourceGovernorExternalResourcePools r WHERE r.maxProcesses = :maxProcesses"),
    @NamedQuery(name = "ResourceGovernorExternalResourcePools.findByVersion", query = "SELECT r FROM ResourceGovernorExternalResourcePools r WHERE r.version = :version")})
public class ResourceGovernorExternalResourcePools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "external_pool_id")
    private int externalPoolId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "max_cpu_percent")
    private int maxCpuPercent;
    @Basic(optional = false)
    @Column(name = "max_memory_percent")
    private int maxMemoryPercent;
    @Basic(optional = false)
    @Column(name = "max_processes")
    private int maxProcesses;
    @Basic(optional = false)
    @Column(name = "version")
    private long version;

    public ResourceGovernorExternalResourcePools() {
    }

    public int getExternalPoolId() {
        return externalPoolId;
    }

    public void setExternalPoolId(int externalPoolId) {
        this.externalPoolId = externalPoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCpuPercent() {
        return maxCpuPercent;
    }

    public void setMaxCpuPercent(int maxCpuPercent) {
        this.maxCpuPercent = maxCpuPercent;
    }

    public int getMaxMemoryPercent() {
        return maxMemoryPercent;
    }

    public void setMaxMemoryPercent(int maxMemoryPercent) {
        this.maxMemoryPercent = maxMemoryPercent;
    }

    public int getMaxProcesses() {
        return maxProcesses;
    }

    public void setMaxProcesses(int maxProcesses) {
        this.maxProcesses = maxProcesses;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
    
}
