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
@Table(name = "partition_functions")
@NamedQueries({
    @NamedQuery(name = "PartitionFunctions.findAll", query = "SELECT p FROM PartitionFunctions p"),
    @NamedQuery(name = "PartitionFunctions.findByName", query = "SELECT p FROM PartitionFunctions p WHERE p.name = :name"),
    @NamedQuery(name = "PartitionFunctions.findByFunctionId", query = "SELECT p FROM PartitionFunctions p WHERE p.functionId = :functionId"),
    @NamedQuery(name = "PartitionFunctions.findByType", query = "SELECT p FROM PartitionFunctions p WHERE p.type = :type"),
    @NamedQuery(name = "PartitionFunctions.findByTypeDesc", query = "SELECT p FROM PartitionFunctions p WHERE p.typeDesc = :typeDesc"),
    @NamedQuery(name = "PartitionFunctions.findByFanout", query = "SELECT p FROM PartitionFunctions p WHERE p.fanout = :fanout"),
    @NamedQuery(name = "PartitionFunctions.findByBoundaryValueOnRight", query = "SELECT p FROM PartitionFunctions p WHERE p.boundaryValueOnRight = :boundaryValueOnRight"),
    @NamedQuery(name = "PartitionFunctions.findByIsSystem", query = "SELECT p FROM PartitionFunctions p WHERE p.isSystem = :isSystem"),
    @NamedQuery(name = "PartitionFunctions.findByCreateDate", query = "SELECT p FROM PartitionFunctions p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "PartitionFunctions.findByModifyDate", query = "SELECT p FROM PartitionFunctions p WHERE p.modifyDate = :modifyDate")})
public class PartitionFunctions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "function_id")
    private int functionId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @Column(name = "fanout")
    private int fanout;
    @Basic(optional = false)
    @Column(name = "boundary_value_on_right")
    private boolean boundaryValueOnRight;
    @Basic(optional = false)
    @Column(name = "is_system")
    private boolean isSystem;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public PartitionFunctions() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
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

    public int getFanout() {
        return fanout;
    }

    public void setFanout(int fanout) {
        this.fanout = fanout;
    }

    public boolean getBoundaryValueOnRight() {
        return boundaryValueOnRight;
    }

    public void setBoundaryValueOnRight(boolean boundaryValueOnRight) {
        this.boundaryValueOnRight = boundaryValueOnRight;
    }

    public boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(boolean isSystem) {
        this.isSystem = isSystem;
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
