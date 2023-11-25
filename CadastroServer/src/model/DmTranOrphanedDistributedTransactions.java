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
@Table(name = "dm_tran_orphaned_distributed_transactions")
@NamedQueries({
    @NamedQuery(name = "DmTranOrphanedDistributedTransactions.findAll", query = "SELECT d FROM DmTranOrphanedDistributedTransactions d"),
    @NamedQuery(name = "DmTranOrphanedDistributedTransactions.findByTransactionUow", query = "SELECT d FROM DmTranOrphanedDistributedTransactions d WHERE d.transactionUow = :transactionUow"),
    @NamedQuery(name = "DmTranOrphanedDistributedTransactions.findByDescription", query = "SELECT d FROM DmTranOrphanedDistributedTransactions d WHERE d.description = :description"),
    @NamedQuery(name = "DmTranOrphanedDistributedTransactions.findByState", query = "SELECT d FROM DmTranOrphanedDistributedTransactions d WHERE d.state = :state"),
    @NamedQuery(name = "DmTranOrphanedDistributedTransactions.findByIsolationLevel", query = "SELECT d FROM DmTranOrphanedDistributedTransactions d WHERE d.isolationLevel = :isolationLevel"),
    @NamedQuery(name = "DmTranOrphanedDistributedTransactions.findByParent", query = "SELECT d FROM DmTranOrphanedDistributedTransactions d WHERE d.parent = :parent")})
public class DmTranOrphanedDistributedTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_uow")
    private String transactionUow;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "isolation_level")
    private int isolationLevel;
    @Column(name = "parent")
    private String parent;

    public DmTranOrphanedDistributedTransactions() {
    }

    public String getTransactionUow() {
        return transactionUow;
    }

    public void setTransactionUow(String transactionUow) {
        this.transactionUow = transactionUow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getIsolationLevel() {
        return isolationLevel;
    }

    public void setIsolationLevel(int isolationLevel) {
        this.isolationLevel = isolationLevel;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    
}
