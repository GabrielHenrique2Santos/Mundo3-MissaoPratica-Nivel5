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
@Table(name = "dm_xe_map_values")
@NamedQueries({
    @NamedQuery(name = "DmXeMapValues.findAll", query = "SELECT d FROM DmXeMapValues d"),
    @NamedQuery(name = "DmXeMapValues.findByName", query = "SELECT d FROM DmXeMapValues d WHERE d.name = :name"),
    @NamedQuery(name = "DmXeMapValues.findByObjectPackageGuid", query = "SELECT d FROM DmXeMapValues d WHERE d.objectPackageGuid = :objectPackageGuid"),
    @NamedQuery(name = "DmXeMapValues.findByMapKey", query = "SELECT d FROM DmXeMapValues d WHERE d.mapKey = :mapKey"),
    @NamedQuery(name = "DmXeMapValues.findByMapValue", query = "SELECT d FROM DmXeMapValues d WHERE d.mapValue = :mapValue")})
public class DmXeMapValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "object_package_guid")
    private String objectPackageGuid;
    @Basic(optional = false)
    @Column(name = "map_key")
    private int mapKey;
    @Basic(optional = false)
    @Column(name = "map_value")
    private String mapValue;

    public DmXeMapValues() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjectPackageGuid() {
        return objectPackageGuid;
    }

    public void setObjectPackageGuid(String objectPackageGuid) {
        this.objectPackageGuid = objectPackageGuid;
    }

    public int getMapKey() {
        return mapKey;
    }

    public void setMapKey(int mapKey) {
        this.mapKey = mapKey;
    }

    public String getMapValue() {
        return mapValue;
    }

    public void setMapValue(String mapValue) {
        this.mapValue = mapValue;
    }
    
}
