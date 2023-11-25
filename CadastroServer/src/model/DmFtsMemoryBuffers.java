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
@Table(name = "dm_fts_memory_buffers")
@NamedQueries({
    @NamedQuery(name = "DmFtsMemoryBuffers.findAll", query = "SELECT d FROM DmFtsMemoryBuffers d"),
    @NamedQuery(name = "DmFtsMemoryBuffers.findByPoolId", query = "SELECT d FROM DmFtsMemoryBuffers d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmFtsMemoryBuffers.findByName", query = "SELECT d FROM DmFtsMemoryBuffers d WHERE d.name = :name"),
    @NamedQuery(name = "DmFtsMemoryBuffers.findByIsFree", query = "SELECT d FROM DmFtsMemoryBuffers d WHERE d.isFree = :isFree"),
    @NamedQuery(name = "DmFtsMemoryBuffers.findByRowCount", query = "SELECT d FROM DmFtsMemoryBuffers d WHERE d.rowCount = :rowCount"),
    @NamedQuery(name = "DmFtsMemoryBuffers.findByBytesUsed", query = "SELECT d FROM DmFtsMemoryBuffers d WHERE d.bytesUsed = :bytesUsed"),
    @NamedQuery(name = "DmFtsMemoryBuffers.findByPercentUsed", query = "SELECT d FROM DmFtsMemoryBuffers d WHERE d.percentUsed = :percentUsed")})
public class DmFtsMemoryBuffers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "is_free")
    private boolean isFree;
    @Basic(optional = false)
    @Column(name = "row_count")
    private int rowCount;
    @Basic(optional = false)
    @Column(name = "bytes_used")
    private int bytesUsed;
    @Basic(optional = false)
    @Column(name = "percent_used")
    private int percentUsed;

    public DmFtsMemoryBuffers() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getBytesUsed() {
        return bytesUsed;
    }

    public void setBytesUsed(int bytesUsed) {
        this.bytesUsed = bytesUsed;
    }

    public int getPercentUsed() {
        return percentUsed;
    }

    public void setPercentUsed(int percentUsed) {
        this.percentUsed = percentUsed;
    }
    
}
