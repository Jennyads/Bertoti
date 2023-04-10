public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1;
        connection1 = DatabaseConnection.getInstance();
        connection1.getConnection();
    }
}