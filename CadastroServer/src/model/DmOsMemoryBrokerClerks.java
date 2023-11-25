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
@Table(name = "dm_os_memory_broker_clerks")
@NamedQueries({
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findAll", query = "SELECT d FROM DmOsMemoryBrokerClerks d"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByClerkName", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.clerkName = :clerkName"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByTotalKb", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.totalKb = :totalKb"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findBySimulatedKb", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.simulatedKb = :simulatedKb"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findBySimulationBenefit", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.simulationBenefit = :simulationBenefit"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByInternalBenefit", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.internalBenefit = :internalBenefit"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByExternalBenefit", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.externalBenefit = :externalBenefit"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByValueOfMemory", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.valueOfMemory = :valueOfMemory"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByPeriodicFreedKb", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.periodicFreedKb = :periodicFreedKb"),
    @NamedQuery(name = "DmOsMemoryBrokerClerks.findByInternalFreedKb", query = "SELECT d FROM DmOsMemoryBrokerClerks d WHERE d.internalFreedKb = :internalFreedKb")})
public class DmOsMemoryBrokerClerks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "clerk_name")
    private String clerkName;
    @Basic(optional = false)
    @Column(name = "total_kb")
    private long totalKb;
    @Basic(optional = false)
    @Column(name = "simulated_kb")
    private long simulatedKb;
    @Basic(optional = false)
    @Column(name = "simulation_benefit")
    private double simulationBenefit;
    @Basic(optional = false)
    @Column(name = "internal_benefit")
    private double internalBenefit;
    @Basic(optional = false)
    @Column(name = "external_benefit")
    private double externalBenefit;
    @Basic(optional = false)
    @Column(name = "value_of_memory")
    private double valueOfMemory;
    @Basic(optional = false)
    @Column(name = "periodic_freed_kb")
    private long periodicFreedKb;
    @Basic(optional = false)
    @Column(name = "internal_freed_kb")
    private long internalFreedKb;

    public DmOsMemoryBrokerClerks() {
    }

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    public long getTotalKb() {
        return totalKb;
    }

    public void setTotalKb(long totalKb) {
        this.totalKb = totalKb;
    }

    public long getSimulatedKb() {
        return simulatedKb;
    }

    public void setSimulatedKb(long simulatedKb) {
        this.simulatedKb = simulatedKb;
    }

    public double getSimulationBenefit() {
        return simulationBenefit;
    }

    public void setSimulationBenefit(double simulationBenefit) {
        this.simulationBenefit = simulationBenefit;
    }

    public double getInternalBenefit() {
        return internalBenefit;
    }

    public void setInternalBenefit(double internalBenefit) {
        this.internalBenefit = internalBenefit;
    }

    public double getExternalBenefit() {
        return externalBenefit;
    }

    public void setExternalBenefit(double externalBenefit) {
        this.externalBenefit = externalBenefit;
    }

    public double getValueOfMemory() {
        return valueOfMemory;
    }

    public void setValueOfMemory(double valueOfMemory) {
        this.valueOfMemory = valueOfMemory;
    }

    public long getPeriodicFreedKb() {
        return periodicFreedKb;
    }

    public void setPeriodicFreedKb(long periodicFreedKb) {
        this.periodicFreedKb = periodicFreedKb;
    }

    public long getInternalFreedKb() {
        return internalFreedKb;
    }

    public void setInternalFreedKb(long internalFreedKb) {
        this.internalFreedKb = internalFreedKb;
    }
    
}
