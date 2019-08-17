package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DBConnection {
    private static DBConnection dbConnection;
    private FileInputStream file;
    private String filePath;

    private DBConnection() throws FileNotFoundException{
        file=new FileInputStream(filePath);
    }

    public static DBConnection getInstance() throws FileNotFoundException{
        if (dbConnection==null){
                dbConnection=new DBConnection();
        }
        return dbConnection;
    }
}
