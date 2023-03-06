package Bark;

public class BarkHigher implements BarkBehavior {


    @Override
    public double bark(int age, double weight) {
        if (age > 10 || weight > 30.0) {
            return ((age * weight)/4) + 8;
        }
        else{
            return ((age * weight)/4)  + 6;
        }
    }
}