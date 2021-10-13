package Modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Modele{

    public static Connection Connexion(String url, String user, String password){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }

        Connection connect = null;

        try{
            connect = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException se){
            System.out.println("Erreur : " + se.getMessage());
        }

        return connect;
    }
}