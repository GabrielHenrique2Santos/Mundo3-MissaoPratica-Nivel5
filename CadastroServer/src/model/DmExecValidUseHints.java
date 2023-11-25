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
@Table(name = "dm_exec_valid_use_hints")
@NamedQueries({
    @NamedQuery(name = "DmExecValidUseHints.findAll", query = "SELECT d FROM DmExecValidUseHints d"),
    @NamedQuery(name = "DmExecValidUseHints.findByName", query = "SELECT d FROM DmExecValidUseHints d WHERE d.name = :name")})
public class DmExecValidUseHints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public DmExecValidUseHints() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
