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
@Table(name = "availability_group_listener_ip_addresses")
@NamedQueries({
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findAll", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByListenerId", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.listenerId = :listenerId"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByIpAddress", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.ipAddress = :ipAddress"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByIpSubnetMask", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.ipSubnetMask = :ipSubnetMask"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByIsDhcp", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.isDhcp = :isDhcp"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByNetworkSubnetIp", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.networkSubnetIp = :networkSubnetIp"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByNetworkSubnetPrefixLength", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.networkSubnetPrefixLength = :networkSubnetPrefixLength"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByNetworkSubnetIpv4Mask", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.networkSubnetIpv4Mask = :networkSubnetIpv4Mask"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByState", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.state = :state"),
    @NamedQuery(name = "AvailabilityGroupListenerIpAddresses.findByStateDesc", query = "SELECT a FROM AvailabilityGroupListenerIpAddresses a WHERE a.stateDesc = :stateDesc")})
public class AvailabilityGroupListenerIpAddresses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "listener_id")
    private String listenerId;
    @Column(name = "ip_address")
    private String ipAddress;
    @Column(name = "ip_subnet_mask")
    private String ipSubnetMask;
    @Basic(optional = false)
    @Column(name = "is_dhcp")
    private boolean isDhcp;
    @Column(name = "network_subnet_ip")
    private String networkSubnetIp;
    @Column(name = "network_subnet_prefix_length")
    private Integer networkSubnetPrefixLength;
    @Column(name = "network_subnet_ipv4_mask")
    private String networkSubnetIpv4Mask;
    @Column(name = "state")
    private Short state;
    @Column(name = "state_desc")
    private String stateDesc;

    public AvailabilityGroupListenerIpAddresses() {
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpSubnetMask() {
        return ipSubnetMask;
    }

    public void setIpSubnetMask(String ipSubnetMask) {
        this.ipSubnetMask = ipSubnetMask;
    }

    public boolean getIsDhcp() {
        return isDhcp;
    }

    public void setIsDhcp(boolean isDhcp) {
        this.isDhcp = isDhcp;
    }

    public String getNetworkSubnetIp() {
        return networkSubnetIp;
    }

    public void setNetworkSubnetIp(String networkSubnetIp) {
        this.networkSubnetIp = networkSubnetIp;
    }

    public Integer getNetworkSubnetPrefixLength() {
        return networkSubnetPrefixLength;
    }

    public void setNetworkSubnetPrefixLength(Integer networkSubnetPrefixLength) {
        this.networkSubnetPrefixLength = networkSubnetPrefixLength;
    }

    public String getNetworkSubnetIpv4Mask() {
        return networkSubnetIpv4Mask;
    }

    public void setNetworkSubnetIpv4Mask(String networkSubnetIpv4Mask) {
        this.networkSubnetIpv4Mask = networkSubnetIpv4Mask;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }
    
}
