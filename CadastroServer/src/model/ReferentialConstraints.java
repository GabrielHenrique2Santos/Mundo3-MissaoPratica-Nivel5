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
@Table(name = "REFERENTIAL_CONSTRAINTS")
@NamedQueries({
    @NamedQuery(name = "ReferentialConstraints.findAll", query = "SELECT r FROM ReferentialConstraints r"),
    @NamedQuery(name = "ReferentialConstraints.findByConstraintCatalog", query = "SELECT r FROM ReferentialConstraints r WHERE r.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "ReferentialConstraints.findByConstraintSchema", query = "SELECT r FROM ReferentialConstraints r WHERE r.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "ReferentialConstraints.findByConstraintName", query = "SELECT r FROM ReferentialConstraints r WHERE r.constraintName = :constraintName"),
    @NamedQuery(name = "ReferentialConstraints.findByUniqueConstraintCatalog", query = "SELECT r FROM ReferentialConstraints r WHERE r.uniqueConstraintCatalog = :uniqueConstraintCatalog"),
    @NamedQuery(name = "ReferentialConstraints.findByUniqueConstraintSchema", query = "SELECT r FROM ReferentialConstraints r WHERE r.uniqueConstraintSchema = :uniqueConstraintSchema"),
    @NamedQuery(name = "ReferentialConstraints.findByUniqueConstraintName", query = "SELECT r FROM ReferentialConstraints r WHERE r.uniqueConstraintName = :uniqueConstraintName"),
    @NamedQuery(name = "ReferentialConstraints.findByMatchOption", query = "SELECT r FROM ReferentialConstraints r WHERE r.matchOption = :matchOption"),
    @NamedQuery(name = "ReferentialConstraints.findByUpdateRule", query = "SELECT r FROM ReferentialConstraints r WHERE r.updateRule = :updateRule"),
    @NamedQuery(name = "ReferentialConstraints.findByDeleteRule", query = "SELECT r FROM ReferentialConstraints r WHERE r.deleteRule = :deleteRule")})
public class ReferentialConstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Column(name = "UNIQUE_CONSTRAINT_CATALOG")
    private String uniqueConstraintCatalog;
    @Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
    private String uniqueConstraintSchema;
    @Column(name = "UNIQUE_CONSTRAINT_NAME")
    private String uniqueConstraintName;
    @Column(name = "MATCH_OPTION")
    private String matchOption;
    @Column(name = "UPDATE_RULE")
    private String updateRule;
    @Column(name = "DELETE_RULE")
    private String deleteRule;

    public ReferentialConstraints() {
    }

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    public String getMatchOption() {
        return matchOption;
    }

    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption;
    }

    public String getUpdateRule() {
        return updateRule;
    }

    public void setUpdateRule(String updateRule) {
        this.updateRule = updateRule;
    }

    public String getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
    }
    
}
