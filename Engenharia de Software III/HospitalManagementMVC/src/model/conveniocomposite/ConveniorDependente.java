package model.conveniocomposite;


public class ConveniorDependente extends Convenio {

    private String nome;

    public ConveniorDependente(String nome){
        super(nome);
    }

    @Override
    public void adicionarDependente(Convenio adicaoDependente) throws Exception {
        throw new Exception("Não é possivel adicionar dependente do convênio!");
    }

    @Override
    public void listarDependente() {
        System.out.println("Dependentes de "+super.getNome()+":");
        System.out.println("   - Sem dependente");

    }
}
