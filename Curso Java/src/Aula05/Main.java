package Aula05;


public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco("398.30", "CC", "Lucas Balbino", 1060.0f, true);
        ContaBanco c2 = new ContaBanco();
        System.out.println(c2);
    }
}
