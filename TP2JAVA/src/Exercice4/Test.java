package Exercice4;

public class Test {
    public static void main(String[] args) {
        Park p = new Park(8);
        Voiture[] vs = new Voiture[14];
        for (int i=0;i<15;i++){
             vs[i] = new Voiture(i,p);
             vs[i].start();
        }
        System.out.println(p.InfoPark());


    }
}
