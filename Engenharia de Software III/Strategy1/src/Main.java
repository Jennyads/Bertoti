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

        Dog labrador = new Dog("Apolo",  DogType.LABRADOR, new BarkHigher(), new SwingFast());
        Dog beagle = new Dog("Bilbo",  DogType.BEAGLE, new BarkMedium(), new SwingSlow());


        List<Dog> caesLista = new ArrayList<>(
                Arrays.asList(labrador, beagle)
        );


        System.out.println("* COMPETIÇÃO DE MAIOR LATIDO:");

        int maiorLatido = 0;
        Dog campeaoLatido = null;

        for (Dog dog: caesLista){
            System.out.println("\n"+dog);
            System.out.println(dog.getNome() + " vai latir...");
            int potenciaLatido = dog.latir();
            System.out.println("\n-----------------------------");

            if(potenciaLatido > maiorLatido){
                maiorLatido = potenciaLatido;
                campeaoLatido = dog;
            }
        }

        System.out.println("CAMPEÃO DO MAIOR LATIDO É: "+campeaoLatido.getNome());

        System.out.println("\n-----------------------------");
        System.out.println("\n* COMPETIÇÃO DE NADO MAIS RÁPIDO:");
        int nadoMaisRapido = 0;
        Dog campeaoNado = null;

        for (Dog dog: caesLista){
            System.out.println("\n"+dog);
            System.out.println(dog.getNome() + " vai nadar...");
            int velocidadeNado = dog.nadar();
            System.out.println("\n-----------------------------");

            if(velocidadeNado > nadoMaisRapido){
                nadoMaisRapido = velocidadeNado;
                campeaoNado = dog;
            }

        }
        System.out.println("CAMPEÃO DO NADO MAIS RÁPIDO É: "+campeaoNado.getNome());




    }

}