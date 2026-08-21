package EstruturasDeControle;

import java.util.Scanner;

public class AnoBissexto {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int ano = entrada.nextInt();

        boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

        if (bissexto == true){
            System.out.println(ano + "Ano Bissexto!");
        } else System.out.println(ano + "Não é ano Bissexto!");
        entrada.close();
    }
}
