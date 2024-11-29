import java.util.Random;
import java.util.ArrayList;

public class Client {
    public static int numClient;
    public String Nom;
    public String Prenom;
    ArrayList<Compte> comptes = new ArrayList<Compte>();

    Random rand = new Random();

    Client(String prenom, String nom){
        Nom = nom;
        Prenom = prenom;
        numClient = rand.nextInt(100);
    }

    public String toString(){
        return "Nom: " + Nom + ", Prenom: " + Prenom + ", listeComptes: " + comptes;
    }
}
