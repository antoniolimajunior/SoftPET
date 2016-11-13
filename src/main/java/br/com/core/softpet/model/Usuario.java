package br.com.core.softpet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u ORDER BY u.id"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome LIKE :nome"),
    @NamedQuery(name = "Usuario.findByUsuarioSenha", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha ")})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
    
    private String usuario;

    private String senha;

    private String cpf;

    private String endereco;

    private String bairro;

    private String cidade;

    private String complemento;

    private String cep;

    private String telefone;

    private String email;

    private String observacao;

    private Boolean eAdmin;

    private Boolean eVeterinario;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String endereco, String bairro, String cidade, String complemento, String cep, String telefone, String email, String observacao, Boolean eAdmin, Boolean eVeterinario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
        this.eAdmin = eAdmin;
        this.eVeterinario = eVeterinario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Boolean geteAdmin() {
        return eAdmin;
    }

    public void seteAdmin(Boolean eAdmin) {
        this.eAdmin = eAdmin;
    }

    public Boolean geteVeterinario() {
        return eVeterinario;
    }

    public void seteVeterinario(Boolean eVeterinario) {
        this.eVeterinario = eVeterinario;
    }

    @Override
    public String toString() {
        return nome;
    }
}
