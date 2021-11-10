import Controller.*;

import java.sql.SQLException;

public class Traitement {
    public static void main(String[] args) throws SQLException {
        Controllers control = new Controllers();
        control.Requete();
        Controllers2 control2 = new Controllers2();
        control2.Requete();
        Controllers3 control3 = new Controllers3();
        control3.Requete();
    }
}
