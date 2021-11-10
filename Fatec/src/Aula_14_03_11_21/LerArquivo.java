package Aula_14_03_11_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {

        try {
            File myObj = new File("filename.txt");  // Objeto para manipulação do arquivo
            Scanner myReader = new Scanner(myObj);  // Objeto para leitura do arquivo

            while (myReader.hasNextLine()) {    // Enquanto existirem linhas, continue...
                String data = myReader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro!");
            e.printStackTrace();
        }
    }
}
