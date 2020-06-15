package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;

import java.io.Serializable;

public class Accommodatie implements Identifable, Serializable {

    private String accommodatiecode;
    private String naam;
    private String stad;
    private String land;
    private String kamer;
    private int persoon;
    private String type;

    public Accommodatie(String accommodatiecode, String naam, String stad, String land, String kamer, int persoon, String type) {
        this.accommodatiecode = accommodatiecode;
        this.naam = naam;
        this.stad = stad;
        this.land = land;
        this.kamer = kamer;
        this.persoon = persoon;
        this.type = type;
    }

    public Accommodatie() {
    }

    public String getAccomodatiecode() {
        return accommodatiecode;
    }

    public void setAccomodatiecode(String accomodatiecode) {
        this.accommodatiecode = accommodatiecode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getKamer() {
        return kamer;
    }

    public void setKamer(String kamer) {
        this.kamer = kamer;
    }

    public int getPersoon() {
        return persoon;
    }

    public void setPersoon(int persoon) {
        this.persoon = persoon;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
