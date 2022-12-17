package Probleme2;

import java.util.ArrayList;

public class Gestion {
    public static void main(String[] args) {
        Personne[] personne = new Personne[100];

        personne[0] = new Secretaires("Hakima", "Atid", "NY city", 21, 33);
        personne[1] = new Enseignants("yahya", "rabii", "Casablanca", 21, 55, true, "ingeneurie");
        personne[2] = new Enseignants("youness", "hounain", "Casablanca", 20, 20, false, "AI");
        personne[3] = new Etudiant("ahmed", "adb", "Casablanca", 22, 15, "Miage");
        personne[4] = new Etudiant("aymen", "qou", "Casablanca", 24, 20, "reseaux");
        personne[5] = new Etudiant("laila", "noor", "Casablanca", 19, 11, "IFA");
        personne[6] = new Secretaires("asmaa", "ou", "rabat", 29, 30);
        personne[7] = new Enseignants("amine", "karimi", "sale", 23, 20, true, "it ser");
        personne[8] = new Etudiant("charaf", "lmd", "knitra", 29, 13, "Miage");

        int i = 0;
        int count = 0;
        while (i < personne.length) {
            if (personne[i] != null) {
                count++;
                System.out.println(personne[i].toString() + "\n");
            }
            i++;

        }
        personne[count - 1].nbPersonnes();

        //////////////////////////////////////////

        Personne[] personne2 = trie(personne);
        i = 0;
        count = 0;

        System.out.println("\n\n\n");

        while (i < personne2.length) {


            if (personne2[i] != null) {
                count++;
                System.out.println(personne2[i].toString() + "\n");

            }
            i++;
        }
        personne2[count - 1].nbPersonnes();
    }


    public static Personne[] trie(Personne[] personne) {


        Personne[] personne2 = new Personne[personne.length];
        int k = 0;

        ////////////////////////////////////////////////////////
        for (int e = 0; e < personne.length; e++) {
            if (personne[e] != null && personne[e].getClass().getName().equals("Probleme2.Secretaires")) {
                personne2[k] = personne[e];
                k++;
            }
        }
        ////////////////////////////////////////////////////////
        for (int e = 0; e < personne.length; e++) {
            if (personne[e] != null && personne[e].getClass().getName().equals("Probleme2.Enseignants")) {
                personne2[k] = personne[e];
                k++;
            }
        }
        ////////////////////////////////////////////////////////
        for (int e = 0; e < personne.length; e++) {
            if (personne[e] != null && personne[e].getClass().getName().equals("Probleme2.Etudiant")) {
                personne2[k] = personne[e];
                k++;
            }
        }
        /////////////////////////////////////////////////////////
        return personne2;
    }

}