/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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
@Table(name = "dm_os_dispatcher_pools")
@NamedQueries({
    @NamedQuery(name = "DmOsDispatcherPools.findAll", query = "SELECT d FROM DmOsDispatcherPools d"),
    @NamedQuery(name = "DmOsDispatcherPools.findByType", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.type = :type"),
    @NamedQuery(name = "DmOsDispatcherPools.findByName", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsDispatcherPools.findByDispatcherCount", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.dispatcherCount = :dispatcherCount"),
    @NamedQuery(name = "DmOsDispatcherPools.findByDispatcherIdealCount", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.dispatcherIdealCount = :dispatcherIdealCount"),
    @NamedQuery(name = "DmOsDispatcherPools.findByDispatcherTimeoutMs", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.dispatcherTimeoutMs = :dispatcherTimeoutMs"),
    @NamedQuery(name = "DmOsDispatcherPools.findByDispatcherWaitingCount", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.dispatcherWaitingCount = :dispatcherWaitingCount"),
    @NamedQuery(name = "DmOsDispatcherPools.findByQueueLength", query = "SELECT d FROM DmOsDispatcherPools d WHERE d.queueLength = :queueLength")})
public class DmOsDispatcherPools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "dispatcher_pool_address")
    private byte[] dispatcherPoolAddress;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "dispatcher_count")
    private int dispatcherCount;
    @Basic(optional = false)
    @Column(name = "dispatcher_ideal_count")
    private int dispatcherIdealCount;
    @Basic(optional = false)
    @Column(name = "dispatcher_timeout_ms")
    private int dispatcherTimeoutMs;
    @Basic(optional = false)
    @Column(name = "dispatcher_waiting_count")
    private int dispatcherWaitingCount;
    @Basic(optional = false)
    @Column(name = "queue_length")
    private int queueLength;

    public DmOsDispatcherPools() {
    }

    public byte[] getDispatcherPoolAddress() {
        return dispatcherPoolAddress;
    }

    public void setDispatcherPoolAddress(byte[] dispatcherPoolAddress) {
        this.dispatcherPoolAddress = dispatcherPoolAddress;
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

    public int getDispatcherCount() {
        return dispatcherCount;
    }

    public void setDispatcherCount(int dispatcherCount) {
        this.dispatcherCount = dispatcherCount;
    }

    public int getDispatcherIdealCount() {
        return dispatcherIdealCount;
    }

    public void setDispatcherIdealCount(int dispatcherIdealCount) {
        this.dispatcherIdealCount = dispatcherIdealCount;
    }

    public int getDispatcherTimeoutMs() {
        return dispatcherTimeoutMs;
    }

    public void setDispatcherTimeoutMs(int dispatcherTimeoutMs) {
        this.dispatcherTimeoutMs = dispatcherTimeoutMs;
    }

    public int getDispatcherWaitingCount() {
        return dispatcherWaitingCount;
    }

    public void setDispatcherWaitingCount(int dispatcherWaitingCount) {
        this.dispatcherWaitingCount = dispatcherWaitingCount;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }
    
}
