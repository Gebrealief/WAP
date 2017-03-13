package mum.cs472;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimplestServlet
 */
@WebServlet("/Simplest")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse
    		response)
    		 throws ServletException, IOException
    		 {
    		 PrintWriter out = response.getWriter();
    
    		 }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse
    		response)
    		 throws ServletException, IOException
    		 {
    		 PrintWriter out = response.getWriter();    		 		 
    		 String a = request.getParameter("add1");
             String b = request.getParameter("add2");
             int sum = 0;
             int x,y;
             x = Integer.parseInt(a);
             y = Integer.parseInt(b);
             sum = x + y;             
             out.print(a + "+" + b + "="+ sum);
             
    		 out.print(" <br><br>");
    		
    		 
    		 String c = request.getParameter("mu1");
             String d = request.getParameter("mu2");
             int multiply = 0;
             int e,f;
             e = Integer.parseInt(c);
             f = Integer.parseInt(d);
             multiply = e * f;
             
             out.print(e + "*" + f + "="+ multiply);
       
    		 }

}
