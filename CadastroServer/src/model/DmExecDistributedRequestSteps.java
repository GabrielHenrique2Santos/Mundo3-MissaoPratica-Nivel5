/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dm_exec_distributed_request_steps")
@NamedQueries({
    @NamedQuery(name = "DmExecDistributedRequestSteps.findAll", query = "SELECT d FROM DmExecDistributedRequestSteps d"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByExecutionId", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.executionId = :executionId"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByStepIndex", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.stepIndex = :stepIndex"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByOperationType", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.operationType = :operationType"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByDistributionType", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.distributionType = :distributionType"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByLocationType", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.locationType = :locationType"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByStatus", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.status = :status"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByErrorId", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.errorId = :errorId"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByStartTime", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.startTime = :startTime"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByEndTime", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.endTime = :endTime"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByTotalElapsedTime", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.totalElapsedTime = :totalElapsedTime"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByRowCount", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByCommand", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.command = :command"),
    @NamedQuery(name = "DmExecDistributedRequestSteps.findByComputePoolId", query = "SELECT d FROM DmExecDistributedRequestSteps d WHERE d.computePoolId = :computePoolId")})
public class DmExecDistributedRequestSteps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "execution_id")
    private String executionId;
    @Column(name = "step_index")
    private Integer stepIndex;
    @Column(name = "operation_type")
    private String operationType;
    @Column(name = "distribution_type")
    private String distributionType;
    @Column(name = "location_type")
    private String locationType;
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
    @Column(name = "row_count")
    private BigInteger rowCount;
    @Column(name = "command")
    private String command;
    @Basic(optional = false)
    @Column(name = "compute_pool_id")
    private int computePoolId;

    public DmExecDistributedRequestSteps() {
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public Integer getStepIndex() {
        return stepIndex;
    }

    public void setStepIndex(Integer stepIndex) {
        this.stepIndex = stepIndex;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
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

    public BigInteger getRowCount() {
        return rowCount;
    }

    public void setRowCount(BigInteger rowCount) {
        this.rowCount = rowCount;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getComputePoolId() {
        return computePoolId;
    }

    public void setComputePoolId(int computePoolId) {
        this.computePoolId = computePoolId;
    }
    
}
