package ProjetoHeranca.Entidades;

import java.time.LocalDate;

public class Dependente extends Pessoa {
    private boolean estudante;
    private Beneficio beneficio;

    public Dependente() {
        super();
    }

    public Dependente(String nome, String email, LocalDate nascimento, String cpf, boolean estudante, Beneficio beneficio) {
        super(nome, email, nascimento, cpf);
        this.estudante = estudante;
        this.beneficio = beneficio;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public Beneficio getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
}
