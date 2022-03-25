package br.com.revisao.entities;

import java.util.Date;

public class Operador extends Pessoa implements DressCode{

    private Cargo cargo;
    private String dressCode;


    public Operador() {}



    public Operador(Long id, String name, String email, Date dataNascimento, String cpf, String telefone, Genero genero, Endereco endereco, Cargo cargo) {
        super(id, name, email, dataNascimento, cpf, telefone, genero, endereco);
        this.cargo = cargo;
    }

    public Operador(String name) {
        super(name);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getDressCode() {
        return dressCode;
    }

    private void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public String toString() {
        return "Operador{" +
                "cargo=" + cargo +
                "} " + super.toString();
    }

    public void descriptionDressCode(String dressCode) {
        setDressCode(dressCode);
    }

    @Override
    public void tamanhoDressCode(int a) {}
}
