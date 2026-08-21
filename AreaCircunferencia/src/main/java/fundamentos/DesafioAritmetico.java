package fundamentos;

public class DesafioAritmetico {
    static void main(String[] args) {
        //1
        double a = Math.pow(6* (3+2), 2);
        double b = 3*2;
        double c = a/b;
        //2
        double d = (1-5) * (2-7);
        double e = Math.pow((d/2), 2);
        //3
        double f = Math.pow((c-e), 3);
        //4
        double y = Math.pow(10, 3);
        //fim
        double x = f/y;

        System.out.println("Resultado: " + x);
    }
}
