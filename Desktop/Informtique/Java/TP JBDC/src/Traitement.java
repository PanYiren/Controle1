import Controller.*;

import java.sql.SQLException;

public class Traitement {
    public static void main(String[] args) throws SQLException {
        System.out.println("==========Menu===========\t");
        System.out.println("1. Liste salariés embauchés avant une date");
        System.out.println("2. Contrat en fin de validité");
        System.out.println("3. Contrats signés par un salarié");
        Controllers controllers = new Controllers();
        controllers.Requete();
    }
}
