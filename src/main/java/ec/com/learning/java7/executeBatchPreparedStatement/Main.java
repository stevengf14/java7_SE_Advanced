package ec.com.learning.java7.executeBatchPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    public boolean readPreparedStatement(Person person) throws SQLException {
        boolean result = false;
        PreparedStatement ps = null;
        try (Statement st = connection.createStatement()) {
            String sql = "SELECT * FROM test WHERE name = ? and pass = ?";
            System.out.println("Query => " + sql);

            ps = connection.prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setString(2, person.getPass());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("data exists");
            } else {
                System.out.println("no data");
            }
            System.out.println("Query success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        return result;
    }

    public void modifyBatchStatement(Person per) throws SQLException {
        long init = System.currentTimeMillis();
        try {
            connection.setAutoCommit(false);
            for (int i = 0; i < 500; i++) {
                Statement st = connection.createStatement();
                String sql = "UPDATE test SET name = '" + per.getName() + "', pass = '" + per.getPass();
            }
            connection.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            connection.rollback();
        }
        long end = System.currentTimeMillis();
        System.out.println("Statement: " + (end - init));
    }

    public void modifyBatchPreparedStatement(Person person) throws SQLException {
        long init = System.currentTimeMillis();
        try {
            connection.setAutoCommit(false);
            PreparedStatement ps = null;
            for (int i = 0; i < 500; i++) {
                String sql = "UPDATE test SET name = ? and pass = ?";

                ps = connection.prepareStatement(sql);
                ps.setString(1, person.getName());
                ps.setString(2, person.getPass());
                ps.addBatch();

            }
            ps.executeBatch();
            connection.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            connection.rollback();
        }
        long end = System.currentTimeMillis();
        System.out.println("Statement: " + (end - init));
    }

    public static void main(String[] args) throws SQLException {
        Main app = new Main();
        app.connect();
        app.modifyBatchStatement(new Person("steven", "1234"));
        System.out.println("********************************");
        app.modifyBatchPreparedStatement(new Person("steven", "1234"));

        app.disconnect();
    }

}
