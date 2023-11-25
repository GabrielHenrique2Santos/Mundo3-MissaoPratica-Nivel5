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
@Table(name = "xml_schema_namespaces")
@NamedQueries({
    @NamedQuery(name = "XmlSchemaNamespaces.findAll", query = "SELECT x FROM XmlSchemaNamespaces x"),
    @NamedQuery(name = "XmlSchemaNamespaces.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaNamespaces x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaNamespaces.findByName", query = "SELECT x FROM XmlSchemaNamespaces x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaNamespaces.findByXmlNamespaceId", query = "SELECT x FROM XmlSchemaNamespaces x WHERE x.xmlNamespaceId = :xmlNamespaceId")})
public class XmlSchemaNamespaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "xml_namespace_id")
    private int xmlNamespaceId;

    public XmlSchemaNamespaces() {
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXmlNamespaceId() {
        return xmlNamespaceId;
    }

    public void setXmlNamespaceId(int xmlNamespaceId) {
        this.xmlNamespaceId = xmlNamespaceId;
    }
    
}
