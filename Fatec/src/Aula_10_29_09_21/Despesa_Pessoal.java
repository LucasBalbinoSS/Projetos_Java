package Aula_10_29_09_21;

import java.util.ArrayList;

public class Despesa_Pessoal {

    // Atributos
    private String cpf;
    private ArrayList<Despesa> despesas;

    // Construtor
    public Despesa_Pessoal(String cpf) {
        this.cpf = cpf;
        despesas = new ArrayList<Despesa>();
    }

    // Getters & Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(ArrayList<Despesa> despesas) {
        this.despesas = despesas;
    }

    // Métodos
    public double getTotal() {
        double total = 0;
        for (Despesa despesa: this.getDespesas()) {
            total += despesa.getValor();
        }
        return total;
    }

    public double getTotal(int mes, int ano) {
        double total = 0;
        for (Despesa despesa: this.getDespesas()) {
            total += despesa.getValor();
        }
        return total;
    }

    // ToString
    @Override
    public String toString() {
        return "Despesa_Pessoal{" +
                "cpf='" + cpf + '\'' +
                ", despesas=" + despesas +
                '}';
    }

}
