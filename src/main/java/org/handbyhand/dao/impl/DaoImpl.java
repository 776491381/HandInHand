package org.handbyhand.dao.impl;

import org.handbyhand.dao.Dao;
import org.handbyhand.dbutils.DBUtil;
import org.handbyhand.entity.UserInfo;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * Created by fyy on 6/27/17.
 */
public class DaoImpl implements Dao {


    public UserInfo login(String username, String passwd) {
        Connection conn = DBUtil.getInstance().getConn();
        UserInfo userinfo = null;
        try {

            String sql = "select * from user_info where user_name = \'" + username + "\' and user_passwd=\'" + passwd + "\'";
            System.out.println(sql);
            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {
                userinfo = new UserInfo();
                System.out.println("Dao username " + rs.getString("user_name"));
                userinfo.setUsername(rs.getString("user_name"));
                userinfo.setPasswd(rs.getString("user_passwd"));
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        return userinfo;
    }


}
