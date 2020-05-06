package nl.hva.ict.data.MySQL;

import nl.hva.ict.models.Hotel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLHotel extends MySQL<Hotel> {

    private List<Hotel> hotels;

    public MySQLHotel() {
        hotels = new ArrayList<>();
        load();
    }

    private void load() {

        String sql = "SELECT * FROM Hotel";

        try {
            PreparedStatement ps = getStatement(sql);
            ResultSet rs = executeSelectPreparedStatement(ps);

            while (rs.next()) {
                String accommodatiecode = rs.getString("accommodatiecode");
                String naam = rs.getString("naam");
                String stad = rs.getString("stad");
                String land = rs.getString("land");
                String kamertype = rs.getString("kamer");
                int prijsPerNacht = rs.getInt("prijs per nacht");
                int aantalPersonen = rs.getInt("aantal personen");
                boolean checkOntbijt = rs.getBoolean("Ontbijt");
                Hotel hotel = new Hotel(accommodatiecode, naam, stad, land, kamertype, prijsPerNacht, aantalPersonen, checkOntbijt);
                hotels.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Hotel> getAll() {
        return null;
    }

    @Override
    public Hotel get(String id) {
        return null;
    }

    @Override
    public void add(Hotel object) {

    }

    @Override
    public void update(Hotel object) {

    }

    @Override
    public void remove(Hotel object) {

    }
}
