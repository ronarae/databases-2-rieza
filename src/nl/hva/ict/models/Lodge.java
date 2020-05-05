package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;
import java.io.Serializable;

public class Lodge implements Identifable, Serializable {

    private String Accommodatie_accomodatiecode;
    private int prijsPerWeek;
    private boolean autohuur;

    public Lodge(String accommodatie_accomodatiecode, int prijsPerWeek, boolean autohuur) {
        Accommodatie_accomodatiecode = accommodatie_accomodatiecode;
        this.prijsPerWeek = prijsPerWeek;
        this.autohuur = autohuur;
    }

    public Lodge() {
    }

    public String getAccommodatie_accomodatiecode() {
        return Accommodatie_accomodatiecode;
    }

    public void setAccommodatie_accomodatiecode(String accommodatie_accomodatiecode) {
        Accommodatie_accomodatiecode = accommodatie_accomodatiecode;
    }

    public int getPrijsPerWeek() {
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
}
