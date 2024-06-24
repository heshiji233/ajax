package com.gxa.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zxd on 2024/4/25
 */
@WebServlet("/helloAjax")//配置虚拟路径，访问路径
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("服务器被访问了......");


        resp.getWriter().write("hello ajax!");

    }
}
