import model.subject.ReceptionHospitalSubject;
import view.conveniocomposite.Convenio;
import view.conveniocomposite.ConvenioComposite;
import view.conveniocomposite.ConveniorDependente;
import controller.strategy.ClinicalDoctor;
import controller.strategy.Orthopedist;
import model.domain.Patient;
import model.enums.SpecialitEnum;
import model.facade.Laboratory;
import model.singleton.DatabaseSingleton;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Convenio convenioPatient1 = new ConveniorDependente("Lucas Ramos");
        Convenio convenioPatient2 = new ConvenioComposite("Jeniffer Cristina");
        Convenio convenioPatient3 = new ConvenioComposite("Matheus Cristian");
        Convenio convenioPatient4 = new ConveniorDependente("Stephanie Trufas");
        try {
            convenioPatient2.adicionarDependente(convenioPatient1);
            convenioPatient3.adicionarDependente(convenioPatient4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Patient patient1 = new Patient("423.349.378-30", "Lucas Ramos", 30, SpecialitEnum.GENERAL, convenioPatient1);
        Patient patient2 = new Patient("789.456.123-78", "Jeniffer Cristina", 24, SpecialitEnum.ORTHOPEDIST, convenioPatient2);
        Patient patient3 = new Patient("147.258.369-89", "Matheus Cristian", 21, SpecialitEnum.GENERAL, convenioPatient3);
        Patient patient4 = new Patient("963.852.741-85", "Stephanie Trufas", 26, SpecialitEnum.ORTHOPEDIST, convenioPatient4);

        Orthopedist orthopedist = new Orthopedist("Dr. Mario José", "456");
        ClinicalDoctor clinicalDoctor = new ClinicalDoctor("Dr. João Francisco", "789");

        System.out.println("======================================================");
        System.out.println("=================HOSPITAL MANAGER=====================");
        System.out.println("======================================================");


        System.out.println("\n(LISTA DE PACIENTES)");
        System.out.println("- "+patient1);
        System.out.println("- "+patient2);
        System.out.println("- "+patient3);
        System.out.println("- "+patient4);

        System.out.println("\n(LISTA DE CONVENIO)");
        patient1.getConvenio().listarDependente();
        patient2.getConvenio().listarDependente();
        patient3.getConvenio().listarDependente();
        patient4.getConvenio().listarDependente();

        System.out.println("\n(RECEPÇÃO HOSPITAL)");
        ReceptionHospitalSubject reception = DatabaseSingleton.getInstance().getReception();

        reception.attach(DatabaseSingleton.getInstance().getClinicalQueueObserver());
        reception.attach(DatabaseSingleton.getInstance().getOrthopedistQueueObserver());
        reception.attach(DatabaseSingleton.getInstance().getClinicalExamQueueObserver());
        reception.attach(DatabaseSingleton.getInstance().getExamOrthopedistQueueObserver());

        reception.notifyObservers(patient1);
        reception.notifyObservers(patient2);
        reception.notifyObservers(patient3);
        reception.notifyObservers(patient4);

        List<Patient> patientsClinical = DatabaseSingleton.getInstance().getClinicalQueueObserver().getPatientList();
        List<Patient> patientsOrthopedist = DatabaseSingleton.getInstance().getOrthopedistQueueObserver().getPatientList();

        System.out.println("\n(FILAS HOSPITAL)");
        System.out.println("Fila CLINICO GERAL....");

        for (Patient patientClinical: patientsClinical){
            System.out.println("- "+patientClinical);
        }

        System.out.println("Fila ORTOPEDISTA....");

        for (Patient patientOrthopedist: patientsOrthopedist){
            System.out.println("- "+patientOrthopedist);
        }

        System.out.println("\n(ATENDIMENTO MEDICO)");
        System.out.println("Atendimento CLINICO GERAL....");
        clinicalDoctor.startAttend();
        System.out.println("Atendimento ORTOPEDISTA....");
        orthopedist.startAttend();

        System.out.println("\n(EXAME MEDICO)");
        Laboratory laboratory = new Laboratory();
        laboratory.startExam();

        System.out.println("\n(RETORNO MEDICO)");
        System.out.println("Retorno CLINICO GERAL....");
        clinicalDoctor.startAttend();
        System.out.println("Retorno ORTOPEDISTA....");
        orthopedist.startAttend();

        System.out.println("------------------------------------------------------");


    }
}