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
@Table(name = "dm_fts_active_catalogs")
@NamedQueries({
    @NamedQuery(name = "DmFtsActiveCatalogs.findAll", query = "SELECT d FROM DmFtsActiveCatalogs d"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByDatabaseId", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByCatalogId", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.catalogId = :catalogId"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByName", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.name = :name"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByIsPaused", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.isPaused = :isPaused"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByStatus", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.status = :status"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByStatusDescription", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.statusDescription = :statusDescription"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByPreviousStatus", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.previousStatus = :previousStatus"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByPreviousStatusDescription", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.previousStatusDescription = :previousStatusDescription"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByWorkerCount", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.workerCount = :workerCount"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByActiveFtsIndexCount", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.activeFtsIndexCount = :activeFtsIndexCount"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByAutoPopulationCount", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.autoPopulationCount = :autoPopulationCount"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByManualPopulationCount", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.manualPopulationCount = :manualPopulationCount"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByFullIncrementalPopulationCount", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.fullIncrementalPopulationCount = :fullIncrementalPopulationCount"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByRowCountInThousands", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.rowCountInThousands = :rowCountInThousands"),
    @NamedQuery(name = "DmFtsActiveCatalogs.findByIsImporting", query = "SELECT d FROM DmFtsActiveCatalogs d WHERE d.isImporting = :isImporting")})
public class DmFtsActiveCatalogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @Column(name = "catalog_id")
    private int catalogId;
    @Basic(optional = false)
    @Lob
    @Column(name = "memory_address")
    private byte[] memoryAddress;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "is_paused")
    private boolean isPaused;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Column(name = "status_description")
    private String statusDescription;
    @Basic(optional = false)
    @Column(name = "previous_status")
    private int previousStatus;
    @Column(name = "previous_status_description")
    private String previousStatusDescription;
    @Basic(optional = false)
    @Column(name = "worker_count")
    private int workerCount;
    @Basic(optional = false)
    @Column(name = "active_fts_index_count")
    private int activeFtsIndexCount;
    @Basic(optional = false)
    @Column(name = "auto_population_count")
    private int autoPopulationCount;
    @Basic(optional = false)
    @Column(name = "manual_population_count")
    private int manualPopulationCount;
    @Basic(optional = false)
    @Column(name = "full_incremental_population_count")
    private int fullIncrementalPopulationCount;
    @Basic(optional = false)
    @Column(name = "row_count_in_thousands")
    private int rowCountInThousands;
    @Basic(optional = false)
    @Column(name = "is_importing")
    private boolean isImporting;

    public DmFtsActiveCatalogs() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
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

    public boolean getIsPaused() {
        return isPaused;
    }

    public void setIsPaused(boolean isPaused) {
        this.isPaused = isPaused;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public int getPreviousStatus() {
        return previousStatus;
    }

    public void setPreviousStatus(int previousStatus) {
        this.previousStatus = previousStatus;
    }

    public String getPreviousStatusDescription() {
        return previousStatusDescription;
    }

    public void setPreviousStatusDescription(String previousStatusDescription) {
        this.previousStatusDescription = previousStatusDescription;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getActiveFtsIndexCount() {
        return activeFtsIndexCount;
    }

    public void setActiveFtsIndexCount(int activeFtsIndexCount) {
        this.activeFtsIndexCount = activeFtsIndexCount;
    }

    public int getAutoPopulationCount() {
        return autoPopulationCount;
    }

    public void setAutoPopulationCount(int autoPopulationCount) {
        this.autoPopulationCount = autoPopulationCount;
    }

    public int getManualPopulationCount() {
        return manualPopulationCount;
    }

    public void setManualPopulationCount(int manualPopulationCount) {
        this.manualPopulationCount = manualPopulationCount;
    }

    public int getFullIncrementalPopulationCount() {
        return fullIncrementalPopulationCount;
    }

    public void setFullIncrementalPopulationCount(int fullIncrementalPopulationCount) {
        this.fullIncrementalPopulationCount = fullIncrementalPopulationCount;
    }

    public int getRowCountInThousands() {
        return rowCountInThousands;
    }

    public void setRowCountInThousands(int rowCountInThousands) {
        this.rowCountInThousands = rowCountInThousands;
    }

    public boolean getIsImporting() {
        return isImporting;
    }

    public void setIsImporting(boolean isImporting) {
        this.isImporting = isImporting;
    }
    
}
