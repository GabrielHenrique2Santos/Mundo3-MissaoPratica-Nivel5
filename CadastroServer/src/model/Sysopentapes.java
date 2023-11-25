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
@Table(name = "sysopentapes")
@NamedQueries({
    @NamedQuery(name = "Sysopentapes.findAll", query = "SELECT s FROM Sysopentapes s"),
    @NamedQuery(name = "Sysopentapes.findByOpenTape", query = "SELECT s FROM Sysopentapes s WHERE s.openTape = :openTape")})
public class Sysopentapes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "openTape")
    private String openTape;

    public Sysopentapes() {
    }

    public String getOpenTape() {
        return openTape;
    }

    public void setOpenTape(String openTape) {
        this.openTape = openTape;
    }
    
}
