public enum DogType {

    LABRADOR("Labrador"),
    BEAGLE("Beagle"),
    BORDER_COLLIE("Border Collie");

    private final String raca;

    private DogType(String raca){
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
}
