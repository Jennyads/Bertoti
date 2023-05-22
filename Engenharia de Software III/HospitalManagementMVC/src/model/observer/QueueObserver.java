package model.observer;

import model.domain.Patient;

public interface QueueObserver {

    void update(Patient patient);
}
