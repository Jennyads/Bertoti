package Swing;

public class SwingSlow implements SwingBehavior {

    @Override
    public double swing(int age, double weight) {
        if (age > 6 || weight > 10) {
            return ((age * weight)/12) + 4;
        } else {
            return ((age * weight)/12) + 2;
        }
    }
}
