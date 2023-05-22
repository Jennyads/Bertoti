package controller;

import model.DatabaseSingleton;
import model.Patient;
import model.SpecialitEnum;

import java.util.ArrayList;
import java.util.List;

public class ClinicalExamQueueObserver implements QueueObserver{

    private List<Patient> patientList = new ArrayList<>();

    @Override
    public void update(Patient patient) {

        if(patient.getSpecialistEnum() == SpecialitEnum.EXAME_GENERAL){
            patientList.add(patient);
            DatabaseSingleton.getInstance().addPatient(patient);

            System.out.println("- Paciente "+patient.getNome()+" entrou na fila do EXAME GERAL.");
        }
    }

    public List<Patient> getPatientList(){
        return patientList;
    }

    public Patient nextPatient(){
        if(patientList.size() > 0){
            Patient patient = patientList.get(0);
            patientList.remove(0);

            patient.setSpecialistEnum(SpecialitEnum.GENERAL_RETURN);
            DatabaseSingleton.getInstance().getReception().notifyObservers(patient);

            return patient;
        }

        return null;
    }
}
