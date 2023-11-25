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
@Table(name = "external_data_sources")
@NamedQueries({
    @NamedQuery(name = "ExternalDataSources.findAll", query = "SELECT e FROM ExternalDataSources e"),
    @NamedQuery(name = "ExternalDataSources.findByDataSourceId", query = "SELECT e FROM ExternalDataSources e WHERE e.dataSourceId = :dataSourceId"),
    @NamedQuery(name = "ExternalDataSources.findByName", query = "SELECT e FROM ExternalDataSources e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalDataSources.findByLocation", query = "SELECT e FROM ExternalDataSources e WHERE e.location = :location"),
    @NamedQuery(name = "ExternalDataSources.findByTypeDesc", query = "SELECT e FROM ExternalDataSources e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "ExternalDataSources.findByType", query = "SELECT e FROM ExternalDataSources e WHERE e.type = :type"),
    @NamedQuery(name = "ExternalDataSources.findByResourceManagerLocation", query = "SELECT e FROM ExternalDataSources e WHERE e.resourceManagerLocation = :resourceManagerLocation"),
    @NamedQuery(name = "ExternalDataSources.findByCredentialId", query = "SELECT e FROM ExternalDataSources e WHERE e.credentialId = :credentialId"),
    @NamedQuery(name = "ExternalDataSources.findByDatabaseName", query = "SELECT e FROM ExternalDataSources e WHERE e.databaseName = :databaseName"),
    @NamedQuery(name = "ExternalDataSources.findByShardMapName", query = "SELECT e FROM ExternalDataSources e WHERE e.shardMapName = :shardMapName"),
    @NamedQuery(name = "ExternalDataSources.findByConnectionOptions", query = "SELECT e FROM ExternalDataSources e WHERE e.connectionOptions = :connectionOptions"),
    @NamedQuery(name = "ExternalDataSources.findByPushdown", query = "SELECT e FROM ExternalDataSources e WHERE e.pushdown = :pushdown")})
public class ExternalDataSources implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "data_source_id")
    private int dataSourceId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @Column(name = "type")
    private short type;
    @Column(name = "resource_manager_location")
    private String resourceManagerLocation;
    @Basic(optional = false)
    @Column(name = "credential_id")
    private int credentialId;
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "shard_map_name")
    private String shardMapName;
    @Column(name = "connection_options")
    private String connectionOptions;
    @Basic(optional = false)
    @Column(name = "pushdown")
    private String pushdown;

    public ExternalDataSources() {
    }

    public int getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
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

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getResourceManagerLocation() {
        return resourceManagerLocation;
    }

    public void setResourceManagerLocation(String resourceManagerLocation) {
        this.resourceManagerLocation = resourceManagerLocation;
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getShardMapName() {
        return shardMapName;
    }

    public void setShardMapName(String shardMapName) {
        this.shardMapName = shardMapName;
    }

    public String getConnectionOptions() {
        return connectionOptions;
    }

    public void setConnectionOptions(String connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public String getPushdown() {
        return pushdown;
    }

    public void setPushdown(String pushdown) {
        this.pushdown = pushdown;
    }
    
}
