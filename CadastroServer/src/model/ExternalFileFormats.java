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
@Table(name = "external_file_formats")
@NamedQueries({
    @NamedQuery(name = "ExternalFileFormats.findAll", query = "SELECT e FROM ExternalFileFormats e"),
    @NamedQuery(name = "ExternalFileFormats.findByFileFormatId", query = "SELECT e FROM ExternalFileFormats e WHERE e.fileFormatId = :fileFormatId"),
    @NamedQuery(name = "ExternalFileFormats.findByName", query = "SELECT e FROM ExternalFileFormats e WHERE e.name = :name"),
    @NamedQuery(name = "ExternalFileFormats.findByFormatType", query = "SELECT e FROM ExternalFileFormats e WHERE e.formatType = :formatType"),
    @NamedQuery(name = "ExternalFileFormats.findByFieldTerminator", query = "SELECT e FROM ExternalFileFormats e WHERE e.fieldTerminator = :fieldTerminator"),
    @NamedQuery(name = "ExternalFileFormats.findByStringDelimiter", query = "SELECT e FROM ExternalFileFormats e WHERE e.stringDelimiter = :stringDelimiter"),
    @NamedQuery(name = "ExternalFileFormats.findByDateFormat", query = "SELECT e FROM ExternalFileFormats e WHERE e.dateFormat = :dateFormat"),
    @NamedQuery(name = "ExternalFileFormats.findByUseTypeDefault", query = "SELECT e FROM ExternalFileFormats e WHERE e.useTypeDefault = :useTypeDefault"),
    @NamedQuery(name = "ExternalFileFormats.findBySerdeMethod", query = "SELECT e FROM ExternalFileFormats e WHERE e.serdeMethod = :serdeMethod"),
    @NamedQuery(name = "ExternalFileFormats.findByRowTerminator", query = "SELECT e FROM ExternalFileFormats e WHERE e.rowTerminator = :rowTerminator"),
    @NamedQuery(name = "ExternalFileFormats.findByEncoding", query = "SELECT e FROM ExternalFileFormats e WHERE e.encoding = :encoding"),
    @NamedQuery(name = "ExternalFileFormats.findByDataCompression", query = "SELECT e FROM ExternalFileFormats e WHERE e.dataCompression = :dataCompression"),
    @NamedQuery(name = "ExternalFileFormats.findByFirstRow", query = "SELECT e FROM ExternalFileFormats e WHERE e.firstRow = :firstRow"),
    @NamedQuery(name = "ExternalFileFormats.findByParserVersion", query = "SELECT e FROM ExternalFileFormats e WHERE e.parserVersion = :parserVersion")})
public class ExternalFileFormats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "file_format_id")
    private int fileFormatId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "format_type")
    private String formatType;
    @Column(name = "field_terminator")
    private String fieldTerminator;
    @Column(name = "string_delimiter")
    private String stringDelimiter;
    @Column(name = "date_format")
    private String dateFormat;
    @Column(name = "use_type_default")
    private Boolean useTypeDefault;
    @Column(name = "serde_method")
    private String serdeMethod;
    @Column(name = "row_terminator")
    private String rowTerminator;
    @Column(name = "encoding")
    private String encoding;
    @Column(name = "data_compression")
    private String dataCompression;
    @Column(name = "first_row")
    private Integer firstRow;
    @Column(name = "parser_version")
    private String parserVersion;

    public ExternalFileFormats() {
    }

    public int getFileFormatId() {
        return fileFormatId;
    }

    public void setFileFormatId(int fileFormatId) {
        this.fileFormatId = fileFormatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public String getFieldTerminator() {
        return fieldTerminator;
    }

    public void setFieldTerminator(String fieldTerminator) {
        this.fieldTerminator = fieldTerminator;
    }

    public String getStringDelimiter() {
        return stringDelimiter;
    }

    public void setStringDelimiter(String stringDelimiter) {
        this.stringDelimiter = stringDelimiter;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Boolean getUseTypeDefault() {
        return useTypeDefault;
    }

    public void setUseTypeDefault(Boolean useTypeDefault) {
        this.useTypeDefault = useTypeDefault;
    }

    public String getSerdeMethod() {
        return serdeMethod;
    }

    public void setSerdeMethod(String serdeMethod) {
        this.serdeMethod = serdeMethod;
    }

    public String getRowTerminator() {
        return rowTerminator;
    }

    public void setRowTerminator(String rowTerminator) {
        this.rowTerminator = rowTerminator;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getDataCompression() {
        return dataCompression;
    }

    public void setDataCompression(String dataCompression) {
        this.dataCompression = dataCompression;
    }

    public Integer getFirstRow() {
        return firstRow;
    }

    public void setFirstRow(Integer firstRow) {
        this.firstRow = firstRow;
    }

    public String getParserVersion() {
        return parserVersion;
    }

    public void setParserVersion(String parserVersion) {
        this.parserVersion = parserVersion;
    }
    
}
