public enum PhotoFormat {

    PNG("PNG"),
    JPEG("JPEG"),
    BMP("BMP");

    private final String photoFormat;

    PhotoFormat(String photoFormat){
        this.photoFormat = photoFormat;
    }

    public String getPhotoFormat() {
        return photoFormat;
    }


}
