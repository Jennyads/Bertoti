import java.util.ArrayList;

public class GeneralGroups implements CostumeComponent {

    private ArrayList<CostumeComponent> costumeList = new ArrayList<CostumeComponent>();

    @Override
    public void determinesCostume() {
        for (CostumeComponent costume: costumeList) {
            costume.determinesCostume();
        }

    }
    @Override
    public void definesFabric(Cloth cloth) {
        for (CostumeComponent costume: costumeList) {
            costume.definesFabric(cloth);
        }

    }
    public void add(CostumeComponent costume) {
        costumeList.add(costume);
    }

    public void remove(CostumeComponent costume) {
        costumeList.remove(costume);
    }

    public void list(){
        for(CostumeComponent c: costumeList){
            System.out.println(c.toString());
        }
    }

}
