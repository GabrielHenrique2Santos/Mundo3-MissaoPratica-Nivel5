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
@Table(name = "TABLE_CONSTRAINTS")
@NamedQueries({
    @NamedQuery(name = "TableConstraints.findAll", query = "SELECT t FROM TableConstraints t"),
    @NamedQuery(name = "TableConstraints.findByConstraintCatalog", query = "SELECT t FROM TableConstraints t WHERE t.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "TableConstraints.findByConstraintSchema", query = "SELECT t FROM TableConstraints t WHERE t.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "TableConstraints.findByConstraintName", query = "SELECT t FROM TableConstraints t WHERE t.constraintName = :constraintName"),
    @NamedQuery(name = "TableConstraints.findByTableCatalog", query = "SELECT t FROM TableConstraints t WHERE t.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "TableConstraints.findByTableSchema", query = "SELECT t FROM TableConstraints t WHERE t.tableSchema = :tableSchema"),
    @NamedQuery(name = "TableConstraints.findByTableName", query = "SELECT t FROM TableConstraints t WHERE t.tableName = :tableName"),
    @NamedQuery(name = "TableConstraints.findByConstraintType", query = "SELECT t FROM TableConstraints t WHERE t.constraintType = :constraintType"),
    @NamedQuery(name = "TableConstraints.findByIsDeferrable", query = "SELECT t FROM TableConstraints t WHERE t.isDeferrable = :isDeferrable"),
    @NamedQuery(name = "TableConstraints.findByInitiallyDeferred", query = "SELECT t FROM TableConstraints t WHERE t.initiallyDeferred = :initiallyDeferred")})
public class TableConstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CONSTRAINT_CATALOG")
    private String constraintCatalog;
    @Column(name = "CONSTRAINT_SCHEMA")
    private String constraintSchema;
    @Basic(optional = false)
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;
    @Basic(optional = false)
    @Column(name = "IS_DEFERRABLE")
    private String isDeferrable;
    @Basic(optional = false)
    @Column(name = "INITIALLY_DEFERRED")
    private String initiallyDeferred;

    public TableConstraints() {
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

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    public String getIsDeferrable() {
        return isDeferrable;
    }

    public void setIsDeferrable(String isDeferrable) {
        this.isDeferrable = isDeferrable;
    }

    public String getInitiallyDeferred() {
        return initiallyDeferred;
    }

    public void setInitiallyDeferred(String initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }
    
}
