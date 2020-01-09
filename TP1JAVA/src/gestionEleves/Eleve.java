package gestionEleves;

import java.util.ArrayList;
import java.util.Iterator;

public class Eleve implements  Comparable<Eleve>{
    private String nom;
    private ArrayList<Integer> notes;
    private double moyenne=0;
    public Eleve(String nom){
        this.nom=nom;
        notes= new ArrayList<>();
    }
     public double getMoyenne(){
         Iterator<Integer> i = notes.iterator();
         double sum=0;
         while(i.hasNext()) {
              sum += i.next();
         }
         moyenne=sum/notes.size();
         return moyenne ;
         }
    public void ajouterNote(Integer note){
         notes.add(note);

    }
    public String getNom(){
         return nom;
    }
    public ArrayList<Integer> getListeNotes(){
         return notes;
    }
    public String toString(){
         Iterator<Integer> i = notes.iterator();
         String lnotes="";
         while(i.hasNext()) {
            lnotes += i.next()+" -- ";
        }
         return "Name : "+nom+" Liste des notes :"+lnotes+" Moyenne : "+getMoyenne();

    }

    @Override
    public int compareTo(Eleve o) {
        return (int) (this.moyenne-o.getMoyenne());
    }
}


