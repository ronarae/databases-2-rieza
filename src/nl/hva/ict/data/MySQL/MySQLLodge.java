package nl.hva.ict.data.MySQL;

import nl.hva.ict.models.Lodge;
import nl.hva.ict.models.Reiziger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLLodge extends MySQL<Lodge>  {

    private List<Lodge> lodges;

    public MySQLLodge() {
        lodges = new ArrayList<>();
        load();
    }

    private void load() {

        String sql = "SELECT * FROM Lodge";

        try {
            PreparedStatement ps = getStatement(sql);
            ResultSet rs = executeSelectPreparedStatement(ps);

            while (rs.next()) {
                String accommodatiecode = rs.getString("accommodatiecode");
                String naam = rs.getString("naam");
                String stad = rs.getString("stad");
                String land = rs.getString("land");
                String kamertype = rs.getString("kamertype");
                double prijsPerWeek = rs.getDouble("prijs per week");
                int aantalPersonen = rs.getInt("aantal personen");
                boolean checkAutohuur = rs.getBoolean("auntohuur");
                Lodge lodge = new Lodge(accommodatiecode, naam, stad, land,
                        kamertype, prijsPerWeek, aantalPersonen, checkAutohuur);
                lodges.add(lodge);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Lodge> getAll() {
        return null;
    }

    @Override
    public Lodge get(String id) {
        return null;
    }

    @Override
    public void add(Lodge object) {

    }

    @Override
    public void update(Lodge object) {

    }

    @Override
    public void remove(Lodge object) {

    }
}
