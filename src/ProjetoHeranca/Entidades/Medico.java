package ProjetoHeranca.Entidades;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Funcionario{

    private String crm;
    private List<Especializacao> especializacao = new ArrayList<Especializacao>();

    public Medico(String nome, String cpf, String crm) {
        super(nome, cpf);
        this.crm = crm;
    }

    public Medico(String nome, String email, LocalDate nascimento, String cpf, Dependente dependente, String crm) {
        super(nome, email, nascimento, cpf, dependente);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Especializacao> getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(List<Especializacao> especializacao) {
        this.especializacao = especializacao;
    }

    public void calculaSalario(int horasTrabalhadas, double valorDaHora){

        double salarioPorHora= horasTrabalhadas*valorDaHora;
        double adicionalFixo = 8;// 8% por contato com doencas infecciosas
        super.salario = salarioPorHora + (salarioPorHora * adicionalFixo) / 100;

        if (horasTrabalhadas>120){
            double adicionalExtra120H = 15;// 15% por mais de 120 horas trabalhadas no mês
            super.salario = salarioPorHora + ((salarioPorHora* adicionalFixo)/100)+((salarioPorHora* adicionalExtra120H)/100);

        } else if (horasTrabalhadas>170){
            double adicionalExtra170H = 20;// 20% por mais de 170 horas trabalhadas np mês
            super.salario = salarioPorHora + ((salarioPorHora* adicionalFixo)/100)+((salarioPorHora* adicionalExtra170H)/100);
        }
        else {
            super.salario = salarioPorHora + (salarioPorHora* adicionalFixo)/100;

        }
    }
}

