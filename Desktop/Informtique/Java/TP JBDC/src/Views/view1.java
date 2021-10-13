package Views;

import Modeles.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view1 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("Test: ");
            while (resul.next()){
                String numCat = resul.getString("id");
                String nomCat = resul.getString("libelle");
                System.out.println("Numero id: " + numCat + "\t\t" + "Libelle: " + nomCat);
            }

        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
