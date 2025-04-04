package com.testpersonne.projet;

import java.util.ArrayList;
import java.util.List;

public class Directeur extends Personne {

    private List<Employe> employes;  // Liste d'employés

    public Directeur(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.employes = new ArrayList<>(); // Initialisation de la liste
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e); // Ajout simple sans contrôle
        System.out.println("Employé ajouté : " + e.getPrenom() + " " + e.getNom());
    }

    public void afficherEmployes() {
        System.out.println("\nListe des employés de " + getNom() + " :");
        for (Employe e : employes) {
            System.out.println("- " + e.getPrenom() + " " + e.getNom() + ", " + e.getAge() + " ans");
        }
    }
/*public void poserConge(){
        System.out.println(
                "Le Directeur "+ getPrenom() +" "+getNom()+" agé de "+getAge()
                        +" ans souhaite prendre des congés"
        );
    }*/
}
