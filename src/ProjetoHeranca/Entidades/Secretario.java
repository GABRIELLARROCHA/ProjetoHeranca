package ProjetoHeranca.Entidades;

import java.time.LocalDate;

public class Secretario extends Funcionario{

    private String ramal;

    public Secretario(String nome, String cpf, String ramal) {
        super(nome, cpf);
        this.ramal = ramal;
    }

    public Secretario(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String ramal) {
        super(nome, email, nascimento, cpf, dependente);
        this.ramal = ramal;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}
