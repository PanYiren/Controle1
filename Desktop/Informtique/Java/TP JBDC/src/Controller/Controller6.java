package Controller;

import Modeles.Modele;
import Modeles.Repository;
import Views.view6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Controller6{
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
            view6 vue = new view6();
            Repository repository = new Repository(statement);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrer l'id de salarié: ");
            String id = scanner.next();
            System.out.println("Entrer le numéro de sécurité de salarié: ");
            String numSecu = scanner.next();
            System.out.println("Entrer le nom de salarié: ");
            String nom = scanner.next();
            System.out.println("Entrer le prenom de salarié: ");
            String prenom = scanner.next();
            System.out.println("Entrer la date de naissance de salarié (YYYY-MM-JJ): ");
            String dateNais = scanner.next();
            System.out.println("Entrer la date d'embauche de salarié (YYYY-MM-JJ): ");
            String dateEm = scanner.next();
            System.out.println("ENtrer le numéro de téléphone de salarié: ");
            String tel = scanner.next();
            System.out.println("Entrer le mail de salarié: ");
            String mail = scanner.next();
            String req = "INSERT INTO salarie VALUES ('" + id + "'" + ", " + "'" + numSecu + "'" + ", " + "'" + nom + "'" + ", " + "'" + prenom + "'" + ", " + "'" + dateNais +"'" +", " + "'" + dateEm + "'" +", " + "'" + tel +"'" +", " + "'" + mail +"')";
            repository.Insert(conn, req);
            System.out.println("Les données sont bien enregistrer.");
            String Verif = "SELECT * FROM salarie WHERE id =" + "'" + id + "'" + " AND nom =" + "'" + nom + "'" + " AND prenom =" + "'" + prenom + "'";
            result = repository.requete(conn, Verif);
            vue.showView(result);
            conn.close();
        }
        catch (SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
