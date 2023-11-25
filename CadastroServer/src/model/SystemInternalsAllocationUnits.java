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
@Table(name = "system_internals_allocation_units")
@NamedQueries({
    @NamedQuery(name = "SystemInternalsAllocationUnits.findAll", query = "SELECT s FROM SystemInternalsAllocationUnits s"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByAllocationUnitId", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.allocationUnitId = :allocationUnitId"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByType", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.type = :type"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByTypeDesc", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByContainerId", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.containerId = :containerId"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByFilegroupId", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.filegroupId = :filegroupId"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByTotalPages", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.totalPages = :totalPages"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByUsedPages", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.usedPages = :usedPages"),
    @NamedQuery(name = "SystemInternalsAllocationUnits.findByDataPages", query = "SELECT s FROM SystemInternalsAllocationUnits s WHERE s.dataPages = :dataPages")})
public class SystemInternalsAllocationUnits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "allocation_unit_id")
    private long allocationUnitId;
    @Basic(optional = false)
    @Column(name = "type")
    private short type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @Column(name = "container_id")
    private long containerId;
    @Basic(optional = false)
    @Column(name = "filegroup_id")
    private short filegroupId;
    @Basic(optional = false)
    @Column(name = "total_pages")
    private long totalPages;
    @Basic(optional = false)
    @Column(name = "used_pages")
    private long usedPages;
    @Basic(optional = false)
    @Column(name = "data_pages")
    private long dataPages;
    @Basic(optional = false)
    @Lob
    @Column(name = "first_page")
    private byte[] firstPage;
    @Basic(optional = false)
    @Lob
    @Column(name = "root_page")
    private byte[] rootPage;
    @Basic(optional = false)
    @Lob
    @Column(name = "first_iam_page")
    private byte[] firstIamPage;

    public SystemInternalsAllocationUnits() {
    }

    public long getAllocationUnitId() {
        return allocationUnitId;
    }

    public void setAllocationUnitId(long allocationUnitId) {
        this.allocationUnitId = allocationUnitId;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public long getContainerId() {
        return containerId;
    }

    public void setContainerId(long containerId) {
        this.containerId = containerId;
    }

    public short getFilegroupId() {
        return filegroupId;
    }

    public void setFilegroupId(short filegroupId) {
        this.filegroupId = filegroupId;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getUsedPages() {
        return usedPages;
    }

    public void setUsedPages(long usedPages) {
        this.usedPages = usedPages;
    }

    public long getDataPages() {
        return dataPages;
    }

    public void setDataPages(long dataPages) {
        this.dataPages = dataPages;
    }

    public byte[] getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(byte[] firstPage) {
        this.firstPage = firstPage;
    }

    public byte[] getRootPage() {
        return rootPage;
    }

    public void setRootPage(byte[] rootPage) {
        this.rootPage = rootPage;
    }

    public byte[] getFirstIamPage() {
        return firstIamPage;
    }

    public void setFirstIamPage(byte[] firstIamPage) {
        this.firstIamPage = firstIamPage;
    }
    
}
