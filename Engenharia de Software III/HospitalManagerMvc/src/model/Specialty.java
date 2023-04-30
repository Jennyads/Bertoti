package model;

public enum Specialty {

    CARDIOLOGISTA("Cardiologista"),
    CLINICO_GERAL("Clínico Geral"),
    NEUROLOGISTA("Neurologista"),
    ORTOPEDISTA("Ortopedista"),
    PEDIATRA("Pediatra");

    private final String specialty;

    private Specialty(String specialty){
        this.specialty = specialty;
    }

    public String getRace() {
        return specialty;
    }
}
