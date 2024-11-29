public class Zoo {
    private int visiteurs = 0;
    private ArrayList<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur;

    public void ajouterSecteur(TypeAnimal _animal){
        Secteur newSecteur = new Secteur(_animal);
        secteursAnimaux.add(newSecteur);
    }

    public void nouveauVisiteur(){
        visiteurs++;
    }


}
