package Aula_14_03_11_21;

import java.io.File;
import java.io.IOException;

public class CriarArquivo {

    public static void main(String[] args) {
        File myObj = new File("filename.txt");  //Instanciando Objeto para manipulação do arquivo

        try {
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("Arquivo já existe!");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro! ");
            e.printStackTrace();
        }
    }
}
