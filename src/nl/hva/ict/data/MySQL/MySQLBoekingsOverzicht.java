package nl.hva.ict.data.MySQL;

import nl.hva.ict.models.Accommodatie;
import nl.hva.ict.models.BoekingsOverzicht;
import nl.hva.ict.models.Reiziger;
import nl.hva.ict.models.Reservering;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class MySQLBoekingsOverzicht extends MySQL<BoekingsOverzicht> {

    private final List<BoekingsOverzicht> boekingsOverzicht;

    public MySQLBoekingsOverzicht() {
        boekingsOverzicht = new ArrayList<>();
        load();
    }

    private void load() {

        String sql = "SELECT reservering.idReservering, reservering.aankomstDatum, reservering.vertrekDatum, reservering.betaald,\n" +
                "reservering.Accommodatie_accommodatiecode, reservering.Reiziger_reizigersCode, accommodatie.naam,\n" +
                "accommodatie.stad, accommodatie.soort, reiziger.voornaam, reiziger.achternaam, reiziger.plaats\n" +
                "FROM accommodatie\n" +
                "INNER JOIN reservering on reservering.Accommodatie_accommodatiecode = accommodatie.accommodatiecode\n" +
                "INNER JOIN reiziger on reservering.Reiziger_reizigersCode = reiziger.reizigersCode";

        try {
            PreparedStatement ps = getStatement(sql);
            ResultSet rs = executeSelectPreparedStatement(ps);

            while (rs.next()) {
                int idReservering = rs.getInt("idReservering");
                Date aankomstDatum = rs.getDate("aankomstDatum");
                Date vertrekDatum = rs.getDate("vertrekDatum");
                boolean betaald = rs.getBoolean("betaald");
                String accommodatieCode = rs.getString("accommodatieCode");
                String reizerCode = rs.getString("reizigerCode");
                String voornaam = rs.getString("voornaam");
                String achternaam = rs.getString("achternaam");
                String adres = rs.getString("adres");
                String postcode = rs.getString("postcode");
                String plaats = rs.getString("plaats");
                String land = rs.getString("land");
                String hoofdreiziger = rs.getString("hoofdreiziger");
                String accommodatieNaam = rs.getString("naam");
                String accommodatieStad = rs.getString("stad");
                String accommodatieLand = rs.getString("land");
                String accommodatieType = rs.getString("soort");
                Reservering reservering = new Reservering(idReservering, accommodatieCode, reizerCode, aankomstDatum, vertrekDatum, betaald);
                Reiziger reiziger = new Reiziger(reizerCode, voornaam, achternaam, adres, postcode, plaats, land, hoofdreiziger);
                Accommodatie accommodatie = new Accommodatie();
                accommodatie.setNaam(accommodatieNaam);
                accommodatie.setStad(accommodatieStad);
                accommodatie.setLand(accommodatieLand);

                boekingsOverzicht.add(new BoekingsOverzicht(accommodatie, reiziger, reservering));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<BoekingsOverzicht> getBoekingVoor(String reizigerscode) {

        List<BoekingsOverzicht> reserveringVoor = new ArrayList<>();

        String sql = "";

        try {
            PreparedStatement ps = getStatement(sql);
            ps.setString(1, reizigerscode);
            ResultSet rs = executeSelectPreparedStatement(ps);

            while (rs.next()) {
                int idReservering = rs.getInt("idReservering");
                Date aankomstDatum = rs.getDate("aankomstDatum");
                Date vertrekDatum = rs.getDate("vertrekDatum");
                boolean betaald = rs.getBoolean("betaald");
                String accommodatieCode = rs.getString("accommodatieCode");
                String reizerCode = rs.getString("reizigerCode");

                String reizigerVoornaam = rs.getString("voornaam");
                String reizigerAchternaam = rs.getString("achternaam");
                String reizigerPlaats = rs.getString("plaats");
                String accommodatieNaam = rs.getString("naam");
                String accommodatieStad = rs.getString("stad");
                String accommodatieLand = rs.getString("land");
                String accommodatieType = rs.getString("soort");

                Reservering reservering = new Reservering(idReservering, accommodatieCode, reizerCode, aankomstDatum, vertrekDatum, betaald);
                Accommodatie accommodatie = new Accommodatie();
                accommodatie.setNaam(accommodatieNaam);
                accommodatie.setStad(accommodatieStad);
                accommodatie.setLand(accommodatieLand);
                accommodatie.setType(accommodatieType);

                Reiziger reiziger = new Reiziger();
                reiziger.setVoornaam(reizigerVoornaam);
                reiziger.setAchternaam(reizigerAchternaam);
                reiziger.setPlaats(reizigerPlaats);

                reserveringVoor.add(new BoekingsOverzicht(accommodatie, reiziger, reservering));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return reserveringVoor;
    }

    public List<Reiziger> GeboektOp(String pCode, LocalDate pDatum) {

        List<Reiziger> geboektOp = new ArrayList<>();
        Date date = Date.valueOf(pDatum);

        String sql = "";

        try {
            PreparedStatement ps = getStatement(sql);
            ps.setString(1, pCode);
            ps.setDate(2, date);
            ResultSet rs = executeSelectPreparedStatement(ps);

            while (rs.next()) {
                String reizigerCode = rs.getString("reizigerCode");
                String reizigerVoornaam = rs.getString("voornaam");
                String reizigerAchternaam = rs.getString("achternaam");
                String reizigerPlaats = rs.getString("plaats");

                Reiziger reiziger = new Reiziger();
                reiziger.setReizigersCode(reizigerCode);
                reiziger.setVoornaam(reizigerVoornaam);
                reiziger.setAchternaam(reizigerAchternaam);
                reiziger.setPlaats(reizigerPlaats);
                geboektOp.add(reiziger);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return geboektOp;
    }

    @Override
    public List<BoekingsOverzicht> getAll() {
        return boekingsOverzicht;
    }

    @Override
    public BoekingsOverzicht get(String id) {
        return null;
    }

    @Override
    public void add(BoekingsOverzicht object) {

    }

    @Override
    public void update(BoekingsOverzicht object) {

    }

    @Override
    public void remove(BoekingsOverzicht object) {

    }
}
