package nl.hva.ict.data.MySQL;

import nl.hva.ict.models.Hotel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLHotel extends MySQL<Hotel> {

    private final List<Hotel> hotels;

    public MySQLHotel() {
        hotels = new ArrayList<>();
        load();
    }

    private void load() {

        String sql = "SELECT * from Hotel INNER JOIN accommodatie ON hotel.Accommodatie_accommodatiecode = accommodatie.accommodatiecode";

        try {
            PreparedStatement ps = getStatement(sql);
            ResultSet rs = executeSelectPreparedStatement(ps);

            while (rs.next()) {
                String Accommodatie_accommodatiecode = rs.getString("Accommodatie_accommodatiecode");
                String naam = rs.getString("naam");
                String stad = rs.getString("stad");
                String land = rs.getString("land");
                String kamer = rs.getString("kamer");
                int persoon = rs.getInt("persoon");
                String soort = rs.getString("soort");
                int prijsPerNacht = rs.getInt("prijsPerNacht");
                boolean ontbijt = rs.getBoolean("ontbijt");
                hotels.add(new Hotel(Accommodatie_accommodatiecode, naam, stad, land, kamer, persoon, soort, prijsPerNacht,  ontbijt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    private void deleteAccommodatie(String accommodatiecode) {
//
//    }

    @Override
    public List<Hotel> getAll() {
        return hotels;
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

    public void reload(){
        hotels.clear();
        load();
    }


}
