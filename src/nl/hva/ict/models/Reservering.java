package nl.hva.ict.models;

import nl.hva.ict.data.Identifable;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class Reservering implements Identifable, Serializable {

    private int idReservering;
    private String Accommodatie_accommodatiecode;
    private String Reiziger_reizigersCode;
    private Date aankomstDatum;
    private Date vertrekDatum;
    private boolean betaald;

    public Reservering(int idReservering, String accommodatie_accommodatiecode, String reiziger_reizigersCode, Date aankomstDatum, Date vertrekDatum, boolean betaald) {
        this.idReservering = idReservering;
        Accommodatie_accommodatiecode = accommodatie_accommodatiecode;
        Reiziger_reizigersCode = reiziger_reizigersCode;
        this.aankomstDatum = aankomstDatum;
        this.vertrekDatum = vertrekDatum;
        this.betaald = betaald;
    }

    public int getIdReservering() {
        return idReservering;
    }

    public void setIdReservering(int idReservering) {
        this.idReservering = idReservering;
    }

    public String getAccommodatie_accommodatiecode() {
        return Accommodatie_accommodatiecode;
    }

    public void setAccommodatie_accommodatiecode(String accommodatie_accommodatiecode) {
        Accommodatie_accommodatiecode = accommodatie_accommodatiecode;
    }

    public String getReiziger_reizigersCode() {
        return Reiziger_reizigersCode;
    }

    public void setReiziger_reizigersCode(String reiziger_reizigersCode) {
        Reiziger_reizigersCode = reiziger_reizigersCode;
    }

    public Date getAankomstDatum() {
        return aankomstDatum;
    }

    public void setAankomstDatum(Date aankomstDatum) {
        this.aankomstDatum = aankomstDatum;
    }

    public Date getVertrekDatum() {
        return vertrekDatum;
    }

    public void setVertrekDatum(Date vertrekDatum) {
        this.vertrekDatum = vertrekDatum;
    }

    public boolean isBetaald() {
        return betaald;
    }

    public void setBetaald(boolean betaald) {
        this.betaald = betaald;
    }
}
