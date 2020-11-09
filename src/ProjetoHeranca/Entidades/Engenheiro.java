package ProjetoHeranca.Entidades;

import java.time.LocalDate;

public class Engenheiro extends Funcionario {

    private String crea;

    public Engenheiro(String nome, String cpf, String crea) {
        super(nome, cpf);
        this.crea = crea;
    }

    public Engenheiro(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String crea) {
        super(nome, email, nascimento, cpf, dependente);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }


}

