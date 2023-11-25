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
@Table(name = "dm_pal_wait_stats")
@NamedQueries({
    @NamedQuery(name = "DmPalWaitStats.findAll", query = "SELECT d FROM DmPalWaitStats d"),
    @NamedQuery(name = "DmPalWaitStats.findByWaitType", query = "SELECT d FROM DmPalWaitStats d WHERE d.waitType = :waitType"),
    @NamedQuery(name = "DmPalWaitStats.findByWaitingThreadsCount", query = "SELECT d FROM DmPalWaitStats d WHERE d.waitingThreadsCount = :waitingThreadsCount"),
    @NamedQuery(name = "DmPalWaitStats.findByWaitTimeMs", query = "SELECT d FROM DmPalWaitStats d WHERE d.waitTimeMs = :waitTimeMs"),
    @NamedQuery(name = "DmPalWaitStats.findByMaxWaitTimeMs", query = "SELECT d FROM DmPalWaitStats d WHERE d.maxWaitTimeMs = :maxWaitTimeMs")})
public class DmPalWaitStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "wait_type")
    private String waitType;
    @Basic(optional = false)
    @Column(name = "waiting_threads_count")
    private long waitingThreadsCount;
    @Basic(optional = false)
    @Column(name = "wait_time_ms")
    private long waitTimeMs;
    @Basic(optional = false)
    @Column(name = "max_wait_time_ms")
    private long maxWaitTimeMs;

    public DmPalWaitStats() {
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType;
    }

    public long getWaitingThreadsCount() {
        return waitingThreadsCount;
    }

    public void setWaitingThreadsCount(long waitingThreadsCount) {
        this.waitingThreadsCount = waitingThreadsCount;
    }

    public long getWaitTimeMs() {
        return waitTimeMs;
    }

    public void setWaitTimeMs(long waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
    }

    public long getMaxWaitTimeMs() {
        return maxWaitTimeMs;
    }

    public void setMaxWaitTimeMs(long maxWaitTimeMs) {
        this.maxWaitTimeMs = maxWaitTimeMs;
    }
    
}
