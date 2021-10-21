package Views;

import Modeles.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view3 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("Liste salariés embauchés avant 2008-05-05");
            while (resul.next()) {
                String idCont = resul.getString("id");
                String id = resul.getString("idSal");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                System.out.println("Id contrat: " + idCont + "\n" + "Numero id: " + id + "\n" + "Nom: " + nom + "\n" + "Prénom: " + prenom + "\n");

            }
        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
