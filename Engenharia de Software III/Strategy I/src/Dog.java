import Bark.BarkBehavior;
import Swing.SwingBehavior;

public class Dog {

    private final String name;
    private DogType race;

    private SwingBehavior swingBehavior;
    private BarkBehavior barkBehavior;

    public Dog(String name, DogType race, BarkBehavior barkBehavior, SwingBehavior swingBehavior) {
        this.name = name;
        this.race = race;
        this.barkBehavior = barkBehavior;
        this.swingBehavior = swingBehavior;
    }

    public DogType getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public int bark(){
        int barkPower = barkBehavior.bark();

        for (int i = 0; i < barkPower; i++){
            System.out.print("au");
        }

        return barkPower;
    }
    public int swing(){
        int swimmingSpeed = swingBehavior.swing();
        System.out.println(name+" nadou na velocidade de "+swimmingSpeed+" kh/h");
        return swimmingSpeed;

    }

    @Override
    public String toString() {
        return "Competidor "+name+" da raça "+race.getRace();
    }
}
