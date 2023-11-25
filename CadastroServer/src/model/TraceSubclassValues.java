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
@Table(name = "trace_subclass_values")
@NamedQueries({
    @NamedQuery(name = "TraceSubclassValues.findAll", query = "SELECT t FROM TraceSubclassValues t"),
    @NamedQuery(name = "TraceSubclassValues.findByTraceEventId", query = "SELECT t FROM TraceSubclassValues t WHERE t.traceEventId = :traceEventId"),
    @NamedQuery(name = "TraceSubclassValues.findByTraceColumnId", query = "SELECT t FROM TraceSubclassValues t WHERE t.traceColumnId = :traceColumnId"),
    @NamedQuery(name = "TraceSubclassValues.findBySubclassName", query = "SELECT t FROM TraceSubclassValues t WHERE t.subclassName = :subclassName"),
    @NamedQuery(name = "TraceSubclassValues.findBySubclassValue", query = "SELECT t FROM TraceSubclassValues t WHERE t.subclassValue = :subclassValue")})
public class TraceSubclassValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "trace_event_id")
    private short traceEventId;
    @Basic(optional = false)
    @Column(name = "trace_column_id")
    private short traceColumnId;
    @Column(name = "subclass_name")
    private String subclassName;
    @Column(name = "subclass_value")
    private Short subclassValue;

    public TraceSubclassValues() {
    }

    public short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(short traceEventId) {
        this.traceEventId = traceEventId;
    }

    public short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }

    public Short getSubclassValue() {
        return subclassValue;
    }

    public void setSubclassValue(Short subclassValue) {
        this.subclassValue = subclassValue;
    }
    
}
