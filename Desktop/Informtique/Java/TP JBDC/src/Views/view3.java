package Views;

import Modeles.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view3 {
    public void showView(ResultSet resul, String nom) throws SQLException {
        try {
            System.out.println("Liste de contrats signés par " + nom);
            while (resul.next()) {
                String idCont = resul.getString("id");
                System.out.println("Id contrat: " + idCont);
            }
        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
