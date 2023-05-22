package model;

public class Tomography implements Exam{

    @Override
    public void doExam(Patient patient) {
        System.out.println("- Exame de TOMOGRAFIA foi realizado no paciente "+patient.getNome());
    }
}
