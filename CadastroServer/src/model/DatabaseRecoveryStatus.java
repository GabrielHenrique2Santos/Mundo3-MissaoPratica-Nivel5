/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "database_recovery_status")
@NamedQueries({
    @NamedQuery(name = "DatabaseRecoveryStatus.findAll", query = "SELECT d FROM DatabaseRecoveryStatus d"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByDatabaseId", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByDatabaseGuid", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.databaseGuid = :databaseGuid"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByFamilyGuid", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.familyGuid = :familyGuid"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByLastLogBackupLsn", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.lastLogBackupLsn = :lastLogBackupLsn"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByRecoveryForkGuid", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.recoveryForkGuid = :recoveryForkGuid"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByFirstRecoveryForkGuid", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.firstRecoveryForkGuid = :firstRecoveryForkGuid"),
    @NamedQuery(name = "DatabaseRecoveryStatus.findByForkPointLsn", query = "SELECT d FROM DatabaseRecoveryStatus d WHERE d.forkPointLsn = :forkPointLsn")})
public class DatabaseRecoveryStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "database_id")
    private int databaseId;
    @Column(name = "database_guid")
    private String databaseGuid;
    @Column(name = "family_guid")
    private String familyGuid;
    @Column(name = "last_log_backup_lsn")
    private BigInteger lastLogBackupLsn;
    @Column(name = "recovery_fork_guid")
    private String recoveryForkGuid;
    @Column(name = "first_recovery_fork_guid")
    private String firstRecoveryForkGuid;
    @Column(name = "fork_point_lsn")
    private BigInteger forkPointLsn;

    public DatabaseRecoveryStatus() {
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public String getDatabaseGuid() {
        return databaseGuid;
    }

    public void setDatabaseGuid(String databaseGuid) {
        this.databaseGuid = databaseGuid;
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid;
    }

    public BigInteger getLastLogBackupLsn() {
        return lastLogBackupLsn;
    }

    public void setLastLogBackupLsn(BigInteger lastLogBackupLsn) {
        this.lastLogBackupLsn = lastLogBackupLsn;
    }

    public String getRecoveryForkGuid() {
        return recoveryForkGuid;
    }

    public void setRecoveryForkGuid(String recoveryForkGuid) {
        this.recoveryForkGuid = recoveryForkGuid;
    }

    public String getFirstRecoveryForkGuid() {
        return firstRecoveryForkGuid;
    }

    public void setFirstRecoveryForkGuid(String firstRecoveryForkGuid) {
        this.firstRecoveryForkGuid = firstRecoveryForkGuid;
    }

    public BigInteger getForkPointLsn() {
        return forkPointLsn;
    }

    public void setForkPointLsn(BigInteger forkPointLsn) {
        this.forkPointLsn = forkPointLsn;
    }
    
}
