package Exercice2;

public class Compteur  extends Thread{
    private  String nom;
    private int maxValue;
    private  Value value;

    public Compteur(String nom, int maxValue, Value value) {
        this.nom = nom;
        this.maxValue = maxValue;
        this.value = value;
    }

    @Override
    public void run() {
        while (value.getValue()<=maxValue){

            value.setValue(value.getValue()+1);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out. println(value.getValue()+" "+nom);
        }
    }

}
