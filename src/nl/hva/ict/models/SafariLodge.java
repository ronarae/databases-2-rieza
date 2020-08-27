package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;
import java.io.Serializable;

public class SafariLodge extends Accommodatie implements Identifable, Serializable {

    private double prijsPerWeek;
    private boolean autohuur;

    public SafariLodge(String accommodatieCode, String naam, String stad, String land, String kamer, int personen, String soort, double prijsPerWeek, boolean autohuur) {
        super(accommodatieCode, naam, stad, land, kamer, personen, soort);
        this.prijsPerWeek = prijsPerWeek;
        this.autohuur = autohuur;
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


}
