package injection.zestedesavoir;

/**
 * Created by franck on 16/03/16.
 */
public class Pizza {


    public Pizza(String nom) {
        Nom = nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    private String Nom;

}
