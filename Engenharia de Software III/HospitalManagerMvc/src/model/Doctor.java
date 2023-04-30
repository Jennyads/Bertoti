package model;

public class Doctor {
    private String name;
    private String crm;
    private Specialty specialty;

    public Doctor(String name, String crm, Specialty specialty) {
        this.name = name;
        this.crm = crm;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
