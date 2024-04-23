import entities.Patient;
import enums.Etat;
import enums.Specialite;
import services.DemandeRvService;
import services.PatientService;

public class App {
    public static void main(String[] args) throws Exception {
        PatientService patientService = new PatientService();
        DemandeRvService demandeRvService = new DemandeRvService();
        int choix;
        do {
            choix = PatientVue.showMenu();
            switch (choix) {
                case 1 ->{
                    patientService.addPatient(PatientVue.saisiePatient());
                }
                case 2 ->{
                    PatientVue.listerPatient(patientService.listerPatient());
                } 
                case 3 ->{
                    String num = PatientVue.demandeNumero();
                    Patient p = patientService.getClientByNumero(num);
                    if (p != null) {
                        demandeRvService.addRvByPatient(p, DemandeRvVue.saisieRv());
                    }
                    else{
                        System.out.println("patient n'existe pas");
                    }
                }
                case 4 ->{
                    Etat etat = DemandeRvVue.demanderEtat();
                    DemandeRvVue.listerDemandes(demandeRvService.listerAllByEtat(patientService.listerPatient(),etat));
                }
                case 5 ->{
                    Specialite sp = DemandeRvVue.demanderSpecialite();
                    DemandeRvVue.listerDemandes(demandeRvService.listerAllBySpecialite(patientService.listerPatient(),sp));
                } 
                case 6 ->{
                }    
                default->{
                    System.out.println("Choix invalide");
                }
            }
        } while (choix != 7);
    }
}
