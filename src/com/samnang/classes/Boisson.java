package com.samnang.classes;

public class Boisson {
        
    private String marque;
    private double prix;
    public AlgorithmeOuvrir monAlgorithme;
    
    public Boisson(String marque, double prix ) {
        this.marque = marque;        
        this.prix = prix;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }   
    public void setAlgorithmeOuvrir(AlgorithmeOuvrir algorithme) {
        this.monAlgorithme = algorithme;
    }
    public void performeAlgorithmeOuvrir() {
        this.monAlgorithme.ouvrir();
    }
}
