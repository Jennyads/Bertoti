package model.facade;

import model.domain.Patient;

public class Xray implements Exam{

    public void doExam(Patient patient){
        System.out.println("- Exame de Raio-X foi realizado no paciente "+patient.getNome());
    }

}
