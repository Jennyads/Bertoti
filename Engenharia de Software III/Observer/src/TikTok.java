public class TikTok implements Observer{

    @Override
    public void update(Photo photo) {
        System.out.println("No TIKTOK, a foto será postada");
        System.out.println(photo);
    }
}
