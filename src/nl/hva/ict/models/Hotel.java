package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;

import java.io.Serializable;

public class Hotel implements Identifable, Serializable {

    private String Accommodatie_accommodatiecode;
    private int prijsPerNacht;
    private boolean ontbijt;

    public Hotel(String accommodatie_accommodatiecode, int prijsPerNacht, boolean ontbijt) {
        Accommodatie_accommodatiecode = accommodatie_accommodatiecode;
        this.prijsPerNacht = prijsPerNacht;
        this.ontbijt = ontbijt;
    }

    public Hotel() {
    }

    public String getAccommodatie_accommodatiecode() {
        return Accommodatie_accommodatiecode;
    }

    public void setAccommodatie_accommodatiecode(String accommodatie_accommodatiecode) {
        Accommodatie_accommodatiecode = accommodatie_accommodatiecode;
    }

    public int getPrijsPerNacht() {
        return prijsPerNacht;
    }

    public void setPrijsPerNacht(int prijsPerNacht) {
        this.prijsPerNacht = prijsPerNacht;
    }

    public boolean isOntbijt() {
        return ontbijt;
    }

    public void setOntbijt(boolean ontbijt) {
        this.ontbijt = ontbijt;
    }
}
