package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero\":");
        String s2 = entrada.next();
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }

}
