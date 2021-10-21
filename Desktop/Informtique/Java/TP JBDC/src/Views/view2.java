package Views;

import Modeles.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view2 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("Liste des contrats en fin de validité");
            while (resul.next()){
                String id = resul.getString("idSal");
                String idcontrat = resul.getString("id");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String dateDebut = resul.getString("dateDebut");
                String dateFin = resul.getString("dateFin");
                String tel = resul.getString("tel");
                String mail = resul.getString("mel");
                System.out.println("Id contrat: " + idcontrat + "\n" + "Date de début: " + dateDebut + "\n" + "Date de fin: "+ dateFin + "\n" + "Id salarié: " + id + "\n" + "Nom: " + nom + "\n" + "Prénom: " + prenom + "\n" + "Téléphone: " + tel + "\n" + "Mail: " + mail + "\n");
            }

        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}