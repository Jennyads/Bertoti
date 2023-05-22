package view.conveniocomposite;

public abstract class Convenio {

    private String nome;

    public Convenio(String nome){
        this.nome = nome;
    }

    public abstract void adicionarDependente(Convenio adicaoDependente) throws Exception;

    public abstract void listarDependente();

    public String getNome() {
        return nome;
    }

}
