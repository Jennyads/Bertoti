package controller.strategy;

import model.domain.Patient;

public class Doctor {
    private String name;
    private String CRM;
    private Treatment doctor;

    public Doctor(String name, String CRM, Treatment doctor) {
        this.name = name;
        this.CRM = CRM;
        this.doctor = doctor;
    }

    public Doctor(Treatment doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Treatment getDoctor() {
        return doctor;
    }

    public void setDoctor(Treatment doctor) {
        this.doctor = doctor;
    }

    public void attend(Patient patient){
        doctor.attend(patient);
    }

}
