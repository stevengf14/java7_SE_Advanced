package ec.com.learning.java7.sqlInjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    private Connection connection = null;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "xxx", "123");
            System.out.println("Connection success");

        } catch (Exception e) {
            System.out.println("Connection error");
        }
    }

    public void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public boolean readStatement(Person person) throws SQLException {
        boolean result = false;
        try (Statement st = connection.createStatement()) {
            String sql = "SELECT * FROM test WHERE name = '" + person.getName() + "' and pass = '" + person.getPass() + "'";
            System.out.println("Query => " + sql);
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                System.out.println("data exists");
                result = true;
            } else {
                System.out.println("no data");
            }
            System.out.println("Query success");
        }
        return result;

    }

    public static void main(String[] args) throws SQLException {
        Main app = new Main();
        app.connect();
        boolean result = app.readStatement(new Person("Steven", "1234' OR 'M' = 'M"));
        app.disconnect();
        
        if(result){
            System.out.println("Connection success Main");
        } else{
            System.out.println("Connection error Main");
        }
    }

}
