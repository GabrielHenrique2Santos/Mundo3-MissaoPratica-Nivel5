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
@Table(name = "backup_devices")
@NamedQueries({
    @NamedQuery(name = "BackupDevices.findAll", query = "SELECT b FROM BackupDevices b"),
    @NamedQuery(name = "BackupDevices.findByName", query = "SELECT b FROM BackupDevices b WHERE b.name = :name"),
    @NamedQuery(name = "BackupDevices.findByType", query = "SELECT b FROM BackupDevices b WHERE b.type = :type"),
    @NamedQuery(name = "BackupDevices.findByTypeDesc", query = "SELECT b FROM BackupDevices b WHERE b.typeDesc = :typeDesc"),
    @NamedQuery(name = "BackupDevices.findByPhysicalName", query = "SELECT b FROM BackupDevices b WHERE b.physicalName = :physicalName")})
public class BackupDevices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private Short type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "physical_name")
    private String physicalName;

    public BackupDevices() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }
    
}
