public enum DogType {

    LABRADOR("Labrador"),
    BEAGLE("Beagle"),
    BORDER_COLLIE("Border Collie");

    private final String race;

    private DogType(String race){
        this.race = race;
    }

    public String getRace() {
        return race;
    }
}
