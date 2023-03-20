public class TikTok implements Observer{

    @Override
    public void update(Photo photo) {
        if(photo.getPhotoFormat() != PhotoFormat.PNG){
            photo.updatePhotoFormat(PhotoFormat.PNG);
        }
        System.out.println("No TIKTOK, a foto será postada");
        System.out.println(photo);
    }
}
