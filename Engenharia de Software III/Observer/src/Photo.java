public class Photo {

    private String legend;
    private Location location;
    private double size;
    private PhotoFormat photoFormat;
    private Photo notification;

    public Photo(String legend, Location location, double size, PhotoFormat photoFormat){
        this.legend = legend;
        this.location = location;
        this.size = size;
        this.photoFormat = photoFormat;
    }
    public void updatePhotoFormat(PhotoFormat photoFormat){
        this.photoFormat = photoFormat;
    }

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public PhotoFormat getPhotoFormat() {
        return photoFormat;
    }

    public void setPhotoFormat(PhotoFormat photoFormat) {
        this.photoFormat = photoFormat;
    }

    public Photo getNotification() {
        return notification;
    }

    public void setNotification(Photo notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "Foto tirada em "+location+" de tamanho "+size+" (com formato "+photoFormat+") e com a legenda '"+legend+"'";
    }
}


