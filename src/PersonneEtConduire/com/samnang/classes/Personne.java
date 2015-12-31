package PersonneEtConduire.com.samnang.classes;

public class Personne {
    
    private String nom;
    private String prenom;
    public StrategySeDeplacer algorithme;
    
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setStrategySeDeplacer(StrategySeDeplacer algo) {
        this.algorithme = algo;
    }
    public String performStrategySeDeplacer() {
        return this.algorithme.conduire();
    }
    public String toString() {
        return this.nom + " " + this.prenom + " >> " + performStrategySeDeplacer();
    }
}