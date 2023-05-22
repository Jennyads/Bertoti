package model;

public class Laboratory {

    private final LabsFacade labsFacade = new LabsFacade();

    public void startExam(){
        startClinicalExam();
        startOrthoExam();
    }

    private void startClinicalExam(){

        while (DatabaseSingleton.getInstance().getClinicalExamQueueObserver().getPatientList().size() > 0) {
            Patient patient = DatabaseSingleton.getInstance().getClinicalExamQueueObserver().nextPatient();

            labsFacade.doExamGeneral(patient);
        }
    }

    private void startOrthoExam(){

        while (DatabaseSingleton.getInstance().getExamOrthopedistQueueObserver().getPatientList().size() > 0) {
            Patient patient = DatabaseSingleton.getInstance().getExamOrthopedistQueueObserver().nextPatient();

            labsFacade.doExamOrtho(patient);
        }
    }
}
