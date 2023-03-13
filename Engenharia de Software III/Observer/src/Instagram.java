public class Instagram implements Observer{
    @Override
    public void update(Photo photo) {
        System.out.println("No INSTAGRAM, a foto será postada");
        System.out.println(photo);
    }
}
