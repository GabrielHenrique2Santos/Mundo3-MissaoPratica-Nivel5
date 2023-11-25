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
@Table(name = "fulltext_catalogs")
@NamedQueries({
    @NamedQuery(name = "FulltextCatalogs.findAll", query = "SELECT f FROM FulltextCatalogs f"),
    @NamedQuery(name = "FulltextCatalogs.findByFulltextCatalogId", query = "SELECT f FROM FulltextCatalogs f WHERE f.fulltextCatalogId = :fulltextCatalogId"),
    @NamedQuery(name = "FulltextCatalogs.findByName", query = "SELECT f FROM FulltextCatalogs f WHERE f.name = :name"),
    @NamedQuery(name = "FulltextCatalogs.findByPath", query = "SELECT f FROM FulltextCatalogs f WHERE f.path = :path"),
    @NamedQuery(name = "FulltextCatalogs.findByIsDefault", query = "SELECT f FROM FulltextCatalogs f WHERE f.isDefault = :isDefault"),
    @NamedQuery(name = "FulltextCatalogs.findByIsAccentSensitivityOn", query = "SELECT f FROM FulltextCatalogs f WHERE f.isAccentSensitivityOn = :isAccentSensitivityOn"),
    @NamedQuery(name = "FulltextCatalogs.findByDataSpaceId", query = "SELECT f FROM FulltextCatalogs f WHERE f.dataSpaceId = :dataSpaceId"),
    @NamedQuery(name = "FulltextCatalogs.findByFileId", query = "SELECT f FROM FulltextCatalogs f WHERE f.fileId = :fileId"),
    @NamedQuery(name = "FulltextCatalogs.findByPrincipalId", query = "SELECT f FROM FulltextCatalogs f WHERE f.principalId = :principalId"),
    @NamedQuery(name = "FulltextCatalogs.findByIsImporting", query = "SELECT f FROM FulltextCatalogs f WHERE f.isImporting = :isImporting")})
public class FulltextCatalogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "fulltext_catalog_id")
    private int fulltextCatalogId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "path")
    private String path;
    @Basic(optional = false)
    @Column(name = "is_default")
    private boolean isDefault;
    @Basic(optional = false)
    @Column(name = "is_accent_sensitivity_on")
    private boolean isAccentSensitivityOn;
    @Column(name = "data_space_id")
    private Integer dataSpaceId;
    @Column(name = "file_id")
    private Integer fileId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @Column(name = "is_importing")
    private boolean isImporting;

    public FulltextCatalogs() {
    }

    public int getFulltextCatalogId() {
        return fulltextCatalogId;
    }

    public void setFulltextCatalogId(int fulltextCatalogId) {
        this.fulltextCatalogId = fulltextCatalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean getIsAccentSensitivityOn() {
        return isAccentSensitivityOn;
    }

    public void setIsAccentSensitivityOn(boolean isAccentSensitivityOn) {
        this.isAccentSensitivityOn = isAccentSensitivityOn;
    }

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public boolean getIsImporting() {
        return isImporting;
    }

    public void setIsImporting(boolean isImporting) {
        this.isImporting = isImporting;
    }
    
}
