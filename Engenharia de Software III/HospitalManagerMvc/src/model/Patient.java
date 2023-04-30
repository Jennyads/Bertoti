package model;

public class Patient {
    private String name;
    private String cpf;
    private String enrececo;
    private String dataNascimento;


    public Patient(String name, String cpf, String enrececo, String dataNascimento) {
        this.name = name;
        this.cpf = cpf;
        this.enrececo = enrececo;
        this.dataNascimento = dataNascimento;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnrececo() {
        return enrececo;
    }

    public void setEnrececo(String enrececo) {
        this.enrececo = enrececo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
