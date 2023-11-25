/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "dm_exec_distributed_requests")
@NamedQueries({
    @NamedQuery(name = "DmExecDistributedRequests.findAll", query = "SELECT d FROM DmExecDistributedRequests d"),
    @NamedQuery(name = "DmExecDistributedRequests.findByExecutionId", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecDistributedRequests.findByStatus", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDistributedRequests.findByErrorId", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecDistributedRequests.findByStartTime", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecDistributedRequests.findByEndTime", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecDistributedRequests.findByTotalElapsedTime", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecDistributedRequests.findByComputePoolId", query = "SELECT d FROM DmExecDistributedRequests d WHERE d.computePoolId = :computePoolId")})
public class DmExecDistributedRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "sql_handle")
    private byte[] sqlHandle;
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "status")
    private String status;
    @Column(name = "error_id")
    private String errorId;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "total_elapsed_time")
    private Integer totalElapsedTime;
    @Basic(optional = false)
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDistributedRequests() {
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(Integer totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
