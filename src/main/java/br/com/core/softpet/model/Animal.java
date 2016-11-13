package br.com.core.softpet.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a ORDER BY a.id"),
    @NamedQuery(name = "Animal.findById", query = "SELECT a FROM Animal a  WHERE a.id = :id"),
    @NamedQuery(name = "Animal.findByNome", query = "SELECT a FROM Animal a  WHERE a.nome LIKE :nome")})
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Raca raca;

    private String nome;

    private Boolean sexo;

    private Date nascimento;

    private Double peso;

    private String cor;

    private String observacao;

    public Animal() {
    }

    public Animal(String nome, Boolean sexo, Date nascimento, Double peso, String cor, String observacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.peso = peso;
        this.cor = cor;
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return nome;
    }
}
