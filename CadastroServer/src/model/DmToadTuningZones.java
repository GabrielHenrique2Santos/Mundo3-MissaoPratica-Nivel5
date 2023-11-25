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
@Table(name = "dm_toad_tuning_zones")
@NamedQueries({
    @NamedQuery(name = "DmToadTuningZones.findAll", query = "SELECT d FROM DmToadTuningZones d"),
    @NamedQuery(name = "DmToadTuningZones.findByZoneType", query = "SELECT d FROM DmToadTuningZones d WHERE d.zoneType = :zoneType"),
    @NamedQuery(name = "DmToadTuningZones.findByPriorityScore", query = "SELECT d FROM DmToadTuningZones d WHERE d.priorityScore = :priorityScore"),
    @NamedQuery(name = "DmToadTuningZones.findByEntryData", query = "SELECT d FROM DmToadTuningZones d WHERE d.entryData = :entryData"),
    @NamedQuery(name = "DmToadTuningZones.findByActionsDiscovered", query = "SELECT d FROM DmToadTuningZones d WHERE d.actionsDiscovered = :actionsDiscovered"),
    @NamedQuery(name = "DmToadTuningZones.findByActionsScheduled", query = "SELECT d FROM DmToadTuningZones d WHERE d.actionsScheduled = :actionsScheduled"),
    @NamedQuery(name = "DmToadTuningZones.findByTotalActionsScheduled", query = "SELECT d FROM DmToadTuningZones d WHERE d.totalActionsScheduled = :totalActionsScheduled")})
public class DmToadTuningZones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "zone_type")
    private String zoneType;
    @Basic(optional = false)
    @Column(name = "priority_score")
    private long priorityScore;
    @Column(name = "entry_data")
    private String entryData;
    @Basic(optional = false)
    @Column(name = "actions_discovered")
    private long actionsDiscovered;
    @Basic(optional = false)
    @Column(name = "actions_scheduled")
    private long actionsScheduled;
    @Basic(optional = false)
    @Column(name = "total_actions_scheduled")
    private long totalActionsScheduled;

    public DmToadTuningZones() {
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public long getPriorityScore() {
        return priorityScore;
    }

    public void setPriorityScore(long priorityScore) {
        this.priorityScore = priorityScore;
    }

    public String getEntryData() {
        return entryData;
    }

    public void setEntryData(String entryData) {
        this.entryData = entryData;
    }

    public long getActionsDiscovered() {
        return actionsDiscovered;
    }

    public void setActionsDiscovered(long actionsDiscovered) {
        this.actionsDiscovered = actionsDiscovered;
    }

    public long getActionsScheduled() {
        return actionsScheduled;
    }

    public void setActionsScheduled(long actionsScheduled) {
        this.actionsScheduled = actionsScheduled;
    }

    public long getTotalActionsScheduled() {
        return totalActionsScheduled;
    }

    public void setTotalActionsScheduled(long totalActionsScheduled) {
        this.totalActionsScheduled = totalActionsScheduled;
    }
    
}
