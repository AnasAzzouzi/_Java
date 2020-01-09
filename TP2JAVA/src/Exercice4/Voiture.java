package Exercice4;

public class Voiture extends Thread{
    public int id;
    Park park;
    public Voiture(int id ,Park p){
        this.id=id;
        this.park=p;
    }
    public void run(){
        while(true){
            demandeEntrer();
            quitter();
            try {
                Thread.sleep((long) (1000*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
     public void demandeEntrer(){
        while(!this.park.accept(this)){
        System.out.println(" la voiture id= "+id+" demande une entree ");
            try {
                Thread.sleep((long) (1000*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void quitter(){
        System.out.println(" la voiture id= "+id+" demande une entree ");
        this.park.Vquitte(this);
    }
    public String toString(){
        return "Voiture "+id;

    }
}

