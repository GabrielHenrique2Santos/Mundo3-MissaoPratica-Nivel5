/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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
@Table(name = "dm_audit_class_type_map")
@NamedQueries({
    @NamedQuery(name = "DmAuditClassTypeMap.findAll", query = "SELECT d FROM DmAuditClassTypeMap d"),
    @NamedQuery(name = "DmAuditClassTypeMap.findByClassType", query = "SELECT d FROM DmAuditClassTypeMap d WHERE d.classType = :classType"),
    @NamedQuery(name = "DmAuditClassTypeMap.findByClassTypeDesc", query = "SELECT d FROM DmAuditClassTypeMap d WHERE d.classTypeDesc = :classTypeDesc"),
    @NamedQuery(name = "DmAuditClassTypeMap.findBySecurableClassDesc", query = "SELECT d FROM DmAuditClassTypeMap d WHERE d.securableClassDesc = :securableClassDesc")})
public class DmAuditClassTypeMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "class_type")
    private String classType;
    @Column(name = "class_type_desc")
    private String classTypeDesc;
    @Column(name = "securable_class_desc")
    private String securableClassDesc;

    public DmAuditClassTypeMap() {
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getClassTypeDesc() {
        return classTypeDesc;
    }

    public void setClassTypeDesc(String classTypeDesc) {
        this.classTypeDesc = classTypeDesc;
    }

    public String getSecurableClassDesc() {
        return securableClassDesc;
    }

    public void setSecurableClassDesc(String securableClassDesc) {
        this.securableClassDesc = securableClassDesc;
    }
    
}
