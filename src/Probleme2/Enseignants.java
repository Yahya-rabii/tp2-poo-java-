package Probleme2;

public class Enseignants extends Personne {

    private int nbHeuresCours;
    private boolean grincheux;
    private String specialite;
    public static int nb_enseignant;

    public Enseignants(String nom, String prenom, String adresse, int age, int nbHeuresCours,
                       boolean grincheux, String specialite) {
        super(nom, prenom, adresse, age);
        this.nbHeuresCours = nbHeuresCours;
        this.grincheux = grincheux;
        this.specialite = specialite;
        Enseignants.nb_enseignant++;

    }

    @Override
    public String toString() {
        return super.toString() + "le nombre d'heures : " + this.nbHeuresCours +
                " / le gricheux : " + this.grincheux + " / la specialite  : " + this.specialite + " ";
    }


    @Override
    public void ecrirePersonne() {
        String personneinf = super.toString() + "/ categoie : " + this.getClass().getName();
        System.out.println(personneinf);
    }

    public void modifierPersonnes(String newadd) {
        super.modifierPersonnes(newadd);
        this.ecrirePersonne();
    }

    public double alaireEnseignant(double p) {
        if (this.nbHeuresCours <= 40) {
            p = 100;
        } else
            if (!this.grincheux) {
            p = 150;
        }
        return p;
    }

}
