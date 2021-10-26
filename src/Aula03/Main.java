package Aula03;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Testando Java...");
        System.out.println();

        Caneta c1 = new Caneta();
        c1.modelo = "Faber Castel";
        c1.cor = "Rosa";
        c1.carga = 100;
        c1.tampar();
        c1.rabiscar();

        c1.status();
    }
}
