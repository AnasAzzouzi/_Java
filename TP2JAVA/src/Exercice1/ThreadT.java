package Exercice1;

public class ThreadT extends Thread {
    public void run() {
        int i=1;
        while(i<1000){
            System.out.println( i+" "+Thread.currentThread().getName() );
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
