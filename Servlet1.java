package com.cokiee.cse;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class Servlet1 extends HttpServlet {  
	private static final long serialVersionUID = 1L;
	public Servlet1() {
      super();
  }
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	
	 response.setContentType("text/html");  
	 PrintWriter out = response.getWriter();  
	 Cookie c1=new Cookie("usr1","vnrvjiet");
	 Cookie p1=new Cookie("pwd1","1234");
	 Cookie c2=new Cookie("usr2","user2");
	 Cookie p2=new Cookie("pwd2","pwd2");
	 Cookie c3=new Cookie("usr3","user3");
	 Cookie p3=new Cookie("pwd3","pwd3");
	 Cookie c4=new Cookie("usr4","user4");
	 Cookie p4=new Cookie("pwd4","pwd4");
	 response.addCookie(c1);
	 response.addCookie(p1);
	 response.addCookie(c2);
	 response.addCookie(p2);
	 response.addCookie(c3);
	 response.addCookie(p3);
	 response.addCookie(c4);
	 response.addCookie(p4);
//	 out.println("COOKIE ADDED");
	 String user=request.getParameter("username");  
	 String pas=request.getParameter("password");   
	 
	 Cookie[] c=request.getCookies();
	 boolean flag=false;
	 for(int i=0;i<c.length;i++)
	 {
		 if((c[i].getName().equals("usr1")&&c[i+1].getName().equals("pwd1")) || (c[i].getName().equals("usr2") &&c[i+1].getName().equals("pwd2")) || (c[i].getName().equals("usr3") && c[i+1].getName().equals("pwd3")) || (c[i].getName().equals("usr4") && c[i+1].getName().equals("pwd4") ))
		 {
	        if((user.equals(c[i].getValue()) && pas.equals(c[i+1].getValue())) )
	        {    
	        	flag=true;
	        	RequestDispatcher rd=request.getRequestDispatcher("Servlet2"); 
	            rd.forward(request,response);
	        }
	     }
	 }
	 if(flag==false)
     {
        out.println("YOU ARE NOT AUTHORISED USER ");
        RequestDispatcher rd=request.getRequestDispatcher("./cust.html");
        RequestDispatcher rd=request.getRequestDispatcher("Servlet3"); 
        rd.forward(request,response);
        rd.include(request, response); 
     }
	}  
}