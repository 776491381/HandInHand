package org.handbyhand.servlet;

import com.alibaba.fastjson.JSONObject;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.handbyhand.dao.Dao;
import org.handbyhand.dao.impl.DaoImpl;
import org.handbyhand.entity.RespResult;
import org.handbyhand.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by fyy on 6/27/17.
 */
public class SignServlet  extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String passwd   = req.getParameter("passwd");
        Dao dao = new DaoImpl();
        RespResult respResult = dao.sign(username,passwd);



        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(respResult);
        resp.setContentType("application/json;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Cache-Control", "no-cache");
        PrintWriter returnValue=resp.getWriter();
        returnValue.write(jsonObject.toJSONString());

    }
}
