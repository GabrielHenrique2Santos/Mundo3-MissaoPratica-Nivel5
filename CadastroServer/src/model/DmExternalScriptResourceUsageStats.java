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
@Table(name = "dm_external_script_resource_usage_stats")
@NamedQueries({
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findAll", query = "SELECT d FROM DmExternalScriptResourceUsageStats d"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByPackageName", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.packageName = :packageName"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByMemoryUsage", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.memoryUsage = :memoryUsage"),
    @NamedQuery(name = "DmExternalScriptResourceUsageStats.findByCpuUsage", query = "SELECT d FROM DmExternalScriptResourceUsageStats d WHERE d.cpuUsage = :cpuUsage")})
public class DmExternalScriptResourceUsageStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "package_name")
    private String packageName;
    @Basic(optional = false)
    @Column(name = "memory_usage")
    private long memoryUsage;
    @Basic(optional = false)
    @Column(name = "cpu_usage")
    private long cpuUsage;

    public DmExternalScriptResourceUsageStats() {
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public long getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(long memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public long getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(long cpuUsage) {
        this.cpuUsage = cpuUsage;
    }
    
}
