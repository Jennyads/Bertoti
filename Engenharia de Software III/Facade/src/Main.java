import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection facade = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");
        Connection connection = facade.getConnection();
        // fazer operações no banco de dados usando a conexão
        facade.closeConnection();
    }
}
