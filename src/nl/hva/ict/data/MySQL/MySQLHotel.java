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
                String Accommodatie_accommodatiecode = rs.getString("Accommodatie_accommodatiecode");
//                String naam = rs.getString("naam");
//                String stad = rs.getString("stad");
//                String land = rs.getString("land");
//                String kamertype = rs.getString("kamer");
                int prijsPerNacht = rs.getInt("prijsPerNacht");
           //     int aantalPersonen = rs.getInt("aantal personen");
                boolean ontbijt = rs.getBoolean("ontbijt");
                Hotel hotel = new Hotel(Accommodatie_accommodatiecode,prijsPerNacht, ontbijt);
                hotels.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
