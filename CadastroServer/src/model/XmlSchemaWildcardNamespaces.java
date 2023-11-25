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
@Table(name = "xml_schema_wildcard_namespaces")
@NamedQueries({
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findAll", query = "SELECT x FROM XmlSchemaWildcardNamespaces x"),
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findByXmlComponentId", query = "SELECT x FROM XmlSchemaWildcardNamespaces x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaWildcardNamespaces.findByNamespace", query = "SELECT x FROM XmlSchemaWildcardNamespaces x WHERE x.namespace = :namespace")})
public class XmlSchemaWildcardNamespaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @Column(name = "namespace")
    private String namespace;

    public XmlSchemaWildcardNamespaces() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
}
