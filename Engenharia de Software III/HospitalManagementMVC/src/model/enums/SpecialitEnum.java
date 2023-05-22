package model.enums;

public enum SpecialitEnum {
    ORTHOPEDIST("Ortopedista"),
    EXAME_ORTHOPEDIST("Exame Ortopedista"),
    EXAME_GENERAL("Exame Geral"),
    ORTHOPEDIST_RETURN("Retorno Ortopedista"),
    GENERAL_RETURN("Retorno Clinico Geral"),
    GENERAL("Clinico Geral");

    private final String description;

    SpecialitEnum(String specialist){
        this.description = specialist;
    }

    public String getDescription() {
        return description;
    }
}
