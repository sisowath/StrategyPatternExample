package com.samnang.classes;

public class Canette extends Boisson {
        
    public Canette(String marque, double prix) {
        super(marque, prix);
        monAlgorithme = new OuvrirAnneau();
    }
        
    @Override
    public String toString() {
        return "Je suis une canette de marque " + getMarque() + " et au prix de " + getPrix();
    }
}
