package DbUtil;

import java.io.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;

public class DbUtil {
    private static Connection connection;

    private static String IP;
    private static String username;
    private static String user_pwd;
    private static String database_name;
    private static String driver;
    private static String port;

    public static Connection getConnection() {


        Properties properties = new Properties();
        //读取配置文件
        try {
            InputStream inputStream = new BufferedInputStream(DbUtil.class.getClassLoader().getResourceAsStream("application.properties"));
            properties.load(inputStream);
//            Iterator<String> it=properties.stringPropertyNames().iterator();
//            while (it.hasNext()) {
//                String key = it.next();
//                System.out.println(key + ":" + properties.getProperty(key));
//            }

            IP = properties.getProperty("jdbc.ip");
            username = properties.getProperty("jdbc.username");
            user_pwd = properties.getProperty("jdbc.password");
            database_name = properties.getProperty("jdbc.database_name");
            driver = properties.getProperty("jdbc.driver");
            port = properties.getProperty("jdbc.port");
            //关闭流
            inputStream.close();
            //注册驱动
            Class.forName(driver);
            //构建连接字符串
            String url = "jdbc:mysql://" + IP + ":" + port + "/" + database_name
                    + "?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true";
            // 建立连接
            connection = DriverManager.getConnection(url, username, user_pwd);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;

    }

}
