package nl.hva.ict.data.MySQL;

import nl.hva.ict.models.SafariLodge;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLSafariLodge extends MySQL<SafariLodge>  {

    private List<SafariLodge> safariLodges;

    public MySQLSafariLodge() {
        safariLodges = new ArrayList<>();
        load();
    }

    private void load() {

        String sql = "SELECT * FROM safarilodge INNER JOIN accommodatie ON safarilodge.Accommodatie_accommodatiecode = accommodatie.accommodatiecode";

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
                double prijsPerWeek = rs.getDouble("prijsPerWeek");
                boolean autohuur = rs.getBoolean("autohuur");
                safariLodges.add(new SafariLodge(Accommodatie_accommodatiecode, naam, stad, land, kamer, persoon, soort, prijsPerWeek, autohuur));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SafariLodge> getAll() {
        return safariLodges;
    }

    @Override
    public SafariLodge get(String id) {
        return null;
    }

    @Override
    public void add(SafariLodge object) {

    }

    @Override
    public void update(SafariLodge object) {

    }

    @Override
    public void remove(SafariLodge object) {

    }

    public void reload(){
        safariLodges.clear();
        load();
    }
}
