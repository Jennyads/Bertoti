import java.util.ArrayList;
import java.util.List;

public class SocialMedia  implements Subject{

    private List<Observer> socialMedias = new ArrayList<>();

    @Override
    public void register(Observer o) {
        socialMedias.add(o);
    }

    @Override
    public void remove(Observer o) {
        int index = socialMedias.indexOf(o);

        if(index > 0){
            socialMedias.remove(index);
        }
    }

    @Override
    public void notify(Photo photo) {
        System.out.println("---------------------------------");
        for(Observer o: socialMedias){
            o.update(photo);
        }
    }
}
