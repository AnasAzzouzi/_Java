package Exercice1;

public class Test {
    public static void main(String[] args) {
        Thread t1a = new Thread(new RunnableT());
        Thread t2a = new Thread(new RunnableT());
        ThreadT t1b= new ThreadT();
        ThreadT t2b= new ThreadT();
        t1a.start();
        t2a.start();
        t1b.start();
        t2b.start();

    }
}
