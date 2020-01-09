package Exercice3;

public class Test {
    public static void main(String[] args) {
        Valeur v = new Valeur(10);
        Thread t1= new Thread(new Ajob(v,1));
        Thread t2= new Thread(new Ajob(v,-1));
        t1.start();
        t2.start();
    }


}
