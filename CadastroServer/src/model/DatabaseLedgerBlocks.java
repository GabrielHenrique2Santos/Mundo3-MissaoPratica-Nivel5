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
@Table(name = "database_ledger_blocks")
@NamedQueries({
    @NamedQuery(name = "DatabaseLedgerBlocks.findAll", query = "SELECT d FROM DatabaseLedgerBlocks d"),
    @NamedQuery(name = "DatabaseLedgerBlocks.findByBlockId", query = "SELECT d FROM DatabaseLedgerBlocks d WHERE d.blockId = :blockId"),
    @NamedQuery(name = "DatabaseLedgerBlocks.findByBlockSize", query = "SELECT d FROM DatabaseLedgerBlocks d WHERE d.blockSize = :blockSize")})
public class DatabaseLedgerBlocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "block_id")
    private long blockId;
    @Lob
    @Column(name = "transactions_root_hash")
    private byte[] transactionsRootHash;
    @Basic(optional = false)
    @Column(name = "block_size")
    private int blockSize;
    @Lob
    @Column(name = "previous_block_hash")
    private byte[] previousBlockHash;

    public DatabaseLedgerBlocks() {
    }

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(long blockId) {
        this.blockId = blockId;
    }

    public byte[] getTransactionsRootHash() {
        return transactionsRootHash;
    }

    public void setTransactionsRootHash(byte[] transactionsRootHash) {
        this.transactionsRootHash = transactionsRootHash;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public byte[] getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(byte[] previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
    
}
