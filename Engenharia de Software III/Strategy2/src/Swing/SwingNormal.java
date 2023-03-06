package Swing;

public class SwingNormal implements SwingBehavior{
    @Override
    public double swing(int age, double weight) {
        if (age > 8 || weight > 20.0) {
            return ((age * weight)/10) + 8;
        }
        else{
            return ((age * weight)/10) + 6;
        }
    }
}
