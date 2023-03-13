public class Main {
    public static void main(String[] args) {


        System.out.println("===================================");

        Photo photo = new Photo("Foto do verão 2023", Location.SP, 12, PhotoFormat.BMP);

        SocialMedia socialMedia = new SocialMedia();
        socialMedia.register(new Facebook());
        socialMedia.register(new Twitter());
        socialMedia.register(new Instagram());

        TikTok tikTok = new TikTok();

        socialMedia.register(tikTok);

        socialMedia.notify(photo);

        Photo photo2 = new Photo("Foto na Fatec 5 semestre", Location.SP, 50, PhotoFormat.JPEG);

        socialMedia.remove(tikTok);

        socialMedia.notify(photo2);


    }
}