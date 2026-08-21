package EstruturasDeControle;

import java.util.Scanner;

public class Media {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;

        System.out.println("Digite a Primeira Nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a Segunda Nota: ");
        nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media != -1){
            if(media >=7 && media <=10){
                System.out.println("Aprovado!");
            } else if (media >=4 && media <7){
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!");
            }
        }
        entrada.close();
    }
}
