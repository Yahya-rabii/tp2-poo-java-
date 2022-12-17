package Probleme1;

public class Ville {
    private final String nom;
    protected int nbHab;

    public Ville(String leNom) {
        this.nom = leNom;
        this.nbHab = -1;
    }
    public Ville(String leNom, int leNbHab) {
       this.nom = leNom;
        if (nbHab < 0) {
            System.out.println("un nombre d'abittant doit etre positif la modification n'a pas pris en charge");
            this.nbHab =-1;
        } else {
            this.nbHab = leNbHab;
        }
    }
    public String getNom() {
        return nom;
    }
    public int getNbHab() {return nbHab;}

    public void setNbHab(int NbHab) {this.nbHab = NbHab;}
    public String presenteToi() {
        String presente = "Ville " + this.getNom() + " nombre d'habitants ";
        if (this.getNbHab() < 0) {
            presente += " inconnu ";
        } else presente += "= " +this.getNbHab();
        return presente;
    }
}
