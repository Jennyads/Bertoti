package Bark;

public class BarkLower implements BarkBehavior{

    @Override
    public double bark(int age, double weight) {
        if (age > 7 || weight > 20.0) {
            return ((age * weight)/4) + 6;
        }
        else{
            return  ((age * weight)/4) + 4;
        }
    }
}
