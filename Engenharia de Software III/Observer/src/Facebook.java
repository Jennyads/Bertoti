public class Facebook implements Observer{

    @Override
    public void update(Photo photo) {
        if(photo.getPhotoFormat() != PhotoFormat.JPEG){
            photo.updatePhotoFormat(PhotoFormat.JPEG);
        }

        System.out.println("No FACEBOOK, a foto será postada");
        System.out.println(photo);

    }
}
