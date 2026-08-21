package fundamentos;

import java.util.Scanner;

public class Console {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos. ", nome, sobrenome, idade);

        entrada.close();
    }
}
