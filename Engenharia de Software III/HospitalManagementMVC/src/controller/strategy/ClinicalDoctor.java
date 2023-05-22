package controller.strategy;

import model.domain.Patient;
import model.enums.SpecialitEnum;
import model.singleton.DatabaseSingleton;

public class ClinicalDoctor implements Treatment {

    private String name;
    private String CRM;

    public ClinicalDoctor(String name, String CRM) {
        this.name = name;
        this.CRM = CRM;
    }

    public void startAttend(){

        while (DatabaseSingleton.getInstance().getClinicalQueueObserver().getPatientList().size() > 0){

            Patient patient = DatabaseSingleton.getInstance().getClinicalQueueObserver().nextPatient();

            if(patient.getSpecialistEnum() == SpecialitEnum.GENERAL){
                System.out.println("- Médico "+name+" atendeu "+ patient.getNome());
            }

            if(patient.getSpecialistEnum() == SpecialitEnum.GENERAL_RETURN){
                System.out.println("- Médico "+name+" liberou "+ patient.getNome());
            }

        }

    }

    @Override
    public void attend(Patient patient) {
        System.out.println("Atendendo paciente "+patient.getNome()
                +" na especialidade de "+patient.getSpecialistEnum().getDescription()+"...");
    }

    @Override
    public String toString() {
        return "Clínico Geral: " +
                " Nome ='" + name + '\'' +
                ", CRM ='" + CRM + '\'' +
                ';';
    }
}
