public enum Location {

    SP("São Paulo"),
    RJ("Rio de Janeiro"),
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DG("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goias"),
    MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
    PR("Paraná"),
    PA("Pará"),
    PB("Paraíba"),
    PE("Pernambuco"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    SC("Santa Catarina"),
    RR("Roraima"),
    RO("Rondônia"),
    TO("Tocantins"),
    SE("Sergipe"),
    MG("Minas Gerais"),
    MA("Maranhão"),
    PI("Piauí");



    private final String location;

    private Location(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}


