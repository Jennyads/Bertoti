public class Instagram implements Observer{
    @Override
    public void update(Photo photo) {
        if(photo.getPhotoFormat() != PhotoFormat.JPEG){
            photo.updatePhotoFormat(PhotoFormat.JPEG);
        }
        System.out.println("No INSTAGRAM, a foto será postada");
        System.out.println(photo);
    }
}
