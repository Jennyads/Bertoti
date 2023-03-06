import Bark.BarkBehavior;
import Swing.SwingBehavior;

public class Dog {

    private String name;
    private DogType race;
    private int age;
    private double weight;
    private SwingBehavior swingBehavior;
    private BarkBehavior barkBehavior;

    public Dog(String name, DogType race, int age, double weight, CharacteristicDog characteristicDog) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
        this.swingBehavior = characteristicDog.getSwingBehavior();
        this.barkBehavior = characteristicDog.getBarkBehavior();
    }

    public String getName() {
        return name;
    }

    public double bark(){
        double barkPower = barkBehavior.bark(age, weight);

        System.out.println("A frequência do som é de "+barkPower+ "Hz");
        for (int i = 0; i < barkPower; i++){
            System.out.print("au");
        }

        return barkPower;
    }
    public double swing(){
        double swimmingSpeed = swingBehavior.swing(age, weight);
        System.out.println(name+" nadou na velocidade de "+swimmingSpeed+" kh/h");
        return swimmingSpeed;

    }

    @Override
    public String toString() {
        return "Competidor "+name+" da raça "+race.getRace();
    }
}
