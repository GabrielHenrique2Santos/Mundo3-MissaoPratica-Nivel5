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
@Table(name = "service_queue_usages")
@NamedQueries({
    @NamedQuery(name = "ServiceQueueUsages.findAll", query = "SELECT s FROM ServiceQueueUsages s"),
    @NamedQuery(name = "ServiceQueueUsages.findByServiceId", query = "SELECT s FROM ServiceQueueUsages s WHERE s.serviceId = :serviceId"),
    @NamedQuery(name = "ServiceQueueUsages.findByServiceQueueId", query = "SELECT s FROM ServiceQueueUsages s WHERE s.serviceQueueId = :serviceQueueId")})
public class ServiceQueueUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "service_id")
    private int serviceId;
    @Basic(optional = false)
    @Column(name = "service_queue_id")
    private int serviceQueueId;

    public ServiceQueueUsages() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getServiceQueueId() {
        return serviceQueueId;
    }

    public void setServiceQueueId(int serviceQueueId) {
        this.serviceQueueId = serviceQueueId;
    }
    
}
