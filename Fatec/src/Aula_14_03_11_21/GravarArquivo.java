package Aula_14_03_11_21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GravarArquivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            myWriter.write(texto);
            myWriter.close();

            System.out.println("Gravação feita com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro!");
            e.printStackTrace();
        }
    }
}
