package model.conveniocomposite;


import java.util.ArrayList;
import java.util.List;

public class ConvenioComposite extends Convenio {

    private String nome;
    private List<Convenio> listaDependente = new ArrayList<>();

    public ConvenioComposite(String nome){
        super(nome);
    }

    @Override
    public void adicionarDependente(Convenio adicaoDependente) {
        listaDependente.add(adicaoDependente);
    }

    @Override
    public void listarDependente(){
        System.out.println("Dependentes de "+super.getNome()+":");
        for(Convenio dependente: listaDependente){
            System.out.println("    - "+dependente.getNome());
        }
    }
}
