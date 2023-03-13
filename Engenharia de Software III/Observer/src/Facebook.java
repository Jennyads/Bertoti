public class Facebook implements Observer{

    @Override
    public void update(Photo photo) {

        System.out.println("No FACEBOOK, a foto será postada");
        System.out.println(photo);

    }
}
