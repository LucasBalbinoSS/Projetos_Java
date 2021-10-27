package Aula_10_29_09_21;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Despesa desp01 = new Despesa(LocalDate.of(2021, 9, 8), "Alimentação",59.90);
        System.out.println(desp01);

        System.out.println();

        Despesa_Pessoal dp01 = new Despesa_Pessoal("169.892.098.95");
        dp01.getDespesas().add(desp01);
        dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 3, 30), "Pet", 400.0));
        System.out.println(dp01);

        System.out.println(dp01.getTotal());

        System.out.println("Total despesas geral: " + dp01.getTotal());
        System.out.println("Total despesas 01/2021: " + dp01.getTotal(1, 2021));
        System.out.println("Total despesas 09/2021: " + dp01.getTotal(9, 2021));

    }
}
