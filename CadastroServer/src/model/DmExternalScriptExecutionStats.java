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
@Table(name = "dm_external_script_execution_stats")
@NamedQueries({
    @NamedQuery(name = "DmExternalScriptExecutionStats.findAll", query = "SELECT d FROM DmExternalScriptExecutionStats d"),
    @NamedQuery(name = "DmExternalScriptExecutionStats.findByLanguage", query = "SELECT d FROM DmExternalScriptExecutionStats d WHERE d.language = :language"),
    @NamedQuery(name = "DmExternalScriptExecutionStats.findByCounterName", query = "SELECT d FROM DmExternalScriptExecutionStats d WHERE d.counterName = :counterName"),
    @NamedQuery(name = "DmExternalScriptExecutionStats.findByCounterValue", query = "SELECT d FROM DmExternalScriptExecutionStats d WHERE d.counterValue = :counterValue")})
public class DmExternalScriptExecutionStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @Column(name = "counter_name")
    private String counterName;
    @Basic(optional = false)
    @Column(name = "counter_value")
    private long counterValue;

    public DmExternalScriptExecutionStats() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    public long getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(long counterValue) {
        this.counterValue = counterValue;
    }
    
}
