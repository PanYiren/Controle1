package Modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Modele{

    public static Connection Connexion(String url, String user, String password){
        try {
            //Chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            //affiche une message d'erreur si il n'y a pas de pilote
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }

        Connection connect = null;

        try{
            //Connexion à partir de DriverManager avec les paramertre
            connect = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException se){
            //affiche une message d'erreur si l'url ou user ou password est incorrect
            System.out.println("Erreur : " + se.getMessage());
        }

        return connect;
    }
}