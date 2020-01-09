package gestionEleves;

import java.util.Collections;

public class TestEleve {
    public static void main(String[] args) {
        Eleve e1= new Eleve("Eleve 1");
        e1.ajouterNote(18);
        e1.ajouterNote(13);
        e1.ajouterNote(16);
        Eleve e2= new Eleve("Eleve 2");
        e2.ajouterNote(10);
        e2.ajouterNote(19);
        e2.ajouterNote(15);
        Eleve e3= new Eleve("Eleve 3");
        e3.ajouterNote(19);
        e3.ajouterNote(20);
        e3.ajouterNote(18);
        GroupeEleves gp1= new GroupeEleves();
        gp1.ajouterEleve(e1);
        gp1.ajouterEleve(e2);
        gp1.ajouterEleve(e3);

        gp1.lister();
        Collections.sort(gp1.getList());
        System.out.println("-------------\n");
        gp1.lister();
        System.out.println("le meilleur eleve est : "+gp1.meilleurEleve());

    }
}
