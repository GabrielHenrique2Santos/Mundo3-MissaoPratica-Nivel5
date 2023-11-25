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
@Table(name = "parameter_type_usages")
@NamedQueries({
    @NamedQuery(name = "ParameterTypeUsages.findAll", query = "SELECT p FROM ParameterTypeUsages p"),
    @NamedQuery(name = "ParameterTypeUsages.findByObjectId", query = "SELECT p FROM ParameterTypeUsages p WHERE p.objectId = :objectId"),
    @NamedQuery(name = "ParameterTypeUsages.findByParameterId", query = "SELECT p FROM ParameterTypeUsages p WHERE p.parameterId = :parameterId"),
    @NamedQuery(name = "ParameterTypeUsages.findByUserTypeId", query = "SELECT p FROM ParameterTypeUsages p WHERE p.userTypeId = :userTypeId")})
public class ParameterTypeUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "parameter_id")
    private int parameterId;
    @Basic(optional = false)
    @Column(name = "user_type_id")
    private int userTypeId;

    public ParameterTypeUsages() {
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

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
    
}
