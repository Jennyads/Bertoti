public enum Cloth {

    COTTON("Cotton"),
    POLYESTER("Polyester"),
    LEATHER("Leather"),
    SATIN("Satin");

    private String description;

    Cloth(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
