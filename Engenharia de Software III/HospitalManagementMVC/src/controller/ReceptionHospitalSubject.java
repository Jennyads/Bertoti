package controller;

import model.Patient;

import java.util.ArrayList;
import java.util.List;

public class ReceptionHospitalSubject {

    private List<QueueObserver> observers = new ArrayList<>();

    public void attach(QueueObserver queueObserver){
        observers.add(queueObserver);
    }

    public void detach(int index){
        observers.remove(index);
    }

    public void notifyObservers(Patient patient){

        for (QueueObserver queueObserver: observers) {
            queueObserver.update(patient);
        }
    }
}
