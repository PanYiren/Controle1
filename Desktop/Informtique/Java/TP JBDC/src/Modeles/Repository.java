package Modeles;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository {
    Statement stat;
    ResultSet resul;

    public Repository(Statement stat){
        this.stat = stat;
        this.resul = null;
    }

    public ResultSet requete(Connection connection, String req){
        try {
            this.stat = (Statement) connection.createStatement();
            this.resul = stat.executeQuery(req);
        }
        catch (SQLException se){
            System.out.println("Erreur : " + se.getMessage());
        }
        return this.resul;
    }

    public void Insert(Connection connection, String req){
        try {
            this.stat = (Statement) connection.createStatement();
            stat.executeUpdate(req);
        }
        catch (SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
