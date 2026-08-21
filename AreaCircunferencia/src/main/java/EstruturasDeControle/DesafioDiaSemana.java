package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        String dia = entrada.next();

        if(dia.equalsIgnoreCase("domingo")){
            System.out.println("1 - " + dia);
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2 - " + dia);
        } else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("TerCa")) {
            System.out.println("3 - " + dia);
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("4 - " + dia);
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("5 - " + dia);
        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println("6 - " + dia);
        } else if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Sábado")) {
            System.out.println("7 - " + dia);
        }else {
            System.out.println("Valor Invalido!");
        }
    }
}
