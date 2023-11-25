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
@Table(name = "dm_xe_session_event_actions")
@NamedQueries({
    @NamedQuery(name = "DmXeSessionEventActions.findAll", query = "SELECT d FROM DmXeSessionEventActions d"),
    @NamedQuery(name = "DmXeSessionEventActions.findByActionName", query = "SELECT d FROM DmXeSessionEventActions d WHERE d.actionName = :actionName"),
    @NamedQuery(name = "DmXeSessionEventActions.findByActionPackageGuid", query = "SELECT d FROM DmXeSessionEventActions d WHERE d.actionPackageGuid = :actionPackageGuid"),
    @NamedQuery(name = "DmXeSessionEventActions.findByEventName", query = "SELECT d FROM DmXeSessionEventActions d WHERE d.eventName = :eventName"),
    @NamedQuery(name = "DmXeSessionEventActions.findByEventPackageGuid", query = "SELECT d FROM DmXeSessionEventActions d WHERE d.eventPackageGuid = :eventPackageGuid")})
public class DmXeSessionEventActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "event_session_address")
    private byte[] eventSessionAddress;
    @Basic(optional = false)
    @Column(name = "action_name")
    private String actionName;
    @Basic(optional = false)
    @Column(name = "action_package_guid")
    private String actionPackageGuid;
    @Basic(optional = false)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "event_package_guid")
    private String eventPackageGuid;

    public DmXeSessionEventActions() {
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionPackageGuid() {
        return actionPackageGuid;
    }

    public void setActionPackageGuid(String actionPackageGuid) {
        this.actionPackageGuid = actionPackageGuid;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPackageGuid() {
        return eventPackageGuid;
    }

    public void setEventPackageGuid(String eventPackageGuid) {
        this.eventPackageGuid = eventPackageGuid;
    }
    
}
