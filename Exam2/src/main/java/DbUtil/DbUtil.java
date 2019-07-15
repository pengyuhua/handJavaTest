package DbUtil;

import java.io.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Properties;

public class DbUtil {


    public static void getConnection() {
        Properties properties = new Properties();
        //读取配置文件
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream("application.properties"));
            properties.load(inputStream);
            Iterator<String> it=properties.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println(key + ":" + properties.getProperty(key));
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



//        Connection connection = DriverManager.getConnection();

    }

}
