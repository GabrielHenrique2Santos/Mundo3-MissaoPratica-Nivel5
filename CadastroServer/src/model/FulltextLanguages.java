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
@Table(name = "fulltext_languages")
@NamedQueries({
    @NamedQuery(name = "FulltextLanguages.findAll", query = "SELECT f FROM FulltextLanguages f"),
    @NamedQuery(name = "FulltextLanguages.findByLcid", query = "SELECT f FROM FulltextLanguages f WHERE f.lcid = :lcid"),
    @NamedQuery(name = "FulltextLanguages.findByName", query = "SELECT f FROM FulltextLanguages f WHERE f.name = :name")})
public class FulltextLanguages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "lcid")
    private int lcid;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public FulltextLanguages() {
    }

    public int getLcid() {
        return lcid;
    }

    public void setLcid(int lcid) {
        this.lcid = lcid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
