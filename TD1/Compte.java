import java.util.ArrayList;

public class Compte
{
    public int solde;
    public int numCompte;

    Compte(int _solde,int _numCompte){
        solde = _solde;
        numCompte = _numCompte;
    }

    public String toString(){
        return "\nnumCompte: " + numCompte + " solde: " + solde ;
    }

    public static void main(String[] args) {
        Compte unCompte = new Compte(100, 1);
        Compte unAutreCompte = new Compte(200, 2);
        Compte encoreUnAutreCompte = new Compte(300,3);

        Client unClient = new Client("Tom","Jedusor");

        unClient.comptes.add(unCompte);
        unClient.comptes.add(unAutreCompte);
        unClient.comptes.add(encoreUnAutreCompte);

        System.out.println(unClient);
    }


}
