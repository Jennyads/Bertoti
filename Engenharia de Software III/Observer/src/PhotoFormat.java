public enum PhotoFormat {
    PNG("PNG"),
    JPEG("JPEG"),
    BMP("BPM");

    private final String photoFormat;

    private PhotoFormat(String photoFormat){
        this.photoFormat = photoFormat;
    }

    public String getPhotoFormat() {
        return photoFormat;
    }

}
