package org.handbyhand.servlet;

import com.alibaba.fastjson.JSONObject;
import org.handbyhand.dao.Dao;
import org.handbyhand.dao.impl.DaoImpl;
import org.handbyhand.entity.RespResult;
import org.handbyhand.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * Created by fyy on 6/26/17.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String passwd = req.getParameter("password");
        System.out.println(username+"  "+passwd);
        Dao dao= new DaoImpl();
        UserInfo userinfo = dao.login(username,passwd);
        String message = "username or password is worong!";

        System.out.println(userinfo.toString());
        RespResult respResult ;
        if(userinfo == null){
            respResult = new RespResult(false,-1,"用户不存在");
//            req.setAttribute("message",message);
//            req.getRequestDispatcher("login_error.jsp").forward(req,resp);


        }else{
            respResult = new RespResult(true,userinfo,1,"登陆成功");
            //req.getRequestDispatcher("index.jsp").forward(req,resp);
//            PrintWriter p = resp.getWriter();
//            p.print("success");
//            p.flush();


        }

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(respResult);
        resp.setContentType("application/json;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Cache-Control", "no-cache");
        PrintWriter returnValue=resp.getWriter();
        returnValue.write(jsonObject.toJSONString());



    }



//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//    }
}
