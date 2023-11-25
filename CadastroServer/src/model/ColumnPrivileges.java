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
@Table(name = "COLUMN_PRIVILEGES")
@NamedQueries({
    @NamedQuery(name = "ColumnPrivileges.findAll", query = "SELECT c FROM ColumnPrivileges c"),
    @NamedQuery(name = "ColumnPrivileges.findByGrantor", query = "SELECT c FROM ColumnPrivileges c WHERE c.grantor = :grantor"),
    @NamedQuery(name = "ColumnPrivileges.findByGrantee", query = "SELECT c FROM ColumnPrivileges c WHERE c.grantee = :grantee"),
    @NamedQuery(name = "ColumnPrivileges.findByTableCatalog", query = "SELECT c FROM ColumnPrivileges c WHERE c.tableCatalog = :tableCatalog"),
    @NamedQuery(name = "ColumnPrivileges.findByTableSchema", query = "SELECT c FROM ColumnPrivileges c WHERE c.tableSchema = :tableSchema"),
    @NamedQuery(name = "ColumnPrivileges.findByTableName", query = "SELECT c FROM ColumnPrivileges c WHERE c.tableName = :tableName"),
    @NamedQuery(name = "ColumnPrivileges.findByColumnName", query = "SELECT c FROM ColumnPrivileges c WHERE c.columnName = :columnName"),
    @NamedQuery(name = "ColumnPrivileges.findByPrivilegeType", query = "SELECT c FROM ColumnPrivileges c WHERE c.privilegeType = :privilegeType"),
    @NamedQuery(name = "ColumnPrivileges.findByIsGrantable", query = "SELECT c FROM ColumnPrivileges c WHERE c.isGrantable = :isGrantable")})
public class ColumnPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "GRANTOR")
    private String grantor;
    @Column(name = "GRANTEE")
    private String grantee;
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Column(name = "PRIVILEGE_TYPE")
    private String privilegeType;
    @Column(name = "IS_GRANTABLE")
    private String isGrantable;

    public ColumnPrivileges() {
    }

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
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

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }
    
}
