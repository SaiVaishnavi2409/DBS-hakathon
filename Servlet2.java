package com.cokiee.cse;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
   
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Servlet2() {
	   super();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("username");  
	    out.print("<h1>Welcome "+n+"</h1>");  
	  
	        }catch(Exception e){System.out.println(e);}  
	  }  
}