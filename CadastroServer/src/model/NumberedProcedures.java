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
@Table(name = "numbered_procedures")
@NamedQueries({
    @NamedQuery(name = "NumberedProcedures.findAll", query = "SELECT n FROM NumberedProcedures n"),
    @NamedQuery(name = "NumberedProcedures.findByObjectId", query = "SELECT n FROM NumberedProcedures n WHERE n.objectId = :objectId"),
    @NamedQuery(name = "NumberedProcedures.findByProcedureNumber", query = "SELECT n FROM NumberedProcedures n WHERE n.procedureNumber = :procedureNumber"),
    @NamedQuery(name = "NumberedProcedures.findByDefinition", query = "SELECT n FROM NumberedProcedures n WHERE n.definition = :definition")})
public class NumberedProcedures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "procedure_number")
    private Short procedureNumber;
    @Column(name = "definition")
    private String definition;

    public NumberedProcedures() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Short getProcedureNumber() {
        return procedureNumber;
    }

    public void setProcedureNumber(Short procedureNumber) {
        this.procedureNumber = procedureNumber;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
}
