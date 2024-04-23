package entities;

import java.util.Arrays;

public class Patient {
    private String nomComplet,tel,numero;
    private static String nbrePatient = "0000";
    private final int nbreRv = 10;
    private DemandeRv[] demandes = new DemandeRv[nbreRv];
    private int n;

    public Patient(){
        nbrePatient = String.format("%04d", Integer.parseInt(nbrePatient) + 1);
        numero = "PAT" + nbrePatient;
    }

    public Patient(String nomComplet, String tel){
        nbrePatient = String.format("%04d", Integer.parseInt(nbrePatient) + 1);
        numero = "PAT" + nbrePatient;
        this.nomComplet = nomComplet;
        this.tel = tel;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public static String getNbrePatient() {
        return nbrePatient;
    }
    public static void setNbrePatient(String nbrePatient) {
        Patient.nbrePatient = nbrePatient;
    }
    public int getNbreRv() {
        return nbreRv;
    }
    public DemandeRv[] getDemandes() {
        return demandes;
    }
    
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomComplet == null) ? 0 : nomComplet.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + nbreRv;
        result = prime * result + Arrays.hashCode(demandes);
        result = prime * result + n;
        return result;
    }

    

    @Override
    public String toString() {
        return "Patient [nomComplet=" + nomComplet + ", tel=" + tel + ", numero=" + numero + ", demandes="
                + Arrays.toString(demandes) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (nomComplet == null) {
            if (other.nomComplet != null)
                return false;
        } else if (!nomComplet.equals(other.nomComplet))
            return false;
        if (tel == null) {
            if (other.tel != null)
                return false;
        } else if (!tel.equals(other.tel))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (nbreRv != other.nbreRv)
            return false;
        if (!Arrays.equals(demandes, other.demandes))
            return false;
        if (n != other.n)
            return false;
        return true;
    }
}
