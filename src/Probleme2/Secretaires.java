package Probleme2;

public class Secretaires extends Personne {
    public int numeroBureau;
    public static int nb_secretaires;

    public Secretaires(String nom, String prenom, String adresse, int age, int numeroBureau) {
        super(nom, prenom, adresse, age);
        this.numeroBureau = numeroBureau;
        Secretaires.nb_secretaires++;
    }

    @Override
    public String toString() {
        return super.toString() + "le numero de Bureau : " + this.numeroBureau + " ";
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
}
