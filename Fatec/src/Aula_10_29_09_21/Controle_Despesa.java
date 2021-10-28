package Aula_10_29_09_21;

import java.util.Scanner;

public class Controle_Despesa {
    private static int dia;
    private static int ano;
    private static int mes;
    private static String item_despesa;
    private static double valor;
    private static Despesa_Pessoal despesa;

    public Controle_Despesa() {
        Scanner meuScanner = new Scanner(System.in);
        System.out.print("CPF: ");
        String cpf = meuScanner.nextLine();
        despesa = new Despesa_Pessoal(cpf);
    }

    public static void main(String[] args) {
        Controle_Despesa controle = new Controle_Despesa();
        controle.controleDespesas();

    }

    public void controleDespesas() {
        int opcao;
        Scanner sc = new Scanner(System.in);
        String menu;
        menu =      "1 - Lançamento de despesa\n"
                +   "2 - Total geral de despesas\n"
                +   "3 - Total de despesas mês/ano\n"
                +   "4 - Total de despesas dia/mês/ano\n"
                +   "5 - Imprimir todas as despesas\n"
                +   "6 - Imprimir despesas mês/ano\n"
                +   "7 - Imprimir despesas dia/mês/ano\n"
                +   "8 - Sair";

        do {
            System.out.println(menu);
            System.out.println();

            System.out.print("Escolha uma das opções: ");
            opcao = sc.nextInt();
        } while (opcao != 8);
        sc.close();

    }

    public void entradaDia() {
    }

    public void entradaMes() {
    }

    public void entradaAno() {
    }
}
