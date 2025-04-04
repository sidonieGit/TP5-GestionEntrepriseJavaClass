package com.testpersonne.projet;

import java.util.Comparator;

public class Employe extends Personne{

    public Employe(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public void poserConger(){
        System.out.println(
                "L'employé "+getPrenom() +" "+getNom()+" agé de "+getAge()
                        +" ans souhaite prendre des congés"
        );
    }

    @Override
    public String toString() {
        return "Employe{" + getPrenom() + " " + getNom() + ", " + getAge() + " ans}";
    }


}
