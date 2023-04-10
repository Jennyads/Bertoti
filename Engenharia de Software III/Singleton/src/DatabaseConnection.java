public class DatabaseConnection {
    private static DatabaseConnection uniqueInstance;
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new DatabaseConnection();
        }
        return uniqueInstance;
    }
    public void getConnection(){
        System.out.println("Agora você está conectado ao banco de dados.");
    }


}
