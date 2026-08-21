package fundamentos;

import java.util.Locale;

public class TipoString {
    static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(5));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santoss";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R%.2f.\n", nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha R%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase Qualquer".contains("Qual"));
        System.out.println("Frase Qualquer".indexOf("Qual"));
        System.out.println("Frase Qualquer".substring(6));
        System.out.println("Frase Qualquer".substring(6, 10));
    }
}
