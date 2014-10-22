package ie.dit.hartnett.sean.client;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Addition extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world addition");
		String AString, BString;
		AString = req.getParameter("A");
		BString = req.getParameter("B");
		int a = 0, b = 0;
		try
		{
			a = Integer.parseInt(AString);
		}
		catch(NumberFormatException nfe)
	    {
			resp.getWriter().println("Number Format Exception" + nfe.getMessage());
	    }
		try
		{
			b = Integer.parseInt(BString);
			int answer = a * b;
			resp.getWriter().println(a + " * " + b + " = " + answer);
			//resp.sendRedirect("http://1-dot-ie-mydit-flanagan6-mark.appspot.com/addition?A="+answer+"&B="+ answer);
			//resp.getWriter().println(answer + "*" )
		}
		catch(NumberFormatException nfe)
	    {
			resp.getWriter().println("Number Format Exception" + nfe.getMessage());
	    }
	}
}
