package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoBancoDeDados {
    private static final String CONFIG_FILE = "src/db/config.properties"; // Ajuste o caminho conforme necessário
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        try (InputStream input = new FileInputStream(CONFIG_FILE)) {
            Properties prop = new Properties();
            prop.load(input);
            URL = "jdbc:mysql://"+prop.getProperty("db.host")+":"+prop.getProperty("db.port")+"/"+prop.getProperty("db.database");
            USER = prop.getProperty("db.user");
            PASSWORD = prop.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao carregar as configurações do banco de dados.");
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("Conexão feita!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver JDBC não encontrado.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar!");
        }
        return connection;
    }
}
