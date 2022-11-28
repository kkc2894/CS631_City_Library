package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Helper
{
    private static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static Connection dbConnect () {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://139.144.55.212:3306/city_library";
            connection = DriverManager.getConnection(url, "group6", "Root@123");
        } catch (Exception ex) {
            log.log(Level.SEVERE, ex.getMessage());
        }
        return connection;
    }

}
