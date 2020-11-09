package ProjetoHeranca.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Advogado extends Funcionario{
    private String oab;
    private List<Especializacao> especializacao = new ArrayList<Especializacao>();

    public Advogado(String nome, String cpf, String oab) {
        super(nome, cpf);
        this.oab = oab;
    }

    public Advogado(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String oab) {
        super(nome, email, nascimento, cpf, dependente);
        this.oab = oab;

    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public List<Especializacao> getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(List<Especializacao> especializacao) {
        this.especializacao = especializacao;
    }
}
