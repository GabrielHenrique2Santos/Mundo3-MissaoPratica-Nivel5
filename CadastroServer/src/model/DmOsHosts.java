/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
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
@Table(name = "dm_os_hosts")
@NamedQueries({
    @NamedQuery(name = "DmOsHosts.findAll", query = "SELECT d FROM DmOsHosts d"),
    @NamedQuery(name = "DmOsHosts.findByType", query = "SELECT d FROM DmOsHosts d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsHosts.findByName", query = "SELECT d FROM DmOsHosts d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsHosts.findByEnqueuedTasksCount", query = "SELECT d FROM DmOsHosts d WHERE d.enqueuedTasksCount = :enqueuedTasksCount"),
    @NamedQuery(name = "DmOsHosts.findByActiveTasksCount", query = "SELECT d FROM DmOsHosts d WHERE d.activeTasksCount = :activeTasksCount"),
    @NamedQuery(name = "DmOsHosts.findByCompletedIosCount", query = "SELECT d FROM DmOsHosts d WHERE d.completedIosCount = :completedIosCount"),
    @NamedQuery(name = "DmOsHosts.findByCompletedIosInBytes", query = "SELECT d FROM DmOsHosts d WHERE d.completedIosInBytes = :completedIosInBytes"),
    @NamedQuery(name = "DmOsHosts.findByActiveIosCount", query = "SELECT d FROM DmOsHosts d WHERE d.activeIosCount = :activeIosCount")})
public class DmOsHosts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "host_address")
    private byte[] hostAddress;
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "enqueued_tasks_count")
    private Integer enqueuedTasksCount;
    @Column(name = "active_tasks_count")
    private Integer activeTasksCount;
    @Column(name = "completed_ios_count")
    private Integer completedIosCount;
    @Column(name = "completed_ios_in_bytes")
    private BigInteger completedIosInBytes;
    @Column(name = "active_ios_count")
    private Integer activeIosCount;
    @Basic(optional = false)
    @Lob
    @Column(name = "default_memory_clerk_address")
    private byte[] defaultMemoryClerkAddress;

    public DmOsHosts() {
    }

    public byte[] getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(byte[] hostAddress) {
        this.hostAddress = hostAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnqueuedTasksCount() {
        return enqueuedTasksCount;
    }

    public void setEnqueuedTasksCount(Integer enqueuedTasksCount) {
        this.enqueuedTasksCount = enqueuedTasksCount;
    }

    public Integer getActiveTasksCount() {
        return activeTasksCount;
    }

    public void setActiveTasksCount(Integer activeTasksCount) {
        this.activeTasksCount = activeTasksCount;
    }

    public Integer getCompletedIosCount() {
        return completedIosCount;
    }

    public void setCompletedIosCount(Integer completedIosCount) {
        this.completedIosCount = completedIosCount;
    }

    public BigInteger getCompletedIosInBytes() {
        return completedIosInBytes;
    }

    public void setCompletedIosInBytes(BigInteger completedIosInBytes) {
        this.completedIosInBytes = completedIosInBytes;
    }

    public Integer getActiveIosCount() {
        return activeIosCount;
    }

    public void setActiveIosCount(Integer activeIosCount) {
        this.activeIosCount = activeIosCount;
    }

    public byte[] getDefaultMemoryClerkAddress() {
        return defaultMemoryClerkAddress;
    }

    public void setDefaultMemoryClerkAddress(byte[] defaultMemoryClerkAddress) {
        this.defaultMemoryClerkAddress = defaultMemoryClerkAddress;
    }
    
}
