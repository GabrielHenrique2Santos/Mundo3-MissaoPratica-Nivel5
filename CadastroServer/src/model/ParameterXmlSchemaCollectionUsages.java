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
@Table(name = "parameter_xml_schema_collection_usages")
@NamedQueries({
    @NamedQuery(name = "ParameterXmlSchemaCollectionUsages.findAll", query = "SELECT p FROM ParameterXmlSchemaCollectionUsages p"),
    @NamedQuery(name = "ParameterXmlSchemaCollectionUsages.findByObjectId", query = "SELECT p FROM ParameterXmlSchemaCollectionUsages p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "ParameterXmlSchemaCollectionUsages.findByParameterId", query = "SELECT p FROM ParameterXmlSchemaCollectionUsages p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "ParameterXmlSchemaCollectionUsages.findByXmlCollectionId", query = "SELECT p FROM ParameterXmlSchemaCollectionUsages p WHERE p.xmlCollectionId = :xmlCollectionId")})
public class ParameterXmlSchemaCollectionUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "parameter_id")
    private int parameterId;
    @Basic(optional = false)
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;

    public ParameterXmlSchemaCollectionUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getParameterId() {
        return parameterId;
    }

    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }
    
}
