package Aula05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tipo = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);

        System.out.println();

        System.out.println("Bem-vindo(a) ao Banco do Brasil!");


        ContaBanco cb1 = new ContaBanco();
        System.out.print("Deseja abrir qual tipo de conta? (CC corrente | CP popança): ");
        cb1.setTipo(tipo.next().toUpperCase(Locale.ROOT));  // Recebendo strings diretamente do usuário e deixando-as com letras maiúsculas //

        System.out.print("Informe seu nome completo: ");
        cb1.setDono(nome.next().strip());   // Recebendo nome do usuário e tirando os espaços //

        System.out.println();

        // Instanciando uma segunda conta //
        ContaBanco cb2 = new ContaBanco();
        System.out.print("Deseja abrir qual tipo de conta? (CC corrente | CP popança): ");
        cb2.setTipo(tipo.next().toUpperCase(Locale.ROOT));

        System.out.print("Informe seu nome completo: ");
        cb2.setDono(nome.next().strip());

        // Saída de dados //
        System.out.println("Tipo de conta do " + cb1.getDono() + ": " + cb1.getTipo());
        System.out.println("Tipo de conta do " + cb2.getDono() + ": " + cb2.getTipo());

    }
}
