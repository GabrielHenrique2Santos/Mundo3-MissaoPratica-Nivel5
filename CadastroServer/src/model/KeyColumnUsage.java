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
@Table(name = "KEY_COLUMN_USAGE")
@NamedQueries({
    @NamedQuery(name = "KeyColumnUsage.findAll", query = "SELECT k FROM KeyColumnUsage k"),
    @NamedQuery(name = "KeyColumnUsage.findByConstraintCatalog", query = "SELECT k FROM KeyColumnUsage k WHERE k.constraintCatalog = :constraintCatalog"),
    @NamedQuery(name = "KeyColumnUsage.findByConstraintSchema", query = "SELECT k FROM KeyColumnUsage k WHERE k.constraintSchema = :constraintSchema"),
    @NamedQuery(name = "KeyColumnUsage.findByConstraintName", query = "SELECT k FROM KeyColumnUsage k WHERE k.constraintName = :constraintName"),
    @NamedQuery(name = "KeyColumnUsage.findByTableCatalog", query = "SELECT k FROM KeyColumnUsage k WHERE k.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "KeyColumnUsage.findByTableSchema", query = "SELECT k FROM KeyColumnUsage k WHERE k.tableSchema = :tableSchema"),
    @NamedQuery(name = "KeyColumnUsage.findByTableName", query = "SELECT k FROM KeyColumnUsage k WHERE k.tableName = :tableName"),
    @NamedQuery(name = "KeyColumnUsage.findByColumnName", query = "SELECT k FROM KeyColumnUsage k WHERE k.columnName = :columnName"),
    @NamedQuery(name = "KeyColumnUsage.findByOrdinalPosition", query = "SELECT k FROM KeyColumnUsage k WHERE k.ordinalPosition = :ordinalPosition")})
public class KeyColumnUsage implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Basic(optional = false)
    @Column(name = "ORDINAL_POSITION")
    private int ordinalPosition;

    public KeyColumnUsage() {
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }
    
}
