package com.cokiee.cse;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
   
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Servlet4() {
	   super();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String stock=request.getParameter("stock");  
		 String type=request.getParameter("type");
		 String qty=request.getParameter("qty");   
		 String price=request.getParameter("price");  
	     out.print(stock); 
		 out.print(type); 
		 out.print(qty); 
		 out.print(price);  
	  
	        }catch(Exception e){System.out.println(e);}  
	  }  
	
}