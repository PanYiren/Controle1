package Views;

import Modeles.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view1 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("Chiffre d'affaire n459629: ");
            while (resul.next()){
                String affaire = resul.getString("chiffrea");
                System.out.println("Chiffre d'affaire : " + affaire);
            }

        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
