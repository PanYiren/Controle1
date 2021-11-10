import javax.print.attribute.DateTimeSyntax;
import java.time.*;

public abstract class Expertise {
    protected String codeDossier;
    protected DateTimeException dateHeureRDV;
    protected String lieuRDV;
    protected String adresse;
    protected String immatriculation;
    protected String marque;
    protected String modele;

    public Expertise(String codeDossier, DateTimeException dateHeureRDV, String lieuRDV, String adresse, String immatriculation, String marque, String modele){
        this.codeDossier = codeDossier;
        this.dateHeureRDV = dateHeureRDV;
        this.lieuRDV = lieuRDV;
        this.adresse = adresse;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

}
