import Bark.BarkBehavior;
import Swing.SwingBehavior;

public class CharacteristicDog {

    private SwingBehavior swingBehavior;
    private BarkBehavior barkBehavior;


    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void setSwingBehavior(SwingBehavior swingBehavior) {
        this.swingBehavior = swingBehavior;
    }

    public BarkBehavior getBarkBehavior() {
        return barkBehavior;
    }

    public SwingBehavior getSwingBehavior() {
        return swingBehavior;
    }


}
