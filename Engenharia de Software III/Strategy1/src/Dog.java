import Bark.BarkBehavior;
import Swing.SwingBehavior;

public class Dog {

    private final String nome;
    private DogType raca;

    private SwingBehavior swingBehavior;
    private BarkBehavior barkBehavior;

    public Dog(String nome, DogType raca, BarkBehavior barkBehavior, SwingBehavior swingBehavior) {
        this.nome = nome;
        this.raca = raca;
        this.barkBehavior = barkBehavior;
        this.swingBehavior = swingBehavior;
    }

    public DogType getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public int latir(){
        int potenciaLatido = barkBehavior.latir();

        for (int i = 0; i < potenciaLatido; i++){
            System.out.print("au");
        }

        return potenciaLatido;
    }
    public int nadar(){
        int velocidadeNado = swingBehavior.swing();
        System.out.println(nome+" nadou na velocidade de "+velocidadeNado+" kh/h");
        return velocidadeNado;

    }

    @Override
    public String toString() {
        return "Competidor "+nome+" da raça "+raca.getRaca();
    }
}
