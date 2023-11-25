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
@Table(name = "dm_db_data_pools")
@NamedQueries({
    @NamedQuery(name = "DmDbDataPools.findAll", query = "SELECT d FROM DmDbDataPools d"),
    @NamedQuery(name = "DmDbDataPools.findByDataPoolId", query = "SELECT d FROM DmDbDataPools d WHERE d.dataPoolId = :dataPoolId"),
    @NamedQuery(name = "DmDbDataPools.findByName", query = "SELECT d FROM DmDbDataPools d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbDataPools.findByLocation", query = "SELECT d FROM DmDbDataPools d WHERE d.location = :location")})
public class DmDbDataPools implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "data_pool_id")
    private int dataPoolId;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;

    public DmDbDataPools() {
    }

    public int getDataPoolId() {
        return dataPoolId;
    }

    public void setDataPoolId(int dataPoolId) {
        this.dataPoolId = dataPoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
