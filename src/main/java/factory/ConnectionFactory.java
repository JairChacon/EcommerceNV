package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "chupajo123";
    private static final String  DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/ecommerce";
    
    public static Connection createConnectionToMySQL() throws Exception {
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection con = createConnectionToMySQL();

            if(con != null){
                System.out.println("Conexão obtida com sucesso!");
                con.close();
            }
        } 
        catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
