package Aula05;

//import java.util.Scanner;

public class ContaBanco {

    // Entrada de dados pelo input do usuário //
    //Scanner input = new Scanner(System.in);

    // Atributos //
    public String num_conta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Getters & Setters //
    public String getNum_conta() {
        return this.num_conta;
    }

    public void setNum_conta(String nc) {
        this.num_conta = nc;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        while (t = ! ("CC") {
            System.out.println();
        }
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    // Métodos //

}
