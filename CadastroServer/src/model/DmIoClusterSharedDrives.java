/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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
@Table(name = "dm_io_cluster_shared_drives")
@NamedQueries({
    @NamedQuery(name = "DmIoClusterSharedDrives.findAll", query = "SELECT d FROM DmIoClusterSharedDrives d"),
    @NamedQuery(name = "DmIoClusterSharedDrives.findByDriveName", query = "SELECT d FROM DmIoClusterSharedDrives d WHERE d.driveName = :driveName")})
public class DmIoClusterSharedDrives implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "DriveName")
    private String driveName;

    public DmIoClusterSharedDrives() {
    }

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }
    
}
