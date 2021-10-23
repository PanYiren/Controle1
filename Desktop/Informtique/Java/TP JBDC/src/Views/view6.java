package Views;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view6 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("\nSalarié enregistrer: ");
            while (resul.next()){
                String id = resul.getString("id");
                String numSecu = resul.getString("numSecu");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String dateNaiss = resul.getString("dateNaiss");
                String dateEnbauche = resul.getString("dateEmbauche");
                String tel = resul.getString("tel");
                String mail = resul.getString("mel");
                System.out.println("Numero id: " + id + "\n" + "Numéro de sécurité: " + numSecu + "\n" + "Nom: " + nom + "\n" + "Prénom: " + prenom + "\n"+ "Date de naissance: " + dateNaiss + "\n" + "Date d'embauche: " + dateEnbauche + "\n" + "Téléphone: " + tel + "\n" + "Mail: " + mail + "\n");
            }

        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
