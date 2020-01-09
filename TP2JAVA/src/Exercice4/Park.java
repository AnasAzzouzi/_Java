package Exercice4;

import java.util.ArrayList;

public class Park {
    private int NumeroPlace;
    private int placeRestant;
    private ArrayList<Voiture> listV;
    public Park(int np){
        NumeroPlace=np;
        listV= new ArrayList<>();
        placeRestant=NumeroPlace;
    }
    public synchronized Boolean accept(Voiture v){

        if(placeRestant>0){
            placeRestant--;
            listV.add(v);
            System.out.println("Voiture id ="+v.id+" accepte");
            return true;

        }
        else{
            System.out.println("access refuse pour la voiture id="+v.id);
            return false;
        }
    }
    public  synchronized  void Vquitte(Voiture v){

        placeRestant++;
        listV.remove(v);
        System.out.println("Voiture id ="+v.id+" a quitte");

    }


    public synchronized  String InfoPark() {
        String s=" les voitures dand li park sont : \n";
        for( Voiture v : listV){
            s=s+v.toString()+"\n";
        }

        return s;
    }
}
