package ProjetoHeranca.Entidades;

import java.time.LocalDate;

public class Funcionario  extends Pessoa{ // heranca (é uma pessoa)

    protected double salario;
    protected Dependente dependente; // associacao entre classes criadas por mim (tem um dependente)

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);

    }

    public Funcionario(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente) {
        super(nome, email, nascimento, cpf);
        this.dependente = dependente;
    }

    public double getSalario() {
        return salario;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
}
