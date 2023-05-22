package controller.strategy;

import model.domain.Patient;
import model.enums.SpecialitEnum;
import model.singleton.DatabaseSingleton;

public class Orthopedist implements Doctor{

    private String CRM;
    private String name;

    public Orthopedist(String name, String CRM) {
        this.CRM = CRM;
        this.name = name;
    }

    public void startAttend(){

        while (DatabaseSingleton.getInstance().getOrthopedistQueueObserver().getPatientList().size() > 0) {
            Patient patient = DatabaseSingleton.getInstance().getOrthopedistQueueObserver().nextPatient();

            if (patient.getSpecialistEnum() == SpecialitEnum.ORTHOPEDIST) {
                System.out.println("- Médico " + name + " atendeu " + patient.getNome());
            }

            if (patient.getSpecialistEnum() == SpecialitEnum.ORTHOPEDIST_RETURN) {
                System.out.println("- Médico " + name + " liberou " + patient.getNome());
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
        return "Ortopedista: " +
                " Nome ='" + name + '\'' +
                ", CRM ='" + CRM + '\'' +
                ';';
    }
}
