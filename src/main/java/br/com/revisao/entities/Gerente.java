package br.com.revisao.entities;

import java.util.Date;
import java.util.List;

public class Gerente extends Pessoa implements DressCode{

    // GCUF > Generate Constructor Using Fields

    private List<Operador> equipe;
    private String dressCode;

    public Gerente() {}

    public Gerente(Long id, String name, String email, Date dataNascimento, String cpf, String telefone, Genero genero, Endereco endereco, List<Operador> equipe) {
        super(id, name, email, dataNascimento, cpf, telefone, genero, endereco);
        this.equipe = equipe;
    }

    public Gerente(String name) {
        super(name);
    }

    public List<Operador> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Operador> equipe) {
        this.equipe = equipe;
    }

    public String getDressCode() {
        return dressCode;
    }

    private void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "equipe=" + equipe +
                "} " + super.toString();
    }

    @Override
    public void descriptionDressCode(String dressCode) {
        setDressCode(dressCode);
    }

    @Override
    public void tamanhoDressCode(int a) {}
}
