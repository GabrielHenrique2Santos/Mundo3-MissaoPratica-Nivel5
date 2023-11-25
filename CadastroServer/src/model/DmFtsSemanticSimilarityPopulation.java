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
@Table(name = "dm_fts_semantic_similarity_population")
@NamedQueries({
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findAll", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByDatabaseId", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByCatalogId", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.catalogId = :catalogId"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByTableId", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.tableId = :tableId"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByDocumentCount", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.documentCount = :documentCount"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByDocumentProcessedCount", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.documentProcessedCount = :documentProcessedCount"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByCompletionType", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.completionType = :completionType"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByCompletionTypeDescription", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.completionTypeDescription = :completionTypeDescription"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByWorkerCount", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.workerCount = :workerCount"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByStatus", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.status = :status"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByStatusDescription", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.statusDescription = :statusDescription"),
    @NamedQuery(name = "DmFtsSemanticSimilarityPopulation.findByStartTime", query = "SELECT d FROM DmFtsSemanticSimilarityPopulation d WHERE d.startTime = :startTime")})
public class DmFtsSemanticSimilarityPopulation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "database_id")
    private int databaseId;
    @Basic(optional = false)
    @Column(name = "catalog_id")
    private int catalogId;
    @Basic(optional = false)
    @Column(name = "table_id")
    private int tableId;
    @Basic(optional = false)
    @Column(name = "document_count")
    private long documentCount;
    @Basic(optional = false)
    @Column(name = "document_processed_count")
    private long documentProcessedCount;
    @Basic(optional = false)
    @Column(name = "completion_type")
    private int completionType;
    @Column(name = "completion_type_description")
    private String completionTypeDescription;
    @Basic(optional = false)
    @Column(name = "worker_count")
    private int workerCount;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Column(name = "status_description")
    private String statusDescription;
    @Basic(optional = false)
    @Column(name = "start_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @Lob
    @Column(name = "incremental_timestamp")
    private byte[] incrementalTimestamp;

    public DmFtsSemanticSimilarityPopulation() {
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

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public long getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(long documentCount) {
        this.documentCount = documentCount;
    }

    public long getDocumentProcessedCount() {
        return documentProcessedCount;
    }

    public void setDocumentProcessedCount(long documentProcessedCount) {
        this.documentProcessedCount = documentProcessedCount;
    }

    public int getCompletionType() {
        return completionType;
    }

    public void setCompletionType(int completionType) {
        this.completionType = completionType;
    }

    public String getCompletionTypeDescription() {
        return completionTypeDescription;
    }

    public void setCompletionTypeDescription(String completionTypeDescription) {
        this.completionTypeDescription = completionTypeDescription;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }
    
}
