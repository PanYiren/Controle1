package Views;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view3 {
    public void showView(ResultSet resul, String id) throws SQLException {
        try {
            System.out.println("Le poids total d'affrètement " + id + " :");
            while (resul.next()){
                String poids = resul.getString("poids");
                System.out.println("Poids : " + poids);
            }

        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
