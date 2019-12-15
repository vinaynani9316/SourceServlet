import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		int i= Integer.parseInt(req.getParameter("num1"));
//		int j= Integer.parseInt(req.getParameter("num2"));
//		
//		int k= i+j;
		 
		PrintWriter out=res.getWriter();
//		out.println("Hi<br>");
		
		ServletConfig cg= getServletConfig();
		String str= cg.getInitParameter("phone");
		out.println(str);
	}

}
