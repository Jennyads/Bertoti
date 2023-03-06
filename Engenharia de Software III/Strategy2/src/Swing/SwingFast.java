package Swing;

public class SwingFast implements SwingBehavior {

    @Override
    public double swing(int age, double weight) {
        if (age > 10 || weight > 30.0) {
            return ((age * weight)/8) + 12;
        } else {
            return ((age * weight)/8) + 10;
        }
    }

}



