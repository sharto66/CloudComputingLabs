package ie.dit.hartnett.sean;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Multiplication extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world addition");
		String AString, BString;
		int a = 0, b = 0;
		if(req.getParameter("A") != null && req.getParameter("B") != null)
		{
			AString = req.getParameter("A");
			BString = req.getParameter("B");
			try
			{
				a = Integer.parseInt(AString);
			}
			catch(NumberFormatException nfe)
		    {
				AString = getServletConfig().getInitParameter("A");
		    }
			try
			{
				b = Integer.parseInt(BString);
			}
			catch(NumberFormatException nfe)
		    {
				BString = getServletConfig().getInitParameter("B");
		    }
		}
		else
		{
			AString = getServletConfig().getInitParameter("A");
			BString = getServletConfig().getInitParameter("B");
			b = Integer.parseInt(BString);
			a = Integer.parseInt(AString);
		}
		int answer = a * b;
		resp.getWriter().println(a + " * " + b + " = " + answer);
	}
}
