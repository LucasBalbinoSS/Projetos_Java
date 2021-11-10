package Aula05;

public class ContaBanco {

    // Atributos //
   public String num_conta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;

   // Getters & Setters //
    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String nc) {
        nc = this.num_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        t = this.tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        d = this.dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        s = this.saldo;
    }

}
