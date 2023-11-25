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
@Table(name = "dm_fts_population_ranges")
@NamedQueries({
    @NamedQuery(name = "DmFtsPopulationRanges.findAll", query = "SELECT d FROM DmFtsPopulationRanges d"),
    @NamedQuery(name = "DmFtsPopulationRanges.findByIsRetry", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.isRetry = :isRetry"),
    @NamedQuery(name = "DmFtsPopulationRanges.findBySessionId", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmFtsPopulationRanges.findByProcessedRowCount", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.processedRowCount = :processedRowCount"),
    @NamedQuery(name = "DmFtsPopulationRanges.findByErrorCount", query = "SELECT d FROM DmFtsPopulationRanges d WHERE d.errorCount = :errorCount")})
public class DmFtsPopulationRanges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @Lob
    @Column(name = "parent_memory_address")
    private byte[] parentMemoryAddress;
    @Basic(optional = false)
    @Column(name = "is_retry")
    private boolean isRetry;
    @Basic(optional = false)
    @Column(name = "session_id")
    private short sessionId;
    @Basic(optional = false)
    @Column(name = "processed_row_count")
    private int processedRowCount;
    @Basic(optional = false)
    @Column(name = "error_count")
    private int errorCount;

    public DmFtsPopulationRanges() {
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getParentMemoryAddress() {
        return parentMemoryAddress;
    }

    public void setParentMemoryAddress(byte[] parentMemoryAddress) {
        this.parentMemoryAddress = parentMemoryAddress;
    }

    public boolean getIsRetry() {
        return isRetry;
    }

    public void setIsRetry(boolean isRetry) {
        this.isRetry = isRetry;
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public int getProcessedRowCount() {
        return processedRowCount;
    }

    public void setProcessedRowCount(int processedRowCount) {
        this.processedRowCount = processedRowCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
    
}
