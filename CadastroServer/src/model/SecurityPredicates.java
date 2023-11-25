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
@Table(name = "security_predicates")
@NamedQueries({
    @NamedQuery(name = "SecurityPredicates.findAll", query = "SELECT s FROM SecurityPredicates s"),
    @NamedQuery(name = "SecurityPredicates.findByObjectId", query = "SELECT s FROM SecurityPredicates s WHERE s.objectId = :objectId"),
    @NamedQuery(name = "SecurityPredicates.findBySecurityPredicateId", query = "SELECT s FROM SecurityPredicates s WHERE s.securityPredicateId = :securityPredicateId"),
    @NamedQuery(name = "SecurityPredicates.findByTargetObjectId", query = "SELECT s FROM SecurityPredicates s WHERE s.targetObjectId = :targetObjectId"),
    @NamedQuery(name = "SecurityPredicates.findByPredicateDefinition", query = "SELECT s FROM SecurityPredicates s WHERE s.predicateDefinition = :predicateDefinition"),
    @NamedQuery(name = "SecurityPredicates.findByPredicateType", query = "SELECT s FROM SecurityPredicates s WHERE s.predicateType = :predicateType"),
    @NamedQuery(name = "SecurityPredicates.findByPredicateTypeDesc", query = "SELECT s FROM SecurityPredicates s WHERE s.predicateTypeDesc = :predicateTypeDesc"),
    @NamedQuery(name = "SecurityPredicates.findByOperation", query = "SELECT s FROM SecurityPredicates s WHERE s.operation = :operation"),
    @NamedQuery(name = "SecurityPredicates.findByOperationDesc", query = "SELECT s FROM SecurityPredicates s WHERE s.operationDesc = :operationDesc")})
public class SecurityPredicates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "security_predicate_id")
    private int securityPredicateId;
    @Basic(optional = false)
    @Column(name = "target_object_id")
    private int targetObjectId;
    @Column(name = "predicate_definition")
    private String predicateDefinition;
    @Column(name = "predicate_type")
    private Integer predicateType;
    @Column(name = "predicate_type_desc")
    private String predicateTypeDesc;
    @Column(name = "operation")
    private Integer operation;
    @Column(name = "operation_desc")
    private String operationDesc;

    public SecurityPredicates() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getSecurityPredicateId() {
        return securityPredicateId;
    }

    public void setSecurityPredicateId(int securityPredicateId) {
        this.securityPredicateId = securityPredicateId;
    }

    public int getTargetObjectId() {
        return targetObjectId;
    }

    public void setTargetObjectId(int targetObjectId) {
        this.targetObjectId = targetObjectId;
    }

    public String getPredicateDefinition() {
        return predicateDefinition;
    }

    public void setPredicateDefinition(String predicateDefinition) {
        this.predicateDefinition = predicateDefinition;
    }

    public Integer getPredicateType() {
        return predicateType;
    }

    public void setPredicateType(Integer predicateType) {
        this.predicateType = predicateType;
    }

    public String getPredicateTypeDesc() {
        return predicateTypeDesc;
    }

    public void setPredicateTypeDesc(String predicateTypeDesc) {
        this.predicateTypeDesc = predicateTypeDesc;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public String getOperationDesc() {
        return operationDesc;
    }

    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc;
    }
    
}
