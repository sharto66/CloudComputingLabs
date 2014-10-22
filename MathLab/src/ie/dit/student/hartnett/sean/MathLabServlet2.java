package ie.dit.student.hartnett.sean;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MathLabServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world no.2");
	}
}
