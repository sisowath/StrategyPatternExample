package strategypattern;

import com.samnang.classes.Bouteille;
import com.samnang.classes.Canette;

public class StrategyPatternDemo {
    
    public static void main(String[] args) {
        Canette uneCanette = new Canette("Coca-Cola", 1.25);
        Bouteille uneBouteille = new Bouteille("Aquafina", 1.75);
        
        System.out.println( uneCanette );
        uneCanette.performeAlgorithmeOuvrir();
        
        System.out.println( uneBouteille );
        uneBouteille.performeAlgorithmeOuvrir();
    }
    
}
