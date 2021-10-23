import Controller.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Traitement {
    public static void main(String[] args) throws SQLException {
        System.out.println("===================Menu====================");
        System.out.println("1. Liste salariés embauchés avant 2008-05-05");
        System.out.println("2. Contrat en fin de validité");
        System.out.println("3. Contrats signés par un salarié");
        System.out.println("4. Nombre de postes existants");
        System.out.println("5. Les services des salariés");
        System.out.println("6. Insertion d'un salarié");
        System.out.println("7. Quitter");
        System.out.println("===========================================");
        System.out.println("\nEntrer votre choix: ");
        Scanner scan = new Scanner(System.in);
        int choix = scan.nextInt();
        switch (choix) {
            case 1:
                Controllers controllers = new Controllers();
                controllers.Requete();
                break;
            case 2:
                Controller2 controllers2 = new Controller2();
                controllers2.Requete();
                break;
            case 3:
                Controller3 controllers3 = new Controller3();
                controllers3.Requete();
                break;
            case 4:
                Controller4 controllers4 = new Controller4();
                controllers4.Requete();
                break;
            case 5:
                Controller5 controller5 = new Controller5();
                controller5.Requete();
                break;
            case 6:
                Controller6 controller6 = new Controller6();
                controller6.Requete();
                break;
            case 7:
                System.exit(0);
        }
    }
}
