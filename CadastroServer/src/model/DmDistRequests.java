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
@Table(name = "dm_dist_requests")
@NamedQueries({
    @NamedQuery(name = "DmDistRequests.findAll", query = "SELECT d FROM DmDistRequests d"),
    @NamedQuery(name = "DmDistRequests.findBySessionId", query = "SELECT d FROM DmDistRequests d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmDistRequests.findByDistStatementId", query = "SELECT d FROM DmDistRequests d WHERE d.distStatementId = :distStatementId"),
    @NamedQuery(name = "DmDistRequests.findByDistClientId", query = "SELECT d FROM DmDistRequests d WHERE d.distClientId = :distClientId")})
public class DmDistRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "session_id")
    private short sessionId;
    @Lob
    @Column(name = "dist_statement_hash")
    private byte[] distStatementHash;
    @Column(name = "dist_statement_id")
    private String distStatementId;
    @Column(name = "dist_client_id")
    private String distClientId;

    public DmDistRequests() {
    }

    public short getSessionId() {
        return sessionId;
    }

    public void setSessionId(short sessionId) {
        this.sessionId = sessionId;
    }

    public byte[] getDistStatementHash() {
        return distStatementHash;
    }

    public void setDistStatementHash(byte[] distStatementHash) {
        this.distStatementHash = distStatementHash;
    }

    public String getDistStatementId() {
        return distStatementId;
    }

    public void setDistStatementId(String distStatementId) {
        this.distStatementId = distStatementId;
    }

    public String getDistClientId() {
        return distClientId;
    }

    public void setDistClientId(String distClientId) {
        this.distClientId = distClientId;
    }
    
}
