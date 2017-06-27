package org.handbyhand.dao;

import org.handbyhand.entity.UserInfo;


/**
 *
 * Created by iff on 2017/6/27.
 */
public interface Dao {

     UserInfo login(String username, String passwd);
     int reg(String username,String passwd);

}


