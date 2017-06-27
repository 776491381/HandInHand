package org.handbyhand.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * Created by fyy on 6/26/17.
 */
public class DBUtil {

    private static DBUtil instance;
    private static Connection connect;

    private DBUtil() {

    }

    public static synchronized DBUtil getInstance() {
        if (instance == null)
            instance = new DBUtil();
        return instance;
    }

    public Connection getConn() {
        if (null == connect) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://115.159.81.237/cohand", "root", "1234");
//                connect = DriverManager.getConnection("jdbc:mysql://www.fyypumpkin.cn/seckill", "root","123456");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}

