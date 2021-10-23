package Views;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view5 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("Liste des services: ");
            while (resul.next()) {
                String id = resul.getString("id");
                String libelle = resul.getString("libelle");
                System.out.println("Id de service: " + id + "\n" + "Libelle: " + libelle + "\n");
            }
        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
