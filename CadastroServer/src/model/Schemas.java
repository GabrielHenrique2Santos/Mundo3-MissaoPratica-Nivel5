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
@Table(name = "schemas")
@NamedQueries({
    @NamedQuery(name = "Schemas.findAll", query = "SELECT s FROM Schemas s"),
    @NamedQuery(name = "Schemas.findByName", query = "SELECT s FROM Schemas s WHERE s.name = :name"),
    @NamedQuery(name = "Schemas.findBySchemaId", query = "SELECT s FROM Schemas s WHERE s.schemaId = :schemaId"),
    @NamedQuery(name = "Schemas.findByPrincipalId", query = "SELECT s FROM Schemas s WHERE s.principalId = :principalId")})
public class Schemas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "schema_id")
    private int schemaId;
    @Column(name = "principal_id")
    private Integer principalId;

    public Schemas() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
    
}
