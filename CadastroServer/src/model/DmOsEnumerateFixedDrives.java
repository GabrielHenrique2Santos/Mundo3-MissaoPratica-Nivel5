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
@Table(name = "dm_os_enumerate_fixed_drives")
@NamedQueries({
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findAll", query = "SELECT d FROM DmOsEnumerateFixedDrives d"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByFixedDrivePath", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.fixedDrivePath = :fixedDrivePath"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByDriveType", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.driveType = :driveType"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByDriveTypeDesc", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.driveTypeDesc = :driveTypeDesc"),
    @NamedQuery(name = "DmOsEnumerateFixedDrives.findByFreeSpaceInBytes", query = "SELECT d FROM DmOsEnumerateFixedDrives d WHERE d.freeSpaceInBytes = :freeSpaceInBytes")})
public class DmOsEnumerateFixedDrives implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "fixed_drive_path")
    private String fixedDrivePath;
    @Basic(optional = false)
    @Column(name = "drive_type")
    private int driveType;
    @Column(name = "drive_type_desc")
    private String driveTypeDesc;
    @Basic(optional = false)
    @Column(name = "free_space_in_bytes")
    private long freeSpaceInBytes;

    public DmOsEnumerateFixedDrives() {
    }

    public String getFixedDrivePath() {
        return fixedDrivePath;
    }

    public void setFixedDrivePath(String fixedDrivePath) {
        this.fixedDrivePath = fixedDrivePath;
    }

    public int getDriveType() {
        return driveType;
    }

    public void setDriveType(int driveType) {
        this.driveType = driveType;
    }

    public String getDriveTypeDesc() {
        return driveTypeDesc;
    }

    public void setDriveTypeDesc(String driveTypeDesc) {
        this.driveTypeDesc = driveTypeDesc;
    }

    public long getFreeSpaceInBytes() {
        return freeSpaceInBytes;
    }

    public void setFreeSpaceInBytes(long freeSpaceInBytes) {
        this.freeSpaceInBytes = freeSpaceInBytes;
    }
    
}
