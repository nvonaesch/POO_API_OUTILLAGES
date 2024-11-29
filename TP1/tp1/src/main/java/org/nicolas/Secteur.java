package org.nicolas;

public class Secteur {
    TypeAnimal typeAnimauxDansSecteur;
    ArrayList<Animal> animauxDansSecteur;

    Secteur(TypeAnimal _typeAnimauxDansSecteur){
        animauxDansSecteur = new ArrayList<Animal>();
    }

    public int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType(){
        return typeAnimauxDansSecteur;
    }

    public ajouterAnimal(Animal _animal){
        animauxDansSecteur.add(_animal);
    }

}