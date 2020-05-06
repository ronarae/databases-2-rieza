package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;
import java.io.Serializable;

public class SafariLodge implements Identifable, Serializable {

    private String Accommodatie_accomodatiecode;
    private double prijsPerWeek;
    private boolean autohuur;

    public SafariLodge(String accommodatie_accomodatiecode, double prijsPerWeek, boolean autohuur) {
        Accommodatie_accomodatiecode = accommodatie_accomodatiecode;
        this.prijsPerWeek = prijsPerWeek;
        this.autohuur = autohuur;
    }

    public String getAccommodatie_accomodatiecode() {
        return Accommodatie_accomodatiecode;
    }

    public void setAccommodatie_accomodatiecode(String accommodatie_accomodatiecode) {
        Accommodatie_accomodatiecode = accommodatie_accomodatiecode;
    }

    public double getPrijsPerWeek() {
        return prijsPerWeek;
    }

    public void setPrijsPerWeek(int prijsPerWeek) {
        this.prijsPerWeek = prijsPerWeek;
    }

    public boolean isAutohuur() {
        return autohuur;
    }

    public void setAutohuur(boolean autohuur) {
        this.autohuur = autohuur;
    }

    @Override
    public String toString() {
        if (autohuur == false){
            return "Accommodatie Code: " + Accommodatie_accomodatiecode + " Prijs per week: " + prijsPerWeek +
                    " Autohuur: No";
        } else {
            return "Accommodatie Code: " + Accommodatie_accomodatiecode + " Prijs per week: " + prijsPerWeek +
                    " Autohuur: Yes";

        }
    }
}