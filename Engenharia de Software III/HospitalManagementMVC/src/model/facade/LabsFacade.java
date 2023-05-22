package model.facade;

import model.domain.Patient;

public class LabsFacade {
    private Xray labXray = new Xray();
    private Tomography tomography = new Tomography();
    private BloodLab bloodLab = new BloodLab();

    public void doExamGeneral(Patient patient){
        bloodLab.doExam(patient);
    }

    public void doExamOrtho(Patient patient){
        tomography.doExam(patient);
        labXray.doExam(patient);
    }
}
