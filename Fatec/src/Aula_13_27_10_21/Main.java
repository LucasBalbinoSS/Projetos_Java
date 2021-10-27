package Aula_13_27_10_21;

public class Main {
    public static void main(String[] args) {
        int a = 7, b = 0;

        System.out.printf("\na + b = %d", (a + b));
        System.out.printf("\na - b = %d", (a - b));
        System.out.printf("\na * b = %d", (0));

        try {
            System.out.printf("\na / b = %d", (a / b));

        } catch (Exception ex) {
            System.out.println("\nEITAA, deu ruim amigo, não divida um número por zero!");
        }

        System.out.println("\nF I M");
    }
}
