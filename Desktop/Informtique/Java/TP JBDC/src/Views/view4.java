package Views;

import java.sql.ResultSet;
import java.sql.SQLException;

public class view4 {
    public void showView(ResultSet resul) throws SQLException {
        try {
            while (resul.next()) {
                String nombre = resul.getString("Nombre");
                System.out.println("Nombre de postes existants: " + nombre);

            }
        }
        catch (SQLException se){
            se.getMessage();
        }
    }
}
