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
@Table(name = "dm_exec_query_optimizer_info")
@NamedQueries({
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findAll", query = "SELECT d FROM DmExecQueryOptimizerInfo d"),
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findByCounter", query = "SELECT d FROM DmExecQueryOptimizerInfo d WHERE d.counter = :counter"),
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findByOccurrence", query = "SELECT d FROM DmExecQueryOptimizerInfo d WHERE d.occurrence = :occurrence"),
    @NamedQuery(name = "DmExecQueryOptimizerInfo.findByValue", query = "SELECT d FROM DmExecQueryOptimizerInfo d WHERE d.value = :value")})
public class DmExecQueryOptimizerInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "counter")
    private String counter;
    @Basic(optional = false)
    @Column(name = "occurrence")
    private long occurrence;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "value")
    private Double value;

    public DmExecQueryOptimizerInfo() {
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public long getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(long occurrence) {
        this.occurrence = occurrence;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}
