package br.com.revisao.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public abstract class Pessoa{

    // get e set > GGAS
    // construtor > GCUF
    // PRIVATE , PROTECTED , PUBLIC
    //    private final String NOME = "Bruno";




    private Long id;
    private String name;
    private String email;
    private Date dataNascimento;
    private String cpf;
    private String telefone;
    private Genero genero;

    // PADRÃO
    public Pessoa() {}


    // EXPLÍCITO
    public Pessoa(Long id, String name, String email, Date dataNascimento, String cpf, String telefone, Genero genero, Endereco endereco) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.endereco = endereco;
    }

    public Pessoa(String name) {
        this.name = name;
    }

    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        String exemplo;
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id) && Objects.equals(name, pessoa.name) && Objects.equals(email, pessoa.email) && Objects.equals(dataNascimento, pessoa.dataNascimento) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(telefone, pessoa.telefone) && genero == pessoa.genero && Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, dataNascimento, cpf, telefone, genero, endereco);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
