package PersonneEtConduire.Demo;

import PersonneEtConduire.com.samnang.classes.Personne;
import PersonneEtConduire.com.samnang.classes.SeDeplacerAPied;
import PersonneEtConduire.com.samnang.classes.SeDeplacerEnAuto;

public class StrategySeDeplacerDemo {
    
    public static void main(String args[]) {
        Personne unePersonne = new Personne("Samnang", "Suon");
        unePersonne.setStrategySeDeplacer( new SeDeplacerAPied() );
        System.out.println( unePersonne );
        
        unePersonne.setStrategySeDeplacer( new SeDeplacerEnAuto() );
        System.out.println( unePersonne );
    }
    
}
