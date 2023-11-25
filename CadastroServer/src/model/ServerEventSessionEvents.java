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
@Table(name = "server_event_session_events")
@NamedQueries({
    @NamedQuery(name = "ServerEventSessionEvents.findAll", query = "SELECT s FROM ServerEventSessionEvents s"),
    @NamedQuery(name = "ServerEventSessionEvents.findByEventSessionId", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.eventSessionId = :eventSessionId"),
    @NamedQuery(name = "ServerEventSessionEvents.findByEventId", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.eventId = :eventId"),
    @NamedQuery(name = "ServerEventSessionEvents.findByName", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.name = :name"),
    @NamedQuery(name = "ServerEventSessionEvents.findByPackage1", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.package1 = :package1"),
    @NamedQuery(name = "ServerEventSessionEvents.findByModule", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.module = :module"),
    @NamedQuery(name = "ServerEventSessionEvents.findByPredicate", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.predicate = :predicate"),
    @NamedQuery(name = "ServerEventSessionEvents.findByPredicateXml", query = "SELECT s FROM ServerEventSessionEvents s WHERE s.predicateXml = :predicateXml")})
public class ServerEventSessionEvents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "event_session_id")
    private int eventSessionId;
    @Basic(optional = false)
    @Column(name = "event_id")
    private int eventId;
    @Column(name = "name")
    private String name;
    @Column(name = "package")
    private String package1;
    @Column(name = "module")
    private String module;
    @Column(name = "predicate")
    private String predicate;
    @Column(name = "predicate_xml")
    private String predicateXml;

    public ServerEventSessionEvents() {
    }

    public int getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(int eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackage1() {
        return package1;
    }

    public void setPackage1(String package1) {
        this.package1 = package1;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public String getPredicateXml() {
        return predicateXml;
    }

    public void setPredicateXml(String predicateXml) {
        this.predicateXml = predicateXml;
    }
    
}
