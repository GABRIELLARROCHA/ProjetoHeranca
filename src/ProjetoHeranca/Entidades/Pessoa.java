package ProjetoHeranca.Entidades;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected String email;
    protected LocalDate nascimento;
    protected String cpf; // cpf é string pq nao é utilizado para fazer nenhuma opecao numerica

    public Pessoa(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(String nome, String email, LocalDate nascimento, String cpf) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
