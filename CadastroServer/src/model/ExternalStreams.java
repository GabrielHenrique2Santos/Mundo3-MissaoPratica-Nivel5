/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "external_streams")
@NamedQueries({
    @NamedQuery(name = "ExternalStreams.findAll", query = "SELECT e FROM ExternalStreams e"),
    @NamedQuery(name = "ExternalStreams.findByName", query = "SELECT e FROM ExternalStreams e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalStreams.findByObjectId", query = "SELECT e FROM ExternalStreams e WHERE e.objectId = :objectId"),
    @NamedQuery(name = "ExternalStreams.findByPrincipalId", query = "SELECT e FROM ExternalStreams e WHERE e.principalId = :principalId"),
    @NamedQuery(name = "ExternalStreams.findBySchemaId", query = "SELECT e FROM ExternalStreams e WHERE e.schemaId = :schemaId"),
    @NamedQuery(name = "ExternalStreams.findByParentObjectId", query = "SELECT e FROM ExternalStreams e WHERE e.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "ExternalStreams.findByType", query = "SELECT e FROM ExternalStreams e WHERE e.type = :type"),
    @NamedQuery(name = "ExternalStreams.findByTypeDesc", query = "SELECT e FROM ExternalStreams e WHERE e.typeDesc = :typeDesc"),
    @NamedQuery(name = "ExternalStreams.findByCreateDate", query = "SELECT e FROM ExternalStreams e WHERE e.createDate = :createDate"),
    @NamedQuery(name = "ExternalStreams.findByModifyDate", query = "SELECT e FROM ExternalStreams e WHERE e.modifyDate = :modifyDate"),
    @NamedQuery(name = "ExternalStreams.findByIsMsShipped", query = "SELECT e FROM ExternalStreams e WHERE e.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "ExternalStreams.findByIsPublished", query = "SELECT e FROM ExternalStreams e WHERE e.isPublished = :isPublished"),
    @NamedQuery(name = "ExternalStreams.findByIsSchemaPublished", query = "SELECT e FROM ExternalStreams e WHERE e.isSchemaPublished = :isSchemaPublished"),
    @NamedQuery(name = "ExternalStreams.findByMaxColumnIdUsed", query = "SELECT e FROM ExternalStreams e WHERE e.maxColumnIdUsed = :maxColumnIdUsed"),
    @NamedQuery(name = "ExternalStreams.findByUsesAnsiNulls", query = "SELECT e FROM ExternalStreams e WHERE e.usesAnsiNulls = :usesAnsiNulls"),
    @NamedQuery(name = "ExternalStreams.findByDataSourceId", query = "SELECT e FROM ExternalStreams e WHERE e.dataSourceId = :dataSourceId"),
    @NamedQuery(name = "ExternalStreams.findByFileFormatId", query = "SELECT e FROM ExternalStreams e WHERE e.fileFormatId = :fileFormatId"),
    @NamedQuery(name = "ExternalStreams.findByLocation", query = "SELECT e FROM ExternalStreams e WHERE e.location = :location"),
    @NamedQuery(name = "ExternalStreams.findByInputOptions", query = "SELECT e FROM ExternalStreams e WHERE e.inputOptions = :inputOptions"),
    @NamedQuery(name = "ExternalStreams.findByOutputOptions", query = "SELECT e FROM ExternalStreams e WHERE e.outputOptions = :outputOptions")})
public class ExternalStreams implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @Column(name = "schema_id")
    private int schemaId;
    @Basic(optional = false)
    @Column(name = "parent_object_id")
    private int parentObjectId;
    @Column(name = "type")
    private String type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Basic(optional = false)
    @Column(name = "is_ms_shipped")
    private boolean isMsShipped;
    @Basic(optional = false)
    @Column(name = "is_published")
    private boolean isPublished;
    @Basic(optional = false)
    @Column(name = "is_schema_published")
    private boolean isSchemaPublished;
    @Column(name = "max_column_id_used")
    private Integer maxColumnIdUsed;
    @Column(name = "uses_ansi_nulls")
    private Boolean usesAnsiNulls;
    @Column(name = "data_source_id")
    private Integer dataSourceId;
    @Column(name = "file_format_id")
    private Integer fileFormatId;
    @Column(name = "location")
    private String location;
    @Column(name = "input_options")
    private String inputOptions;
    @Column(name = "output_options")
    private String outputOptions;

    public ExternalStreams() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }

    public Integer getMaxColumnIdUsed() {
        return maxColumnIdUsed;
    }

    public void setMaxColumnIdUsed(Integer maxColumnIdUsed) {
        this.maxColumnIdUsed = maxColumnIdUsed;
    }

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public Integer getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Integer getFileFormatId() {
        return fileFormatId;
    }

    public void setFileFormatId(Integer fileFormatId) {
        this.fileFormatId = fileFormatId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInputOptions() {
        return inputOptions;
    }

    public void setInputOptions(String inputOptions) {
        this.inputOptions = inputOptions;
    }

    public String getOutputOptions() {
        return outputOptions;
    }

    public void setOutputOptions(String outputOptions) {
        this.outputOptions = outputOptions;
    }
    
}
