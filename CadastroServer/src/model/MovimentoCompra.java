/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "MovimentoCompra")
@NamedQueries({
    @NamedQuery(name = "MovimentoCompra.findAll", query = "SELECT m FROM MovimentoCompra m"),
    @NamedQuery(name = "MovimentoCompra.findByMovimentoCompraID", query = "SELECT m FROM MovimentoCompra m WHERE m.movimentoCompraID = :movimentoCompraID"),
    @NamedQuery(name = "MovimentoCompra.findByQuantidade", query = "SELECT m FROM MovimentoCompra m WHERE m.quantidade = :quantidade"),
    @NamedQuery(name = "MovimentoCompra.findByPrecoUnitario", query = "SELECT m FROM MovimentoCompra m WHERE m.precoUnitario = :precoUnitario")})
public class MovimentoCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MovimentoCompraID")
    private Integer movimentoCompraID;
    @Column(name = "Quantidade")
    private Integer quantidade;
    @Column(name = "PrecoUnitario")
    private Integer precoUnitario;
    @JoinColumn(name = "PessoaJuridica_PessoaJuridicaID", referencedColumnName = "PessoaJuridicaID")
    @ManyToOne(optional = false)
    private PessoaJuridica pessoaJuridicaPessoaJuridicaID;
    @JoinColumn(name = "Produtos_ProdutosID", referencedColumnName = "ProdutosID")
    @ManyToOne(optional = false)
    private Produtos produtosProdutosID;
    @JoinColumn(name = "Usuario_UsuarioID", referencedColumnName = "UsuarioID")
    @ManyToOne(optional = false)
    private Usuario usuarioUsuarioID;

    public MovimentoCompra() {
    }

    public MovimentoCompra(Integer movimentoCompraID) {
        this.movimentoCompraID = movimentoCompraID;
    }

    public Integer getMovimentoCompraID() {
        return movimentoCompraID;
    }

    public void setMovimentoCompraID(Integer movimentoCompraID) {
        this.movimentoCompraID = movimentoCompraID;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Integer precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public PessoaJuridica getPessoaJuridicaPessoaJuridicaID() {
        return pessoaJuridicaPessoaJuridicaID;
    }

    public void setPessoaJuridicaPessoaJuridicaID(PessoaJuridica pessoaJuridicaPessoaJuridicaID) {
        this.pessoaJuridicaPessoaJuridicaID = pessoaJuridicaPessoaJuridicaID;
    }

    public Produtos getProdutosProdutosID() {
        return produtosProdutosID;
    }

    public void setProdutosProdutosID(Produtos produtosProdutosID) {
        this.produtosProdutosID = produtosProdutosID;
    }

    public Usuario getUsuarioUsuarioID() {
        return usuarioUsuarioID;
    }

    public void setUsuarioUsuarioID(Usuario usuarioUsuarioID) {
        this.usuarioUsuarioID = usuarioUsuarioID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movimentoCompraID != null ? movimentoCompraID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoCompra)) {
            return false;
        }
        MovimentoCompra other = (MovimentoCompra) object;
        if ((this.movimentoCompraID == null && other.movimentoCompraID != null) || (this.movimentoCompraID != null && !this.movimentoCompraID.equals(other.movimentoCompraID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MovimentoCompra[ movimentoCompraID=" + movimentoCompraID + " ]";
    }
    
}
