package br.com.core.softpet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venda")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v ORDER BY v.id"),
    @NamedQuery(name = "Venda.findById", query = "SELECT v FROM Venda v WHERE v.id = :id"),
    @NamedQuery(name = "Venda.findByNome", query = "SELECT v FROM Venda v WHERE v.numero LIKE :numero")})
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Animal animal;

    @OneToOne
    private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "venda", orphanRemoval = true)
    private List<VendaItem> vendaItem = new ArrayList<>();

    private String numero;

    private Date dataVenda;

    private Boolean situacao;

    private String tipoPagamento;

    private String observacao;

    private Double valorTotalDesconto;

    private Double valorTotalFrete;

    private Double valorTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<VendaItem> getVendaItem() {
        return vendaItem;
    }

    public void setVendaItem(List<VendaItem> vendaItem) {
        this.vendaItem = vendaItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValorTotalDesconto() {
        return valorTotalDesconto;
    }

    public void setValorTotalDesconto(Double valorTotalDesconto) {
        this.valorTotalDesconto = valorTotalDesconto;
    }

    public Double getValorTotalFrete() {
        return valorTotalFrete;
    }

    public void setValorTotalFrete(Double valorTotalFrete) {
        this.valorTotalFrete = valorTotalFrete;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
