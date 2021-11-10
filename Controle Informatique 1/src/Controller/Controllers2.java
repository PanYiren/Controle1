package Controller;

import Modeles.Modele;
import Modeles.Repository;
import Views.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Controllers2 {
    public void Requete() throws SQLException {
        Statement statement = null;
        ResultSet result = null;
        Properties props = new Properties();
        String url = "jdbc:mysql://localhost:3306/dbfret";
        String user = "root";
        String password = "";

        Connection conn = null;
        try {
            conn = Modele.Connexion(url, user, password);
            view2 vue = new view2();
            Repository repository = new Repository(statement);
            String req = "SELECT b.id FROM affretement a INNER JOIN bateaufret b ON a.idBatFret = b.id WHERE date NOT BETWEEN '1-03/-021' AND '31-03-2021' GROUP BY b.id";
            result = repository.requete(conn, req);
            vue.showView(result);
        } catch (SQLException se) {
            se.getMessage();
        }
        conn.close();
    }
}
