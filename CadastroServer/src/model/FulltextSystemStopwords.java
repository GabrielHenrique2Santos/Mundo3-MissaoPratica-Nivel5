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
@Table(name = "fulltext_system_stopwords")
@NamedQueries({
    @NamedQuery(name = "FulltextSystemStopwords.findAll", query = "SELECT f FROM FulltextSystemStopwords f"),
    @NamedQuery(name = "FulltextSystemStopwords.findByStopword", query = "SELECT f FROM FulltextSystemStopwords f WHERE f.stopword = :stopword"),
    @NamedQuery(name = "FulltextSystemStopwords.findByLanguageId", query = "SELECT f FROM FulltextSystemStopwords f WHERE f.languageId = :languageId")})
public class FulltextSystemStopwords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "stopword")
    private String stopword;
    @Basic(optional = false)
    @Column(name = "language_id")
    private int languageId;

    public FulltextSystemStopwords() {
    }

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    
}
