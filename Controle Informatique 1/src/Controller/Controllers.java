package Controller;

import Modeles.Modele;
import Modeles.Repository;
import Views.view1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Controllers {
    public void Requete() throws SQLException{
        Statement statement = null;
        ResultSet result = null;
        Properties props = new Properties();
        String url = "jdbc:mysql://localhost:3306/dbfret";
        String user = "root";
        String password = "";

        Connection conn = null;
        try {
            conn = Modele.Connexion(url, user, password);
            view1 vue = new view1();
            Repository repository = new Repository(statement);
            String req = "SELECT SUM(poids * tarifunit) as chiffrea FROM `lot` l INNER JOIN tranche t ON l.idTran = t.id WHERE idLot = '459629'";
            result = repository.requete(conn, req);
            vue.showView(result);
        }
        catch (SQLException se){
            se.getMessage();
        }
        conn.close();
    }
}