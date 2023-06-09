
// Classe Main
public class Main {
    public static void main(String[] args) {
        DatabaseFacade databaseFacade = new DatabaseFacade();
        databaseFacade.connectAndExecuteQuery("SELECT * FROM users");
    }
}
