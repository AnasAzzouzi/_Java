package Exercice3;

public class Ajob implements  Runnable {
    Valeur myVal;
    int i ;

    public Ajob(Valeur myVal, int i) {
        this.myVal = myVal;
        this.i = i;
    }

    @Override
    public void run() {
        int a=100;
        while(a>0){
            myVal.add(i);
            a--;
            System.out.println(myVal+" "+Thread.currentThread().getName());
        }

    }
}
