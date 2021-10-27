package Aula_10_29_09_21;

import java.time.LocalDate;

public class Despesa {

    // Atributos
    private LocalDate data;
    private String desc_despesa;
    double valor;

    // Construtor
    public Despesa(LocalDate d, String dd, double v) {
        this.data = d;
        this.desc_despesa = dd;
        this.valor = v;
    }

    // Getters & Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate d) {
        this.data = d;
    }

    public String getDesc_despesa() {
        return desc_despesa;
    }

    public void setDesc_despesa(String dd) {
        this.desc_despesa = dd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double v) {
        this.valor = v;
    }

    // ToString
    @Override
    public String toString() {
        return "Despesa{" +
                "data=" + data +
                ", desc_despesa='" + desc_despesa + '\'' +
                ", valor=" + valor +
                '}';
    }
}
