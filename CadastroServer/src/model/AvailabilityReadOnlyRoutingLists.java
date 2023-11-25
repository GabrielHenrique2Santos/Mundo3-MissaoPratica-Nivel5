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
@Table(name = "availability_read_only_routing_lists")
@NamedQueries({
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findAll", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a"),
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findByReplicaId", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a WHERE a.replicaId = :replicaId"),
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findByRoutingPriority", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a WHERE a.routingPriority = :routingPriority"),
    @NamedQuery(name = "AvailabilityReadOnlyRoutingLists.findByReadOnlyReplicaId", query = "SELECT a FROM AvailabilityReadOnlyRoutingLists a WHERE a.readOnlyReplicaId = :readOnlyReplicaId")})
public class AvailabilityReadOnlyRoutingLists implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "replica_id")
    private String replicaId;
    @Basic(optional = false)
    @Column(name = "routing_priority")
    private int routingPriority;
    @Basic(optional = false)
    @Column(name = "read_only_replica_id")
    private String readOnlyReplicaId;

    public AvailabilityReadOnlyRoutingLists() {
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public int getRoutingPriority() {
        return routingPriority;
    }

    public void setRoutingPriority(int routingPriority) {
        this.routingPriority = routingPriority;
    }

    public String getReadOnlyReplicaId() {
        return readOnlyReplicaId;
    }

    public void setReadOnlyReplicaId(String readOnlyReplicaId) {
        this.readOnlyReplicaId = readOnlyReplicaId;
    }
    
}
