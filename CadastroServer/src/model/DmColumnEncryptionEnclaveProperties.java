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
@Table(name = "dm_column_encryption_enclave_properties")
@NamedQueries({
    @NamedQuery(name = "DmColumnEncryptionEnclaveProperties.findAll", query = "SELECT d FROM DmColumnEncryptionEnclaveProperties d"),
    @NamedQuery(name = "DmColumnEncryptionEnclaveProperties.findByName", query = "SELECT d FROM DmColumnEncryptionEnclaveProperties d WHERE d.name = :name"),
    @NamedQuery(name = "DmColumnEncryptionEnclaveProperties.findByValue", query = "SELECT d FROM DmColumnEncryptionEnclaveProperties d WHERE d.value = :value")})
public class DmColumnEncryptionEnclaveProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;

    public DmColumnEncryptionEnclaveProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
    
}
