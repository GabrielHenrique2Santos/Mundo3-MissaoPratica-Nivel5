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
@Table(name = "dm_toad_work_items")
@NamedQueries({
    @NamedQuery(name = "DmToadWorkItems.findAll", query = "SELECT d FROM DmToadWorkItems d"),
    @NamedQuery(name = "DmToadWorkItems.findByMessageId", query = "SELECT d FROM DmToadWorkItems d WHERE d.messageId = :messageId"),
    @NamedQuery(name = "DmToadWorkItems.findByWorkitemType", query = "SELECT d FROM DmToadWorkItems d WHERE d.workitemType = :workitemType"),
    @NamedQuery(name = "DmToadWorkItems.findByWorkitemVersion", query = "SELECT d FROM DmToadWorkItems d WHERE d.workitemVersion = :workitemVersion"),
    @NamedQuery(name = "DmToadWorkItems.findByProducerType", query = "SELECT d FROM DmToadWorkItems d WHERE d.producerType = :producerType"),
    @NamedQuery(name = "DmToadWorkItems.findByProducerId", query = "SELECT d FROM DmToadWorkItems d WHERE d.producerId = :producerId"),
    @NamedQuery(name = "DmToadWorkItems.findByRetryCount", query = "SELECT d FROM DmToadWorkItems d WHERE d.retryCount = :retryCount"),
    @NamedQuery(name = "DmToadWorkItems.findByBodySize", query = "SELECT d FROM DmToadWorkItems d WHERE d.bodySize = :bodySize")})
public class DmToadWorkItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "message_id")
    private int messageId;
    @Basic(optional = false)
    @Column(name = "workitem_type")
    private String workitemType;
    @Basic(optional = false)
    @Column(name = "workitem_version")
    private int workitemVersion;
    @Basic(optional = false)
    @Column(name = "producer_type")
    private String producerType;
    @Basic(optional = false)
    @Column(name = "producer_id")
    private int producerId;
    @Basic(optional = false)
    @Column(name = "retry_count")
    private int retryCount;
    @Basic(optional = false)
    @Column(name = "body_size")
    private int bodySize;

    public DmToadWorkItems() {
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getWorkitemType() {
        return workitemType;
    }

    public void setWorkitemType(String workitemType) {
        this.workitemType = workitemType;
    }

    public int getWorkitemVersion() {
        return workitemVersion;
    }

    public void setWorkitemVersion(int workitemVersion) {
        this.workitemVersion = workitemVersion;
    }

    public String getProducerType() {
        return producerType;
    }

    public void setProducerType(String producerType) {
        this.producerType = producerType;
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int producerId) {
        this.producerId = producerId;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }
    
}
