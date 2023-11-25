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
@Table(name = "dm_database_external_policy_actions")
@NamedQueries({
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findAll", query = "SELECT d FROM DmDatabaseExternalPolicyActions d"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findBySqlActionId", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.sqlActionId = :sqlActionId"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findByActionNamespace", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.actionNamespace = :actionNamespace"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findByActionType", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DmDatabaseExternalPolicyActions.findByActionProviderString", query = "SELECT d FROM DmDatabaseExternalPolicyActions d WHERE d.actionProviderString = :actionProviderString")})
public class DmDatabaseExternalPolicyActions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "sql_action_id")
    private Integer sqlActionId;
    @Column(name = "action_namespace")
    private String actionNamespace;
    @Column(name = "action_type")
    private String actionType;
    @Column(name = "action_provider_string")
    private String actionProviderString;

    public DmDatabaseExternalPolicyActions() {
    }

    public Integer getSqlActionId() {
        return sqlActionId;
    }

    public void setSqlActionId(Integer sqlActionId) {
        this.sqlActionId = sqlActionId;
    }

    public String getActionNamespace() {
        return actionNamespace;
    }

    public void setActionNamespace(String actionNamespace) {
        this.actionNamespace = actionNamespace;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionProviderString() {
        return actionProviderString;
    }

    public void setActionProviderString(String actionProviderString) {
        this.actionProviderString = actionProviderString;
    }
    
}
