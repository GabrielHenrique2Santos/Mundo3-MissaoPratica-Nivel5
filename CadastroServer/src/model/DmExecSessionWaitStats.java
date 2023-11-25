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
@Table(name = "dm_exec_session_wait_stats")
@NamedQueries({
    @NamedQuery(name = "DmExecSessionWaitStats.findAll", query = "SELECT d FROM DmExecSessionWaitStats d"),
    @NamedQuery(name = "DmExecSessionWaitStats.findBySessionId", query = "SELECT d FROM DmExecSessionWaitStats d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmExecSessionWaitStats.findByWaitType", query = "SELECT d FROM DmExecSessionWaitStats d WHERE d.waitType = :waitType"),
    @NamedQuery(name = "DmExecSessionWaitStats.findByWaitingTasksCount", query = "SELECT d FROM DmExecSessionWaitStats d WHERE d.waitingTasksCount = :waitingTasksCount"),
    @NamedQuery(name = "DmExecSessionWaitStats.findByWaitTimeMs", query = "SELECT d FROM DmExecSessionWaitStats d WHERE d.waitTimeMs = :waitTimeMs"),
    @NamedQuery(name = "DmExecSessionWaitStats.findByMaxWaitTimeMs", query = "SELECT d FROM DmExecSessionWaitStats d WHERE d.maxWaitTimeMs = :maxWaitTimeMs"),
    @NamedQuery(name = "DmExecSessionWaitStats.findBySignalWaitTimeMs", query = "SELECT d FROM DmExecSessionWaitStats d WHERE d.signalWaitTimeMs = :signalWaitTimeMs")})
public class DmExecSessionWaitStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @Column(name = "wait_type")
    private String waitType;
    @Basic(optional = false)
    @Column(name = "waiting_tasks_count")
    private long waitingTasksCount;
    @Basic(optional = false)
    @Column(name = "wait_time_ms")
    private long waitTimeMs;
    @Basic(optional = false)
    @Column(name = "max_wait_time_ms")
    private long maxWaitTimeMs;
    @Basic(optional = false)
    @Column(name = "signal_wait_time_ms")
    private long signalWaitTimeMs;

    public DmExecSessionWaitStats() {
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType;
    }

    public long getWaitingTasksCount() {
        return waitingTasksCount;
    }

    public void setWaitingTasksCount(long waitingTasksCount) {
        this.waitingTasksCount = waitingTasksCount;
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

    public long getSignalWaitTimeMs() {
        return signalWaitTimeMs;
    }

    public void setSignalWaitTimeMs(long signalWaitTimeMs) {
        this.signalWaitTimeMs = signalWaitTimeMs;
    }
    
}
