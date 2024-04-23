import java.util.Scanner;

import entities.DemandeRv;
import enums.Etat;
import enums.Specialite;

public class DemandeRvVue {
    private static Scanner scanner = new Scanner(System.in);
    public static DemandeRv saisieRv() {
        String date, heure, motif;
        Specialite specialite;
        System.out.println("Entrer la date:");
        date = scanner.next();
        System.out.println("Entrer l'heure:");
        heure = scanner.next();
        specialite = demanderSpecialite();
        System.out.println("Entrer le motif:");
        motif = scanner.next();
        return new DemandeRv(date, heure, motif, specialite);
    }
    public static void listerDemandes(DemandeRv[] demandes){
        for (int i = 0; i < demandes.length; i++) {
            System.out.println(demandes[i]);
        }
    }
    

    public static Specialite demanderSpecialite() {
        int pos;
        do {
            System.out.println("1 - Cardiologie");
            System.out.println("2 - Ophtalmologie");
            System.out.println("3 - Urologie");
            System.out.println("Entrez le numéro de la spécialité:");
            pos = scanner.nextInt();
        } while (pos < 1 || pos > 3);
        return Specialite.values()[pos - 1];
    }
    public static Etat demanderEtat() {
        int pos;
        do {
            System.out.println("1 - Valider");
            System.out.println("2 - Annuler");
            System.out.println("Entrez le numéro de l'état:");
            pos = scanner.nextInt();
        } while (pos != 1 && pos != 2);

        return Etat.values()[pos];
    }

}
