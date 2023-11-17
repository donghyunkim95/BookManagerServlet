package com.example.bookmanagerservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet (value = "/book-check")
public class Bookcheck extends HttpServlet {

    HashMap<String, String> map = new HashMap<>();
    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {

        sc = config.getServletContext();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8"); // 한글로 바꿔줌
        PrintWriter out = resp.getWriter();
//
//        map = (HashMap<String, String>) sc.getAttribute("BookName");
//
//        String bm = req.getParameter("bookname");
//        String at = req.getParameter("author");
//        String dateStr = req.getParameter("date");
//

    }
}
