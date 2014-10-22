package ie.dit.student.hartnett.sean;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Addition extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world addition");
		String AString;
		AString = req.getParameter("A");
	}
}
