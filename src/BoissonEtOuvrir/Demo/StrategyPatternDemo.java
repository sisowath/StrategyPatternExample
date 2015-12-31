package BoissonEtOuvrir.Demo;

import com.samnang.classes.Bouteille;
import com.samnang.classes.Canette;
import com.samnang.classes.OuvrirBouchon;

public class StrategyPatternDemo {
    
    public static void main(String[] args) {
        Canette uneCanette = new Canette("Coca-Cola", 1.25);
        Bouteille uneBouteille = new Bouteille("Aquafina", 1.75);
        
        System.out.println( uneCanette );
        uneCanette.performeAlgorithmeOuvrir();
        System.out.println("\n");
        System.out.println( uneBouteille );
        uneBouteille.performeAlgorithmeOuvrir();
        System.out.println("\n");        
        Canette uneAutreCanette = new Canette("Pepsi", 2.25);
        uneAutreCanette.setAlgorithmeOuvrir( new OuvrirBouchon() );
        System.out.println( uneAutreCanette );
        uneAutreCanette.performeAlgorithmeOuvrir();
    }
    
}