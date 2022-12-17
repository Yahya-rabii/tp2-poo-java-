package Probleme1;

public class Main {
    public static void main(String[] args) {

        Ville v1=new Ville("Lyon",1500000);
        Ville v2=new Ville("Bobigny",-1);
        Capitale c1=new Capitale("Paris",10000000,"France");
        Capitale c2=new Capitale("Ouagadougou",-1,"Burkina-Faso");

        System.out.println(v1.presenteToi());
        System.out.println(v2.presenteToi());
        System.out.println(c1.presenteToi());
        System.out.println(c2.presenteToi());
    }
}