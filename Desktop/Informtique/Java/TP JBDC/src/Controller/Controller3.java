package Controller;

import Modeles.Modele;
import Modeles.Repository;
import Views.view3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Controller3 {
    public void Requete() throws SQLException{
        Statement statement = null;
        ResultSet result = null;
        Properties props = new Properties();
        String url = "jdbc:mysql://localhost:3306/bddrh";
        String user = "root";
        String password = "";

        Connection conn = null;
        try {
            conn = Modele.Connexion(url, user, password);
            view3 vue = new view3();
            Repository repository = new Repository(statement);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrer le nom de salarié: ");
            String nom = scanner.next();
            String req = "SELECT * FROM contrat c inner join salarie s on c.idSal = s.id where nom = '" + nom + "'";
            result = repository.requete(conn, req);
            vue.showView(result, nom);
        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}