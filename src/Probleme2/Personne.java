package Probleme2;

public abstract class Personne {
    private String nom, prenom, adresse;
    private int age;
    public static int nb_personnes;


    public Personne(String nom, String prenom, String adresse, int age) {
        Personne.nb_personnes++;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
    }

    public String toString() {

        return "le nom : " + this.nom + " / le prenom : " + this.prenom + " / l'adresse  : " + this.adresse +
                " / l'age : " + this.age + " ";

    }

    abstract public void ecrirePersonne();

    public void nbPersonnes() {

        System.out.println("on a " + Personne.nb_personnes + " personnes et " + Etudiant.nb_etudiant +
                " etudiant et " + Enseignants.nb_enseignant + " enseignant et " + Secretaires.nb_secretaires +
                " Secretaire ");

    }


    public void modifierPersonnes(String newadd) {
        this.adresse = newadd;
    }

}