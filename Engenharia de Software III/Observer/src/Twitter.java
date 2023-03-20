public class Twitter implements Observer{
    @Override
    public void update(Photo photo) {
        if(photo.getPhotoFormat() != PhotoFormat.BMP){
            photo.updatePhotoFormat(PhotoFormat.BMP);
        }
        System.out.println("No TWITTER, a foto será postada");
        System.out.println(photo);
    }
}
