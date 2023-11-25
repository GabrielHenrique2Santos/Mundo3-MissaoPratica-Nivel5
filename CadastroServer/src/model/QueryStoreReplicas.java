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
@Table(name = "query_store_replicas")
@NamedQueries({
    @NamedQuery(name = "QueryStoreReplicas.findAll", query = "SELECT q FROM QueryStoreReplicas q"),
    @NamedQuery(name = "QueryStoreReplicas.findByReplicaGroupId", query = "SELECT q FROM QueryStoreReplicas q WHERE q.replicaGroupId = :replicaGroupId"),
    @NamedQuery(name = "QueryStoreReplicas.findByRoleType", query = "SELECT q FROM QueryStoreReplicas q WHERE q.roleType = :roleType"),
    @NamedQuery(name = "QueryStoreReplicas.findByReplicaName", query = "SELECT q FROM QueryStoreReplicas q WHERE q.replicaName = :replicaName")})
public class QueryStoreReplicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "replica_group_id")
    private long replicaGroupId;
    @Basic(optional = false)
    @Column(name = "role_type")
    private short roleType;
    @Column(name = "replica_name")
    private String replicaName;

    public QueryStoreReplicas() {
    }

    public long getReplicaGroupId() {
        return replicaGroupId;
    }

    public void setReplicaGroupId(long replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
    }

    public short getRoleType() {
        return roleType;
    }

    public void setRoleType(short roleType) {
        this.roleType = roleType;
    }

    public String getReplicaName() {
        return replicaName;
    }

    public void setReplicaName(String replicaName) {
        this.replicaName = replicaName;
    }
    
}
