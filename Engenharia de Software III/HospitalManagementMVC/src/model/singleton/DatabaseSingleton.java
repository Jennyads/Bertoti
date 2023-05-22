package model.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.observer.ClinicalExamQueueObserver;
import model.observer.ClinicalQueueObserver;
import model.observer.ExamOrthopedistQueueObserver;
import model.observer.OrthopedistQueueObserver;
import model.subject.ReceptionHospitalSubject;
import model.domain.Patient;

public class DatabaseSingleton {

    private List<Patient> patients = new ArrayList<>();
    private static DatabaseSingleton instance;

    private ReceptionHospitalSubject reception = new ReceptionHospitalSubject();

    private ClinicalQueueObserver clinicalQueueObserver = new ClinicalQueueObserver();

    private OrthopedistQueueObserver orthopedistQueueObserver = new OrthopedistQueueObserver();

    private ClinicalExamQueueObserver clinicalExamQueueObserver = new ClinicalExamQueueObserver();

    private ExamOrthopedistQueueObserver examOrthopedistQueueObserver = new ExamOrthopedistQueueObserver();

    private DatabaseSingleton(){

    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseSingleton.class) {
                if (instance == null) {
                    instance = new DatabaseSingleton();
                }
            }
        }
        return instance;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public List<Patient> getPatients(){
        return Collections.unmodifiableList(patients);
    }

    public ClinicalQueueObserver getClinicalQueueObserver() {
        return clinicalQueueObserver;
    }

    public OrthopedistQueueObserver getOrthopedistQueueObserver() {
        return orthopedistQueueObserver;
    }

    public ClinicalExamQueueObserver getClinicalExamQueueObserver() {
        return clinicalExamQueueObserver;
    }

    public ExamOrthopedistQueueObserver getExamOrthopedistQueueObserver() {
        return examOrthopedistQueueObserver;
    }

    public ReceptionHospitalSubject getReception() {
        return reception;
    }
}
