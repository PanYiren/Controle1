package Controller;

import Modeles.Modele;
import Modeles.Repository;
import Views.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Controllers3 {
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
            view3 vue = new view3();
            Repository repository = new Repository(statement);
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEntrer l'id d'affrètement: ");
            String id = scanner.next();
            String req = "SELECT SUM(b.poidsMax + poids) as poids FROM lot l INNER JOIN bateaufret b INNER JOIN affretement a ON idAff = a.id AND idBatFret = b.id WHERE idAff = '" + id + "'";
            result = repository.requete(conn, req);
            vue.showView(result, id);
        } catch (SQLException se) {
            se.getMessage();
        }
        conn.close();
    }
}
