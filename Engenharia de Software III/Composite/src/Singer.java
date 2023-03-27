public class Singer implements CostumeComponent {
    private Cloth cloth = null;
    @Override
    public void determinesCostume() {
    }

    @Override
    public void definesFabric(Cloth cloth) {
        this.cloth = cloth;
    }

    @Override
    public String toString() {
        return "Figurino específico para cantor, usando o tecido "+cloth.getDescription();
    }

}
