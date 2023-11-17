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
import java.time.LocalDate;
import java.util.HashMap;

@WebServlet (name = "BookManager", value = "/book-register")
public class BookRegister extends HttpServlet {


    HashMap<String, String> book = new HashMap<>();
    //키 : 제목 , 값 : 저자
    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
            sc = config.getServletContext();
    }

    @Override // 등록하기
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8"); // 한글로 바꿔줌
//        PrintWriter out = resp.getWriter();

//        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        String bm = req.getParameter("bookname");
        String at = req.getParameter("author");
        String dateStr = req.getParameter("date");

        book.put(bm, at);

        sc.setAttribute("bookname", bm);
        sc.setAttribute("author", at);
        sc.setAttribute("date", dateStr);


        RequestDispatcher rd = req.getRequestDispatcher("book-check.jsp");
        rd.forward(req, resp);

    }
}
