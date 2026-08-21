package EstruturasDeControle;

import java.util.Scanner;

public class NumeroPrimo {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorDeDivisores =0;
        System.out.println("Digite um Numero: ");
        int num = entrada.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDeDivisores++;
            }
        }

        if(contadorDeDivisores == 0){
            System.out.println("Numero Primo: " + num);
        } else System.out.println("Numero Composto.");

        entrada.close();
    }
}
