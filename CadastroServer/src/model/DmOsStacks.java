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
@Table(name = "dm_os_stacks")
@NamedQueries({
    @NamedQuery(name = "DmOsStacks.findAll", query = "SELECT d FROM DmOsStacks d"),
    @NamedQuery(name = "DmOsStacks.findByFrameIndex", query = "SELECT d FROM DmOsStacks d WHERE d.frameIndex = :frameIndex")})
public class DmOsStacks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "stack_address")
    private byte[] stackAddress;
    @Basic(optional = false)
    @Column(name = "frame_index")
    private int frameIndex;
    @Basic(optional = false)
    @Lob
    @Column(name = "frame_address")
    private byte[] frameAddress;

    public DmOsStacks() {
    }

    public byte[] getStackAddress() {
        return stackAddress;
    }

    public void setStackAddress(byte[] stackAddress) {
        this.stackAddress = stackAddress;
    }

    public int getFrameIndex() {
        return frameIndex;
    }

    public void setFrameIndex(int frameIndex) {
        this.frameIndex = frameIndex;
    }

    public byte[] getFrameAddress() {
        return frameAddress;
    }

    public void setFrameAddress(byte[] frameAddress) {
        this.frameAddress = frameAddress;
    }
    
}
