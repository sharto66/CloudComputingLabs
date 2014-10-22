package ie.dit.hartnett.sean;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LabServletServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, cruel world");
		//String text = displayTextFile();
		//resp.getWriter().println(text);
		//resp.getWriter().println(displayTextFile());
	//}
	
	//public String displayTextFile() {
		String line ="";
		//String text = "";
		BufferedReader input = null;
		try {
			input = new BufferedReader(new FileReader("sample.txt"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			while (( line = input.readLine()) != null)
			{
				//text = text + ("\n"+line);
				resp.getWriter().println(line);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return text;
//	}
}
}
