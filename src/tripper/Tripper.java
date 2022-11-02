package tripper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tripper {

    public static void main(String[] args) throws SQLException {
        
            Login login = new Login();
            login.setVisible(true);
            login.pack();
            login.setLocationRelativeTo(null);
            login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
    
    private static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Tripper.username = username;
    }

    
    private static Connection koneksi;

    public static Connection getKoneksi() throws SQLException {
        String username = "root";
        String password = "";
        String hostname = "localhost";
        String database = "tripper";

        if (koneksi == null) {
            try {
                Class.forName("java.sql.Connection");
                String url = "jdbc:mysql://" + hostname + "/" + database + "?&user=" + username + "&password" + password;
                koneksi = DriverManager.getConnection(url);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                System.out.println("Error pada " + e.toString());
            } catch (ClassNotFoundException e) {
                System.out.println("Error ClassNotFoundException pada" + e.toString());
            }
        }

        return koneksi;
    }

}
