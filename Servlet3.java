package com.cokiee.cse;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {  
		private static final long serialVersionUID = 1L;
		public Servlet3() {
	      super();
	  }
		public void service(HttpServletRequest request, HttpServletResponse response)  
		        throws ServletException, IOException {  
		 
		
		 try{  
			  
			    response.setContentType("text/html"); 
			    PrintWriter out = response.getWriter(); 
			    RequestDispatcher rd=request.getRequestDispatcher("Servlet3"); 
	            rd.forward(request,response);
//			    String stock=request.getParameter("stock");  
//				 String type=request.getParameter("type");
//				 String qty=request.getParameter("qty");   
//				 String price=request.getParameter("price");  
//			     out.print(stock); 
//				 out.print(type); 
//				 out.print(qty); 
//				 out.print(price); 
			  
			        }catch(Exception e){System.out.println(e);}  
			  }  
//		
		}  
}