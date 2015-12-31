package PersonneEtConduire.com.samnang.classes;

public class SeDeplacerEnAuto implements StrategySeDeplacer {

    @Override
    public String conduire() {
        return "Je suis en auto.";
    }
    
}
