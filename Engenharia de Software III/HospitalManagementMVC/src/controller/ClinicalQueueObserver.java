package controller;

import model.DatabaseSingleton;
import model.Patient;
import model.SpecialitEnum;

import java.util.ArrayList;
import java.util.List;

public class ClinicalQueueObserver implements QueueObserver {

    private List<Patient> patientList = new ArrayList<>();

    @Override
    public void update(Patient patient) {

        if(patient.getSpecialistEnum() == SpecialitEnum.GENERAL || patient.getSpecialistEnum() == SpecialitEnum.GENERAL_RETURN){
            patientList.add(patient);
            DatabaseSingleton.getInstance().addPatient(patient);

            System.out.println("- Paciente "+patient.getNome()+" entrou na fila do CLINICO GERAL.");
        }
    }

    public List<Patient> getPatientList(){
        return patientList;
    }

    public Patient nextPatient(){
        Patient patient = patientList.get(0);
        patientList.remove(0);

        if(patient.getSpecialistEnum() != SpecialitEnum.GENERAL_RETURN) {
            patient.setSpecialistEnum(SpecialitEnum.EXAME_GENERAL);
            DatabaseSingleton.getInstance().getReception().notifyObservers(patient);
        }


        return patient;
    }
}
