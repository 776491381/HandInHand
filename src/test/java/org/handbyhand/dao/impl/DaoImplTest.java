package org.handbyhand.dao.impl;

import org.handbyhand.dao.Dao;
import org.handbyhand.entity.UserInfo;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fyy on 6/27/17.
 */
public class DaoImplTest {
    @Test
    public void sign() throws Exception {

        Dao dao = new DaoImpl();
        System.out.println(dao.sign("fyppy","123456"));

    }

    @Test
    public void login() throws Exception {
        Dao dao = new DaoImpl();
        UserInfo userInfo = dao.login("fyy", "123456");
        System.out.println(userInfo);
    }

}