import java.util.Scanner;

import entities.Patient;

public class PatientVue {
    private static Scanner scanner = new Scanner(System.in);
    public static Patient saisiePatient() {
        System.out.println("Entrer votre nom complet:");
        String nomComplet = scanner.next();
        System.out.println("Entrer votre tel:");
        String tel = scanner.next();
        return new Patient(tel, nomComplet);
    }

    public static void listerPatient(Patient[] patients){
        for (int i = 0; i < patients.length; i++) {
            if(patients[i] == null) return;
            System.out.println(patients[i]);
        }
    }

    public static String demandeNumero(){
        System.out.println("enter le numero du client");
        return scanner.nextLine();
    }

    static int showMenu() {
        System.out.println("1-Ajouter un Patient dans le Tableau");
        System.out.println("2-Lister tous les patients du Tableau");
        System.out.println("3-Enregistrer un RV pour un patient");
        System.out.println("4-Lister tous les RV par Etat");
        System.out.println("5-Lister tous les RV par Spécialité");
        System.out.println("6-Traiter RV");
        System.out.println("7-Quitter");
        System.out.println("Entrez votre choix:");
        return scanner.nextInt();
    }
}
