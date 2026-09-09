package Lambdas;

public class Threads {


    public Threads(Runnable trabalho1) {
    }


    static void main(String[] args) {

        Runnable trabalho1 = new Trabalho1();
        Runnable trabalho2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i ++){
                    System.out.println("Tarefa #02");
                    try {
                        Threads.sleep(100);
                    } catch (Exception e){
                    }
                }
            }
        };

        Runnable trabalho3 = Threads::trabalho3;

        Threads t1 = new Threads(trabalho1);
        Threads t2 = new Threads(trabalho2);
        Threads t3 = new Threads(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }

    private void start() {
    }

    private static void sleep(int i) {
    }

    static void trabalho3(){
        for (int i=0; i<10; i++){
            System.out.println("Tarefa #03");
            try {
                Threads.sleep(100);
            } catch (Exception e){
            }
        }
    }
}
