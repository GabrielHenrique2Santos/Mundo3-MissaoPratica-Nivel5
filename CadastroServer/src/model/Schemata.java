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
@Table(name = "SCHEMATA")
@NamedQueries({
    @NamedQuery(name = "Schemata.findAll", query = "SELECT s FROM Schemata s"),
    @NamedQuery(name = "Schemata.findByCatalogName", query = "SELECT s FROM Schemata s WHERE s.catalogName = :catalogName"),
    @NamedQuery(name = "Schemata.findBySchemaName", query = "SELECT s FROM Schemata s WHERE s.schemaName = :schemaName"),
    @NamedQuery(name = "Schemata.findBySchemaOwner", query = "SELECT s FROM Schemata s WHERE s.schemaOwner = :schemaOwner"),
    @NamedQuery(name = "Schemata.findByDefaultCharacterSetCatalog", query = "SELECT s FROM Schemata s WHERE s.defaultCharacterSetCatalog = :defaultCharacterSetCatalog"),
    @NamedQuery(name = "Schemata.findByDefaultCharacterSetSchema", query = "SELECT s FROM Schemata s WHERE s.defaultCharacterSetSchema = :defaultCharacterSetSchema"),
    @NamedQuery(name = "Schemata.findByDefaultCharacterSetName", query = "SELECT s FROM Schemata s WHERE s.defaultCharacterSetName = :defaultCharacterSetName")})
public class Schemata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CATALOG_NAME")
    private String catalogName;
    @Basic(optional = false)
    @Column(name = "SCHEMA_NAME")
    private String schemaName;
    @Column(name = "SCHEMA_OWNER")
    private String schemaOwner;
    @Column(name = "DEFAULT_CHARACTER_SET_CATALOG")
    private String defaultCharacterSetCatalog;
    @Column(name = "DEFAULT_CHARACTER_SET_SCHEMA")
    private String defaultCharacterSetSchema;
    @Column(name = "DEFAULT_CHARACTER_SET_NAME")
    private String defaultCharacterSetName;

    public Schemata() {
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getSchemaOwner() {
        return schemaOwner;
    }

    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    public String getDefaultCharacterSetCatalog() {
        return defaultCharacterSetCatalog;
    }

    public void setDefaultCharacterSetCatalog(String defaultCharacterSetCatalog) {
        this.defaultCharacterSetCatalog = defaultCharacterSetCatalog;
    }

    public String getDefaultCharacterSetSchema() {
        return defaultCharacterSetSchema;
    }

    public void setDefaultCharacterSetSchema(String defaultCharacterSetSchema) {
        this.defaultCharacterSetSchema = defaultCharacterSetSchema;
    }

    public String getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }
    
}
