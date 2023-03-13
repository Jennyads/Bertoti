import java.util.ArrayList;
import java.util.List;

public class SocialMedia  implements Subject{

    private List<Observer> redesSociais = new ArrayList<>();

    @Override
    public void register(Observer o) {
        redesSociais.add(o);
    }

    @Override
    public void remove(Observer o) {
        int index = redesSociais.indexOf(o);

        if(index > 0){
            redesSociais.remove(index);
        }
    }

    @Override
    public void notify(Photo photo) {
        System.out.println("---------------------------------");
        for(Observer o: redesSociais){
            o.update(photo);
        }
    }
}
