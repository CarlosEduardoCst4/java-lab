package EstruturasDeControle;

import java.util.Scanner;

public class If {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite a Media: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7){
            System.out.println("Aprovado! " + media);
        }

        if(media <7 && media >=4){
            System.out.println("Recuperação! " + media);
        }

        if(media <4 && media >=0){
            System.out.println("Reprovado! " + media);
        }
        entrada.close();
    }
}
