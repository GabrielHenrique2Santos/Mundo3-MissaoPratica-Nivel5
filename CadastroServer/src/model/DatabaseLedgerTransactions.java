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
@Table(name = "database_ledger_transactions")
@NamedQueries({
    @NamedQuery(name = "DatabaseLedgerTransactions.findAll", query = "SELECT d FROM DatabaseLedgerTransactions d"),
    @NamedQuery(name = "DatabaseLedgerTransactions.findByTransactionId", query = "SELECT d FROM DatabaseLedgerTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DatabaseLedgerTransactions.findByBlockId", query = "SELECT d FROM DatabaseLedgerTransactions d WHERE d.blockId = :blockId"),
    @NamedQuery(name = "DatabaseLedgerTransactions.findByTransactionOrdinal", query = "SELECT d FROM DatabaseLedgerTransactions d WHERE d.transactionOrdinal = :transactionOrdinal"),
    @NamedQuery(name = "DatabaseLedgerTransactions.findByCommitTime", query = "SELECT d FROM DatabaseLedgerTransactions d WHERE d.commitTime = :commitTime"),
    @NamedQuery(name = "DatabaseLedgerTransactions.findByPrincipalName", query = "SELECT d FROM DatabaseLedgerTransactions d WHERE d.principalName = :principalName")})
public class DatabaseLedgerTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "transaction_id")
    private long transactionId;
    @Basic(optional = false)
    @Column(name = "block_id")
    private long blockId;
    @Basic(optional = false)
    @Column(name = "transaction_ordinal")
    private int transactionOrdinal;
    @Basic(optional = false)
    @Column(name = "commit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commitTime;
    @Basic(optional = false)
    @Column(name = "principal_name")
    private String principalName;
    @Lob
    @Column(name = "table_hashes")
    private byte[] tableHashes;

    public DatabaseLedgerTransactions() {
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(long blockId) {
        this.blockId = blockId;
    }

    public int getTransactionOrdinal() {
        return transactionOrdinal;
    }

    public void setTransactionOrdinal(int transactionOrdinal) {
        this.transactionOrdinal = transactionOrdinal;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public byte[] getTableHashes() {
        return tableHashes;
    }

    public void setTableHashes(byte[] tableHashes) {
        this.tableHashes = tableHashes;
    }
    
}
