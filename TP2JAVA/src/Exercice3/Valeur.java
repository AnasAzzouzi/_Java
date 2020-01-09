package Exercice3;

public class Valeur {
    int valeur;
    public Valeur(int valeur){
        this.valeur=valeur;
    }
    public int getValeur(){
        return valeur;
    }
    public synchronized void add(int i){
        valeur+=i;
    }

    @Override
    public String toString() {
        return " Valeur = "+valeur;
    }
}
