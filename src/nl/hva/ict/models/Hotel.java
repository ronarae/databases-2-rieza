package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;

import java.io.Serializable;

public class Hotel  extends Accommodatie implements Identifable, Serializable {

    private String accommodatiecode;
    private int prijsPerNacht;
    private boolean ontbijt;


    public Hotel(String accommodatiecode, String naam, String stad, String land, String kamer,
                 int persoon, String soort, int prijsPerNacht, boolean ontbijt) {
        super (accommodatiecode, naam, stad, land, kamer, persoon, soort);
        this.prijsPerNacht = prijsPerNacht;
        this.ontbijt = ontbijt;
    }

    public String getAccommodatie_accomodatiecode() {
        return accommodatiecode;
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

//    @Override
//    public String toString() {
//        if (ontbijt == false){
//            return "Accommodatie Code: " + accommodatiecode + " Prijs per Nacht: " + prijsPerNacht +
//                    " Ontbijt: No";
//        } else {
//            return "Accommodatie Code: " + accommodatiecode + " Prijs per Nacht: " + prijsPerNacht +
//                    " Ontbijt: Yes";
//
//        }
//
//
//
//
//    }
}
