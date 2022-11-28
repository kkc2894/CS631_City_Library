package code;

import utility.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static Connection con = null;

    public static void test(){
        try {
            String query = "select * from test";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            for (int i = 0; i < 2; i++) {
                rs.next();

                int a = rs.getInt("roll");
                System.out.println(a);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void intializations(){
        con = Helper.dbConnect();
    }

    public static void main(String[] args) {

        intializations();
        test();
    }
}