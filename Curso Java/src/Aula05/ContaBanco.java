package Aula05;

public class ContaBanco {

    // Atributos //
   public String num_conta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;

   // Construtor //

    public ContaBanco() {

    }

    public ContaBanco(String num_conta, String tipo,
                      String dono, float saldo,
                      boolean status)
    {
        this.num_conta = num_conta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;

    }

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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean sts) {
        sts = this.status;
    }

    // Outros métodos //
    public void abrir_conta() {
        setStatus(true);
    }

}
