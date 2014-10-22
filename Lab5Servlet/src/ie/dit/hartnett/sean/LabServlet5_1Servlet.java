package ie.dit.hartnett.sean;

import java.io.IOException;
import java.security.Principal;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LabServlet5_1Servlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		UserService userService = UserServiceFactory.getUserService();//UserService object stores info about uses
		Principal myPrincipal = req.getUserPrincipal(); //gets the users OpenID
		String emailAddress = null;
		String thisURL = req.getRequestURI();
		String loginURL = userService.createLoginURL(thisURL);//creates url for login
		String logoutURL = userService.createLogoutURL(thisURL);//creates url for logout
		resp.setContentType("text/html");
		if(myPrincipal == null)
		{
			resp.getWriter().println("<p>You are Not Logged In</p>");
			resp.getWriter().println("<p>You can <a href=\""+loginURL+"\">signin here</a>.</p>");
		} // end if not logged in
		if(myPrincipal !=null)
		{
			emailAddress = myPrincipal.getName();//gets email address
			resp.getWriter().println("<p>You are Logged in as (email):"+emailAddress+"</p>");
			resp.getWriter().println("<p>You can <a href=\""+logoutURL +"\">sign out</a>.</p>");
		}
		// end if logged in
	}
}
