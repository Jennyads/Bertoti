import Bark.BarkHigher;
import Bark.BarkLower;
import Bark.BarkMedium;
import Swing.SwingFast;
import Swing.SwingSlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("======COMPETIÇÃO DO CANIL======");
        System.out.println("===============================\n");

        CharacteristicDog characteristicApolo = new CharacteristicDog();
        characteristicApolo.setBarkBehavior(new BarkHigher());
        characteristicApolo.setSwingBehavior(new SwingFast());

        Dog labrador = new Dog("Apolo",  DogType.LABRADOR, 6, 43.4, characteristicApolo);

        CharacteristicDog characteristicBeagle = new CharacteristicDog();
        characteristicBeagle.setBarkBehavior(new BarkMedium());
        characteristicBeagle.setSwingBehavior(new SwingSlow() );

        Dog beagle = new Dog("Bilbo",  DogType.BEAGLE, 4, 12.0, characteristicBeagle);


        List<Dog> listDogs = new ArrayList<>(
                Arrays.asList(labrador, beagle)
        );


        System.out.println("* COMPETIÇÃO DE MAIOR LATIDO:");

        double biggestBark = 0;
        Dog barkChampion = null;

        for (Dog dog: listDogs){
            System.out.println("\n"+dog);
            System.out.println(dog.getName() + " vai latir...");
            double barkPower = dog.bark();
            System.out.println("\n-----------------------------");

            if(barkPower > biggestBark){
                biggestBark = barkPower;
                barkChampion = dog;
            }
        }

        System.out.println("CAMPEÃO DO MAIOR LATIDO É: "+barkChampion.getName());

        System.out.println("\n-----------------------------");




        System.out.println("\n* COMPETIÇÃO DE NADO MAIS RÁPIDO:");
        double swimFaster = 0;
        Dog swimmingChampion = null;

        for (Dog dog: listDogs){
            System.out.println("\n"+dog);
            System.out.println(dog.getName() + " vai nadar...");
            double swimmingSpeed = dog.swing();
            System.out.println("\n-----------------------------");

            if(swimmingSpeed > swimFaster){
                swimFaster = swimmingSpeed;
                swimmingChampion = dog;
            }

        }
        System.out.println("CAMPEÃO DO NADO MAIS RÁPIDO É: "+swimmingChampion.getName());




    }

}