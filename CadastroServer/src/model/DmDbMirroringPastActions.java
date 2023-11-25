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
@Table(name = "dm_db_mirroring_past_actions")
@NamedQueries({
    @NamedQuery(name = "DmDbMirroringPastActions.findAll", query = "SELECT d FROM DmDbMirroringPastActions d"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByMirroringGuid", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.mirroringGuid = :mirroringGuid"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByStateMachineName", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.stateMachineName = :stateMachineName"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByActionType", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByName", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.name = :name"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByCurrentState", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.currentState = :currentState"),
    @NamedQuery(name = "DmDbMirroringPastActions.findByActionSequence", query = "SELECT d FROM DmDbMirroringPastActions d WHERE d.actionSequence = :actionSequence")})
public class DmDbMirroringPastActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "mirroring_guid")
    private String mirroringGuid;
    @Column(name = "state_machine_name")
    private String stateMachineName;
    @Column(name = "action_type")
    private String actionType;
    @Column(name = "name")
    private String name;
    @Column(name = "current_state")
    private String currentState;
    @Basic(optional = false)
    @Column(name = "action_sequence")
    private int actionSequence;

    public DmDbMirroringPastActions() {
    }

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid;
    }

    public String getStateMachineName() {
        return stateMachineName;
    }

    public void setStateMachineName(String stateMachineName) {
        this.stateMachineName = stateMachineName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public int getActionSequence() {
        return actionSequence;
    }

    public void setActionSequence(int actionSequence) {
        this.actionSequence = actionSequence;
    }
    
}
