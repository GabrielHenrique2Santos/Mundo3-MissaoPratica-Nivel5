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
@Table(name = "xml_schema_collections")
@NamedQueries({
    @NamedQuery(name = "XmlSchemaCollections.findAll", query = "SELECT x FROM XmlSchemaCollections x"),
    @NamedQuery(name = "XmlSchemaCollections.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaCollections x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaCollections.findBySchemaId", query = "SELECT x FROM XmlSchemaCollections x WHERE x.schemaId = :schemaId"),
    @NamedQuery(name = "XmlSchemaCollections.findByPrincipalId", query = "SELECT x FROM XmlSchemaCollections x WHERE x.principalId = :principalId"),
    @NamedQuery(name = "XmlSchemaCollections.findByName", query = "SELECT x FROM XmlSchemaCollections x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaCollections.findByCreateDate", query = "SELECT x FROM XmlSchemaCollections x WHERE x.createDate = :createDate"),
    @NamedQuery(name = "XmlSchemaCollections.findByModifyDate", query = "SELECT x FROM XmlSchemaCollections x WHERE x.modifyDate = :modifyDate")})
public class XmlSchemaCollections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @Column(name = "schema_id")
    private int schemaId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public XmlSchemaCollections() {
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
