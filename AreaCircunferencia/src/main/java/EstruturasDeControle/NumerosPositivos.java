package EstruturasDeControle;

import java.util.Scanner;

public class NumerosPositivos {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         int num = 0;
         int soma = 0;

         while (num >=0){
             System.out.println("Digite um numero positivo: ");
             num = entrada.nextInt();
             if(num != -1){
                 soma += num;
                 System.out.println("- " + soma);
             }
         }
        System.out.println("Numero Negativo Digitado! " + num);
        entrada.close();
    }
}
