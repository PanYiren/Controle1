package Controller;

import Modeles.Modele;
import Modeles.Repository;
import Views.view3;
import Views.view5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Controller5 {
    public void Requete() throws SQLException {
        Statement statement = null;
        ResultSet result = null;
        Properties props = new Properties();
        String url = "jdbc:mysql://localhost:3306/bddrh";
        String user = "root";
        String password = "";

        Connection conn = null;
        try {
            conn = Modele.Connexion(url, user, password);
            view5 vue = new view5();
            Repository repository = new Repository(statement);
            String req = "SELECT * FROM service";
            result = repository.requete(conn, req);
            vue.showView(result);
        }
        catch (SQLException se){
            se.getMessage();
        }
        conn.close();
    }
}
