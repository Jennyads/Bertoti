public enum Location {

    SP("São Paulo"),
    RJ("Rio de Janeiro"),
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BH("Bahia"),
    CE("Ceará"),
    DG("Distrito Federal"),
    ES("Espírito Santo");

    private final String location;

    private Location(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}


