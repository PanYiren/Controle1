import java.time.DateTimeException;

public class RDV_Client extends Expertise{
    private String nomContact;
    private String telephone;
    private String mail;

    public RDV_Client(String codeDossier, DateTimeException dateHeureRDV, String lieuRDV, String adresse, String immatriculation, String marque, String modele, String nomContact, String telephone, String mail){
        super(codeDossier, dateHeureRDV, lieuRDV, adresse, immatriculation, marque, modele);
        this.nomContact = nomContact;
        this.telephone = telephone;
        this.mail = mail;
    }
}
