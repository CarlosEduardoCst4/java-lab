package fundamentos;

public class DesafioLogico {

    static void main(String[] args) {

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean ex1 = trabalho1 && trabalho2;
        System.out.println("Os trabalhos deram certo\"?" + ex1 );

        boolean ex2 = trabalho1 && trabalho2;
        System.out.println("se os dois deram certo - TV 50: " + ex2);

        boolean ex3 = trabalho1 ^ trabalho2;
        System.out.println( "se um so deu certo - TV 32: " + ex3);

        boolean ex4 = trabalho1 || trabalho2;
        System.out.println("se TV deu certo, sorvete, se não deu certo, casa!" + ex4);
    }
}
