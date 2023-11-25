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
@Table(name = "dm_fts_fdhosts")
@NamedQueries({
    @NamedQuery(name = "DmFtsFdhosts.findAll", query = "SELECT d FROM DmFtsFdhosts d"),
    @NamedQuery(name = "DmFtsFdhosts.findByFdhostId", query = "SELECT d FROM DmFtsFdhosts d WHERE d.fdhostId = :fdhostId"),
    @NamedQuery(name = "DmFtsFdhosts.findByFdhostName", query = "SELECT d FROM DmFtsFdhosts d WHERE d.fdhostName = :fdhostName"),
    @NamedQuery(name = "DmFtsFdhosts.findByFdhostProcessId", query = "SELECT d FROM DmFtsFdhosts d WHERE d.fdhostProcessId = :fdhostProcessId"),
    @NamedQuery(name = "DmFtsFdhosts.findByFdhostType", query = "SELECT d FROM DmFtsFdhosts d WHERE d.fdhostType = :fdhostType"),
    @NamedQuery(name = "DmFtsFdhosts.findByMaxThread", query = "SELECT d FROM DmFtsFdhosts d WHERE d.maxThread = :maxThread"),
    @NamedQuery(name = "DmFtsFdhosts.findByBatchCount", query = "SELECT d FROM DmFtsFdhosts d WHERE d.batchCount = :batchCount")})
public class DmFtsFdhosts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "fdhost_id")
    private int fdhostId;
    @Column(name = "fdhost_name")
    private String fdhostName;
    @Basic(optional = false)
    @Column(name = "fdhost_process_id")
    private int fdhostProcessId;
    @Column(name = "fdhost_type")
    private String fdhostType;
    @Basic(optional = false)
    @Column(name = "max_thread")
    private int maxThread;
    @Basic(optional = false)
    @Column(name = "batch_count")
    private int batchCount;

    public DmFtsFdhosts() {
    }

    public int getFdhostId() {
        return fdhostId;
    }

    public void setFdhostId(int fdhostId) {
        this.fdhostId = fdhostId;
    }

    public String getFdhostName() {
        return fdhostName;
    }

    public void setFdhostName(String fdhostName) {
        this.fdhostName = fdhostName;
    }

    public int getFdhostProcessId() {
        return fdhostProcessId;
    }

    public void setFdhostProcessId(int fdhostProcessId) {
        this.fdhostProcessId = fdhostProcessId;
    }

    public String getFdhostType() {
        return fdhostType;
    }

    public void setFdhostType(String fdhostType) {
        this.fdhostType = fdhostType;
    }

    public int getMaxThread() {
        return maxThread;
    }

    public void setMaxThread(int maxThread) {
        this.maxThread = maxThread;
    }

    public int getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(int batchCount) {
        this.batchCount = batchCount;
    }
    
}
