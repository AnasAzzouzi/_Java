package Exercice2;

public class Test {
    public static void main(String[] args) {
        Value value = new Value(1);
        Compteur[] cpts= new Compteur[10];

        for(int i=0;i<10;i++){
            cpts[i]= new Compteur("Compteur "+i,100,value);
        }
        for(int i=0;i<10;i++){
            cpts[i].start();
        }

    }
}
