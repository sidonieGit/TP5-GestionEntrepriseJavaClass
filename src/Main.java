import com.testpersonne.projet.Directeur;
import com.testpersonne.projet.Employe;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("Tall", "Ahmed", 60);
        Directeur directeur = new Directeur("Sidibe", "Samir", 45);

        // Ajout d'employés au directeur
        directeur.ajouterEmploye(new Employe("Anice", "Serge", 25));
        directeur.ajouterEmploye(new Employe("Oumou", "Sow", 29));
        directeur.ajouterEmploye(new Employe("Mantho", "Adeiline", 25));

        System.out.println("\n=== Infos ===");
        System.out.println(employe);
        System.out.println(directeur);

        employe.poserConger();
        //directeur.poserConge();

        directeur.afficherEmployes();

    }
}