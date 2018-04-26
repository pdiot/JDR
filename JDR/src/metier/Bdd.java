package metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
//import java.sql.DataSource;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
@SuppressWarnings("unused")

public class Bdd {
    
    // ATTRIBUT
    public String url = "jdbc:mysql://localhost:3306/phpmyadmin/projetjdr?autoReconnect=true&useSSL=false";
    public String user = "root";
    public String passwd = "";

    
    // CONSTRUCTEUR
    public Bdd(String pUrl, String pUser, String pPasswd) {
        this.url = pUrl;
        this.user = pUser;
        this.passwd = pPasswd;
    }
    public Bdd() {
        this.url = "jdbc:mysql://localhost:3306/phpmyadmin/projetjdr?autoReconnect=true&useSSL=false";
        this.user = "root";
        this.passwd = "";
    }

    // ACCESSEUR MUTATEUR

    public String toString() {
        return "bdd [url=" + url + ", user=" + user + ", passwd=" + passwd + "]";
    }
    
    // METHODE
    public void connect_db() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "");
        properties.setProperty("useSSL", "false");
        properties.setProperty("autoReconnect", "true");
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException e) {
            // handle the error
            System.out.println("La classe com.mysql.cj.jdbc.Driver n'a pas �t� trouv�e");
        }
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjdr?serverTimezone=UTC",properties);
            if (conn != null) {
                System.out.println("Connection OK");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}



