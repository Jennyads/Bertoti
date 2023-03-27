public class Main {
    public static void main(String[] args) {

        Model model1 = new Model();
        model1.definesFabric(Cloth.COTTON);

        Singer singer1 = new Singer();
        singer1.definesFabric(Cloth.POLYESTER);

        Artist artist1 = new Artist();
        artist1.definesFabric(Cloth.LEATHER);

        GeneralGroups groups = new GeneralGroups();

        groups.add(model1);
        groups.add(singer1);
        groups.add(artist1);

        groups.list();

    }
}