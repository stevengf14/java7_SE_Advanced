package ec.com.learning.java7.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

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

    public void registerCallableStatement(Person person) {
        try {
            String sql = "{call spTest(?,?)}";
            CallableStatement cs = connection.prepareCall(sql);
            cs.setString(1, person.getName());
            cs.setString(2, person.getPass());
            cs.execute();
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void toListCallableStatement() {
        try {
            String sql = "{call spToList()}";
            CallableStatement cs = connection.prepareCall(sql);
            cs.execute();
            ResultSet rs = cs.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("pass"));
            }
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void toListOutCallableStatement(Person person) {
        try {
            String sql = "{call spOutId()}";
            CallableStatement cs = connection.prepareCall(sql);
            cs.setString(1, person.getName());
            cs.registerOutParameter("idParam", Types.INTEGER);
            cs.execute();
            int idOut = cs.getInt(2);
            System.out.println("The obtained code is: " + idOut);
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        Main app = new Main();
        app.connect();
        // app.registerCallableStatement(new Person("steven", "1234"));
        // app.toListCallableStatement();
        app.toListOutCallableStatement(new Person("steven", "1234"));
        app.disconnect();
    }

}
