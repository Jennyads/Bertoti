// Facade para simplificar o uso do banco de dados
class DatabaseFacade {
    private DatabaseConnection connection;
    private QueryExecutor queryExecutor;

    public DatabaseFacade() {
        connection = new DatabaseConnection();
        queryExecutor = new QueryExecutor();
    }

    public void connectAndExecuteQuery(String query) {
        connection.connect();
        queryExecutor.executeQuery(query);
        connection.disconnect();
    }
}
