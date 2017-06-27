package org.handbyhand.dbutils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;

import static org.junit.Assert.*;

/**
 * Created by fyy on 6/26/17.
 */
public class DBUtilTest {
    @Test
    public void getConn() throws Exception {
        Connection connection = DBUtil.getInstance().getConn();
      String sql = "insert into user_info (user_id,user_passwd,user_name)values(1,'123456','fyy')";

//        String sql = "select * from seckill";
//        ResultSet rs = connection.createStatement().executeQuery(sql);
//        System.out.println(rs.toString());
        int update  = connection.createStatement().executeUpdate(sql);

        System.out.println(update);

    }

}
