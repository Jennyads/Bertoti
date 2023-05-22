package controller;

import model.Patient;

public interface QueueObserver {

    void update(Patient patient);
}
