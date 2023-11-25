/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "crypt_properties")
@NamedQueries({
    @NamedQuery(name = "CryptProperties.findAll", query = "SELECT c FROM CryptProperties c"),
    @NamedQuery(name = "CryptProperties.findByClass1", query = "SELECT c FROM CryptProperties c WHERE c.class1 = :class1"),
    @NamedQuery(name = "CryptProperties.findByClassDesc", query = "SELECT c FROM CryptProperties c WHERE c.classDesc = :classDesc"),
    @NamedQuery(name = "CryptProperties.findByMajorId", query = "SELECT c FROM CryptProperties c WHERE c.majorId = :majorId"),
    @NamedQuery(name = "CryptProperties.findByCryptType", query = "SELECT c FROM CryptProperties c WHERE c.cryptType = :cryptType"),
    @NamedQuery(name = "CryptProperties.findByCryptTypeDesc", query = "SELECT c FROM CryptProperties c WHERE c.cryptTypeDesc = :cryptTypeDesc")})
public class CryptProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "class")
    private short class1;
    @Column(name = "class_desc")
    private String classDesc;
    @Basic(optional = false)
    @Column(name = "major_id")
    private int majorId;
    @Basic(optional = false)
    @Lob
    @Column(name = "thumbprint")
    private byte[] thumbprint;
    @Basic(optional = false)
    @Column(name = "crypt_type")
    private String cryptType;
    @Column(name = "crypt_type_desc")
    private String cryptTypeDesc;
    @Basic(optional = false)
    @Lob
    @Column(name = "crypt_property")
    private byte[] cryptProperty;

    public CryptProperties() {
    }

    public short getClass1() {
        return class1;
    }

    public void setClass1(short class1) {
        this.class1 = class1;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public String getCryptType() {
        return cryptType;
    }

    public void setCryptType(String cryptType) {
        this.cryptType = cryptType;
    }

    public String getCryptTypeDesc() {
        return cryptTypeDesc;
    }

    public void setCryptTypeDesc(String cryptTypeDesc) {
        this.cryptTypeDesc = cryptTypeDesc;
    }

    public byte[] getCryptProperty() {
        return cryptProperty;
    }

    public void setCryptProperty(byte[] cryptProperty) {
        this.cryptProperty = cryptProperty;
    }
    
}
