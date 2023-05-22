package model.observer;

import model.singleton.DatabaseSingleton;
import model.domain.Patient;
import model.enums.SpecialitEnum;

import java.util.ArrayList;
import java.util.List;

public class OrthopedistQueueObserver implements QueueObserver {

    private List<Patient> patientList = new ArrayList<>();

    @Override
    public void update(Patient patient) {

        if(patient.getSpecialistEnum() == SpecialitEnum.ORTHOPEDIST || patient.getSpecialistEnum() == SpecialitEnum.ORTHOPEDIST_RETURN){
            patientList.add(patient);
            DatabaseSingleton.getInstance().addPatient(patient);

            System.out.println("- Paciente "+patient.getNome()+" entrou na fila do ORTOPEDISTA.");
        }
    }

    public List<Patient> getPatientList(){
        return patientList;
    }

    public Patient nextPatient(){
        if(patientList.size() > 0){
            Patient patient = patientList.get(0);
            patientList.remove(0);

            if(patient.getSpecialistEnum() != SpecialitEnum.ORTHOPEDIST_RETURN) {
                patient.setSpecialistEnum(SpecialitEnum.EXAME_ORTHOPEDIST);
                DatabaseSingleton.getInstance().getReception().notifyObservers(patient);
            }

            return patient;
        }

        return null;
    }
}
