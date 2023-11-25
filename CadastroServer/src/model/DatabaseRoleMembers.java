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
@Table(name = "database_role_members")
@NamedQueries({
    @NamedQuery(name = "DatabaseRoleMembers.findAll", query = "SELECT d FROM DatabaseRoleMembers d"),
    @NamedQuery(name = "DatabaseRoleMembers.findByRolePrincipalId", query = "SELECT d FROM DatabaseRoleMembers d WHERE d.rolePrincipalId = :rolePrincipalId"),
    @NamedQuery(name = "DatabaseRoleMembers.findByMemberPrincipalId", query = "SELECT d FROM DatabaseRoleMembers d WHERE d.memberPrincipalId = :memberPrincipalId")})
public class DatabaseRoleMembers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "role_principal_id")
    private int rolePrincipalId;
    @Basic(optional = false)
    @Column(name = "member_principal_id")
    private int memberPrincipalId;

    public DatabaseRoleMembers() {
    }

    public int getRolePrincipalId() {
        return rolePrincipalId;
    }

    public void setRolePrincipalId(int rolePrincipalId) {
        this.rolePrincipalId = rolePrincipalId;
    }

    public int getMemberPrincipalId() {
        return memberPrincipalId;
    }

    public void setMemberPrincipalId(int memberPrincipalId) {
        this.memberPrincipalId = memberPrincipalId;
    }
    
}
