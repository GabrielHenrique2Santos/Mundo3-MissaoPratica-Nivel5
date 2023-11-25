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
@Table(name = "dm_db_storage_pool_nodes")
@NamedQueries({
    @NamedQuery(name = "DmDbStoragePoolNodes.findAll", query = "SELECT d FROM DmDbStoragePoolNodes d"),
    @NamedQuery(name = "DmDbStoragePoolNodes.findByStoragePoolId", query = "SELECT d FROM DmDbStoragePoolNodes d WHERE d.storagePoolId = :storagePoolId"),
    @NamedQuery(name = "DmDbStoragePoolNodes.findByStoragePoolNodeName", query = "SELECT d FROM DmDbStoragePoolNodes d WHERE d.storagePoolNodeName = :storagePoolNodeName"),
    @NamedQuery(name = "DmDbStoragePoolNodes.findByAddress", query = "SELECT d FROM DmDbStoragePoolNodes d WHERE d.address = :address"),
    @NamedQuery(name = "DmDbStoragePoolNodes.findByState", query = "SELECT d FROM DmDbStoragePoolNodes d WHERE d.state = :state"),
    @NamedQuery(name = "DmDbStoragePoolNodes.findByHealthStatus", query = "SELECT d FROM DmDbStoragePoolNodes d WHERE d.healthStatus = :healthStatus"),
    @NamedQuery(name = "DmDbStoragePoolNodes.findByHealthErrorMessage", query = "SELECT d FROM DmDbStoragePoolNodes d WHERE d.healthErrorMessage = :healthErrorMessage")})
public class DmDbStoragePoolNodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "storage_pool_id")
    private int storagePoolId;
    @Basic(optional = false)
    @Column(name = "storage_pool_node_name")
    private String storagePoolNodeName;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "health_status")
    private String healthStatus;
    @Column(name = "health_error_message")
    private String healthErrorMessage;

    public DmDbStoragePoolNodes() {
    }

    public int getStoragePoolId() {
        return storagePoolId;
    }

    public void setStoragePoolId(int storagePoolId) {
        this.storagePoolId = storagePoolId;
    }

    public String getStoragePoolNodeName() {
        return storagePoolNodeName;
    }

    public void setStoragePoolNodeName(String storagePoolNodeName) {
        this.storagePoolNodeName = storagePoolNodeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getHealthErrorMessage() {
        return healthErrorMessage;
    }

    public void setHealthErrorMessage(String healthErrorMessage) {
        this.healthErrorMessage = healthErrorMessage;
    }
    
}
