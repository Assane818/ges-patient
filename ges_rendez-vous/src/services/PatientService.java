package services;

import entities.Patient;

public class PatientService {
    private final int N = 10;
    private int n;
    Patient[] patients = new Patient[N];

    public void addPatient(Patient p){
        if(n < N){
            patients[n++] = p;
        }
        else{
            System.out.println("le tableau est plein");
        }
    }

    public Patient[] listerPatient(){
        return patients;
    }

    public Patient getClientByNumero(String num) {
        for (int i = 0; i < patients.length; i++) {
            if(patients[i] != null && patients[i].getNumero().equals(num)) {
                 return patients[i];
            }
        }
        return null;
    }
}
