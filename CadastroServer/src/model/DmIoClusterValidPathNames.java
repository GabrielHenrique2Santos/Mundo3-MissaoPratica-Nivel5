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
@Table(name = "dm_io_cluster_valid_path_names")
@NamedQueries({
    @NamedQuery(name = "DmIoClusterValidPathNames.findAll", query = "SELECT d FROM DmIoClusterValidPathNames d"),
    @NamedQuery(name = "DmIoClusterValidPathNames.findByPathName", query = "SELECT d FROM DmIoClusterValidPathNames d WHERE d.pathName = :pathName"),
    @NamedQuery(name = "DmIoClusterValidPathNames.findByClusterOwnerNode", query = "SELECT d FROM DmIoClusterValidPathNames d WHERE d.clusterOwnerNode = :clusterOwnerNode"),
    @NamedQuery(name = "DmIoClusterValidPathNames.findByIsClusterSharedVolume", query = "SELECT d FROM DmIoClusterValidPathNames d WHERE d.isClusterSharedVolume = :isClusterSharedVolume")})
public class DmIoClusterValidPathNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "path_name")
    private String pathName;
    @Column(name = "cluster_owner_node")
    private String clusterOwnerNode;
    @Basic(optional = false)
    @Column(name = "is_cluster_shared_volume")
    private boolean isClusterSharedVolume;

    public DmIoClusterValidPathNames() {
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getClusterOwnerNode() {
        return clusterOwnerNode;
    }

    public void setClusterOwnerNode(String clusterOwnerNode) {
        this.clusterOwnerNode = clusterOwnerNode;
    }

    public boolean getIsClusterSharedVolume() {
        return isClusterSharedVolume;
    }

    public void setIsClusterSharedVolume(boolean isClusterSharedVolume) {
        this.isClusterSharedVolume = isClusterSharedVolume;
    }
    
}
