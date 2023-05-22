package model.domain;

import view.conveniocomposite.Convenio;
import model.enums.SpecialitEnum;

public class Patient {

    private final String cpf;
    private final String nome;
    private final int age;
    private SpecialitEnum specialistEnum;

    private Convenio convenio;

    public Patient(String cpf, String nome, int age, SpecialitEnum specialitEnum, Convenio convenio){
        this.cpf = cpf;
        this.nome = nome;
        this.age = age;
        this.specialistEnum = specialitEnum;
        this.convenio = convenio;
    }

    public String getNome() {
        return nome;
    }

    public int getAge() {
        return age;
    }

    public SpecialitEnum getSpecialistEnum() {
        return specialistEnum;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSpecialistEnum(SpecialitEnum specialistEnum) {
        this.specialistEnum = specialistEnum;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void listarMembrosConvevio(){
        convenio.listarDependente();
    }

    @Override
    public String toString() {
        return "Paciente: "+nome+
                ", CPF: "+cpf+
                ", Idade: "+age+
                ", Atendimento: "+specialistEnum.getDescription()+";";
    }
}
