public class Twitter implements Observer{
    @Override
    public void update(Photo photo) {
        System.out.println("No TWITTER, a foto será postada");
        System.out.println(photo);
    }
}
