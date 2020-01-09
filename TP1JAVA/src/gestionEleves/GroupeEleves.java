package gestionEleves;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class GroupeEleves {
    private ArrayList<Eleve> listeEleve = new ArrayList<>();
    public int nombre(){
        return listeEleve.size();
    }
    public ArrayList<Eleve> getList(){
        return listeEleve;
    }
    public void ajouterEleve(Eleve eleve){
        listeEleve.add(eleve);
    }
    public Eleve chercher(String nom ){
        Iterator<Eleve> i = listeEleve.iterator();
        Eleve e=null;
        while(i.hasNext()){
            if(i.next().getNom()==nom){
                e=i.next();
            }
        }
        return e;
    }
    public void lister(){
        Iterator<Eleve> i = listeEleve.iterator();

        while(i.hasNext()){
            System.out.println("--"+i.next().toString()+"\n");
        }

    }
    public void trierEleve(){
        Collections.sort(listeEleve);
    }
    public Eleve  meilleurEleve(){

        return Collections.max(listeEleve);
    }

}
