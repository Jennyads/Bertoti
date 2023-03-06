package Bark;

public class BarkMedium implements BarkBehavior{
    @Override
    public double bark(int age, double weight) {
        if (age > 6 || weight > 15) {
        return ((age * weight)/4) + 4;
    }
    else{
        return ((age * weight)/4) + 2;
    }
    }
}
