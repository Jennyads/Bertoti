package model.facade;

import model.domain.Patient;

public class BloodLab implements Exam{

    @Override
    public void doExam(Patient patient) {
        System.out.println("- Exame de SANGUE foi realizado no paciente "+patient.getNome());
    }
}
