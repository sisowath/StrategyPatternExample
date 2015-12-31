package PersonneEtConduire.com.samnang.classes;

public class SeDeplacerAPied implements StrategySeDeplacer {

    @Override
    public String conduire() {
        return "Je marche...";
    }
    
}
