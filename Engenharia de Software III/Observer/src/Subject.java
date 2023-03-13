public interface Subject {

    void register( Observer o);

    void remove(Observer o);

    void notify(Photo photo);

}
