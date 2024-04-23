package services;

import entities.DemandeRv;
import entities.Patient;
import enums.Etat;
import enums.Specialite;

public class DemandeRvService {
    private final int N = 50;
    private DemandeRv[] allDemandes = new DemandeRv[N];
    private int z;

    public void addRvByPatient(Patient p, DemandeRv r){
        int n;
        n = p.getN();
        if (n < p.getNbreRv()) {
            p.getDemandes()[n++] = r;
            r.setPatient(p);
        }
    }

    public DemandeRv[] listerAllByEtat(Patient[] patients, Etat etat){
        for (int i = 0; i < patients.length; i++) {
            if(patients[i] != null) {
                for (int j = 0; j < patients[i].getDemandes().length; j++) {
                    if (z < N && patients[i].getDemandes()[j].getEtat().equals(etat)){
                        allDemandes[z++] = patients[i].getDemandes()[j];
                    }
                }
            }
        }
        return allDemandes;
    }

    public DemandeRv[] listerAllBySpecialite(Patient[] patients, Specialite sp){
        for (int i = 0; i < patients.length; i++) {
            if(patients[i] != null) {
                for (int j = 0; j < patients[i].getDemandes().length; j++) {
                    if (z < N && patients[i].getDemandes()[j].getSpecialite().equals(sp)){
                        allDemandes[z++] = patients[i].getDemandes()[j];
                    }
                }
            }
        }
        return allDemandes;
    }

    public void traiterRv(DemandeRv r, Etat etat){
        r.setEtat(etat);
    }
}
