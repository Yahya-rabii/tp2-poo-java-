package Probleme2;

public class Etudiant extends Personne {
    private int noteMoyenne;
    private String diplomeEnCours;
    public static int nb_etudiant;

    public Etudiant(String nom, String prenom, String adresse, int age, int noteMoyenne, String diplomeEnCours) {
        super(nom, prenom, adresse, age);
        this.noteMoyenne = noteMoyenne;
        this.diplomeEnCours = diplomeEnCours;
        Etudiant.nb_etudiant++;
    }

    @Override
    public void ecrirePersonne() {
        String personneinf = super.toString() + "/ categoie : " + this.getClass().getName();
        System.out.println(personneinf);
    }

    @Override
    public String toString() {
        return super.toString() + "la note Moyenne : " + this.noteMoyenne +
                " / le diplomee cours   : " + this.diplomeEnCours + " ";
    }

    public void modifierPersonnes(String newadd) {
        super.modifierPersonnes(newadd);
        this.ecrirePersonne();
    }
}