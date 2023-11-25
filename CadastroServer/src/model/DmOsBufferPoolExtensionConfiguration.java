/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "dm_os_buffer_pool_extension_configuration")
@NamedQueries({
    @NamedQuery(name = "DmOsBufferPoolExtensionConfiguration.findAll", query = "SELECT d FROM DmOsBufferPoolExtensionConfiguration d"),
    @NamedQuery(name = "DmOsBufferPoolExtensionConfiguration.findByPath", query = "SELECT d FROM DmOsBufferPoolExtensionConfiguration d WHERE d.path = :path"),
    @NamedQuery(name = "DmOsBufferPoolExtensionConfiguration.findByFileId", query = "SELECT d FROM DmOsBufferPoolExtensionConfiguration d WHERE d.fileId = :fileId"),
    @NamedQuery(name = "DmOsBufferPoolExtensionConfiguration.findByState", query = "SELECT d FROM DmOsBufferPoolExtensionConfiguration d WHERE d.state = :state"),
    @NamedQuery(name = "DmOsBufferPoolExtensionConfiguration.findByStateDescription", query = "SELECT d FROM DmOsBufferPoolExtensionConfiguration d WHERE d.stateDescription = :stateDescription"),
    @NamedQuery(name = "DmOsBufferPoolExtensionConfiguration.findByCurrentSizeInKb", query = "SELECT d FROM DmOsBufferPoolExtensionConfiguration d WHERE d.currentSizeInKb = :currentSizeInKb")})
public class DmOsBufferPoolExtensionConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "path")
    private String path;
    @Column(name = "file_id")
    private Integer fileId;
    @Column(name = "state")
    private Integer state;
    @Basic(optional = false)
    @Column(name = "state_description")
    private String stateDescription;
    @Column(name = "current_size_in_kb")
    private BigInteger currentSizeInKb;

    public DmOsBufferPoolExtensionConfiguration() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public BigInteger getCurrentSizeInKb() {
        return currentSizeInKb;
    }

    public void setCurrentSizeInKb(BigInteger currentSizeInKb) {
        this.currentSizeInKb = currentSizeInKb;
    }
    
}
