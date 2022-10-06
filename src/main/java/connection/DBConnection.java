package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {

    Connection connection;
    static String bd = "railway";
    static String port = "5551";
    static String login = "root";
    static String password = "Q3mFaYSwbZzu0kM2VOLk";
    static String ip = "containers-us-west-61.railway.app";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+ DBConnection.ip +":" + DBConnection.port + "/" + DBConnection.bd;
            connection = DriverManager.getConnection(url, DBConnection.login, this.password);
            System.out.println("Conexion");
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    
    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }
}
