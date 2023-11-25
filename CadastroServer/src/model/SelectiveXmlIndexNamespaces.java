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
@Table(name = "selective_xml_index_namespaces")
@NamedQueries({
    @NamedQuery(name = "SelectiveXmlIndexNamespaces.findAll", query = "SELECT s FROM SelectiveXmlIndexNamespaces s"),
    @NamedQuery(name = "SelectiveXmlIndexNamespaces.findByObjectId", query = "SELECT s FROM SelectiveXmlIndexNamespaces s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SelectiveXmlIndexNamespaces.findByIndexId", query = "SELECT s FROM SelectiveXmlIndexNamespaces s WHERE s.indexId = :indexId"),
    @NamedQuery(name = "SelectiveXmlIndexNamespaces.findByIsDefaultUri", query = "SELECT s FROM SelectiveXmlIndexNamespaces s WHERE s.isDefaultUri = :isDefaultUri"),
    @NamedQuery(name = "SelectiveXmlIndexNamespaces.findByUri", query = "SELECT s FROM SelectiveXmlIndexNamespaces s WHERE s.uri = :uri"),
    @NamedQuery(name = "SelectiveXmlIndexNamespaces.findByPrefix", query = "SELECT s FROM SelectiveXmlIndexNamespaces s WHERE s.prefix = :prefix")})
public class SelectiveXmlIndexNamespaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "index_id")
    private int indexId;
    @Column(name = "is_default_uri")
    private Boolean isDefaultUri;
    @Column(name = "uri")
    private String uri;
    @Column(name = "prefix")
    private String prefix;

    public SelectiveXmlIndexNamespaces() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public Boolean getIsDefaultUri() {
        return isDefaultUri;
    }

    public void setIsDefaultUri(Boolean isDefaultUri) {
        this.isDefaultUri = isDefaultUri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
}
