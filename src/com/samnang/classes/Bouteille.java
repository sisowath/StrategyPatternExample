package com.samnang.classes;

public class Bouteille extends Boisson {
    
    public Bouteille(String marque, double prix) {
        super(marque, prix);
        monAlgorithme = new OuvrirBouchon();
    }
    @Override
    public String toString() {
        return "Je suis une bouteille de marque " + getMarque() + " et au prix de " + getPrix();        
    }
    
}