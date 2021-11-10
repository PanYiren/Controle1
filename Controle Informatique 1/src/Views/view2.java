package Views;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view2 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            System.out.println("\nID bateaux qui n'a pas été enregistrer en mars 2021: ");
            while (resul.next()){
                String id = resul.getString("id");
                System.out.println("ID : " + id);
            }

        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
