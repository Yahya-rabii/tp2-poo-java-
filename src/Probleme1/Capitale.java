package Probleme1;

public class Capitale extends Ville {
    private String pays;

    public Capitale(String leNom, String lePays) {
        super(leNom);
        this.pays = lePays;
    }

    public Capitale(String leNom, int leNbHab, String pays) {
        super(leNom, leNbHab);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String presenteToi() {

        String presente = "Ville " + super.getNom() + " nombre d'habitants ";
        if (super.getNbHab() < 0) {
            presente += " inconnu ";
        } else presente += super.getNbHab();

        presente +=" Capitale de "+ this.getPays();
       return presente;
    }
}
