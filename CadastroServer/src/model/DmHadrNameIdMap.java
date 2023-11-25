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
@Table(name = "dm_hadr_name_id_map")
@NamedQueries({
    @NamedQuery(name = "DmHadrNameIdMap.findAll", query = "SELECT d FROM DmHadrNameIdMap d"),
    @NamedQuery(name = "DmHadrNameIdMap.findByAgName", query = "SELECT d FROM DmHadrNameIdMap d WHERE d.agName = :agName"),
    @NamedQuery(name = "DmHadrNameIdMap.findByAgId", query = "SELECT d FROM DmHadrNameIdMap d WHERE d.agId = :agId"),
    @NamedQuery(name = "DmHadrNameIdMap.findByAgResourceId", query = "SELECT d FROM DmHadrNameIdMap d WHERE d.agResourceId = :agResourceId"),
    @NamedQuery(name = "DmHadrNameIdMap.findByAgGroupId", query = "SELECT d FROM DmHadrNameIdMap d WHERE d.agGroupId = :agGroupId")})
public class DmHadrNameIdMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ag_name")
    private String agName;
    @Basic(optional = false)
    @Column(name = "ag_id")
    private String agId;
    @Basic(optional = false)
    @Column(name = "ag_resource_id")
    private String agResourceId;
    @Basic(optional = false)
    @Column(name = "ag_group_id")
    private String agGroupId;

    public DmHadrNameIdMap() {
    }

    public String getAgName() {
        return agName;
    }

    public void setAgName(String agName) {
        this.agName = agName;
    }

    public String getAgId() {
        return agId;
    }

    public void setAgId(String agId) {
        this.agId = agId;
    }

    public String getAgResourceId() {
        return agResourceId;
    }

    public void setAgResourceId(String agResourceId) {
        this.agResourceId = agResourceId;
    }

    public String getAgGroupId() {
        return agGroupId;
    }

    public void setAgGroupId(String agGroupId) {
        this.agGroupId = agGroupId;
    }
    
}
