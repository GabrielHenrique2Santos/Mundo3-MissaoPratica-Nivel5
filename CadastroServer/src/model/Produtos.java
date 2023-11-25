/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "Produtos")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findByProdutosID", query = "SELECT p FROM Produtos p WHERE p.produtosID = :produtosID"),
    @NamedQuery(name = "Produtos.findByNome", query = "SELECT p FROM Produtos p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produtos.findByQuantidade", query = "SELECT p FROM Produtos p WHERE p.quantidade = :quantidade"),
    @NamedQuery(name = "Produtos.findByPrecoVenda", query = "SELECT p FROM Produtos p WHERE p.precoVenda = :precoVenda")})
public class Produtos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ProdutosID")
    private Integer produtosID;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Quantidade")
    private Integer quantidade;
    @Column(name = "PrecoVenda")
    private Integer precoVenda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtosProdutosID")
    private Collection<MovimentoCompra> movimentoCompraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtosProdutosID")
    private Collection<MovimentoVenda> movimentoVendaCollection;

    public Produtos() {
    }

    public Produtos(Integer produtosID) {
        this.produtosID = produtosID;
    }

    public Integer getProdutosID() {
        return produtosID;
    }

    public void setProdutosID(Integer produtosID) {
        this.produtosID = produtosID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Integer precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Collection<MovimentoCompra> getMovimentoCompraCollection() {
        return movimentoCompraCollection;
    }

    public void setMovimentoCompraCollection(Collection<MovimentoCompra> movimentoCompraCollection) {
        this.movimentoCompraCollection = movimentoCompraCollection;
    }

    public Collection<MovimentoVenda> getMovimentoVendaCollection() {
        return movimentoVendaCollection;
    }

    public void setMovimentoVendaCollection(Collection<MovimentoVenda> movimentoVendaCollection) {
        this.movimentoVendaCollection = movimentoVendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produtosID != null ? produtosID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.produtosID == null && other.produtosID != null) || (this.produtosID != null && !this.produtosID.equals(other.produtosID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produtos[ produtosID=" + produtosID + " ]";
    }
    
}
