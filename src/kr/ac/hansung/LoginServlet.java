package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read from data
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		
		// ....
		
		// build html code
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += String.format("<h2>Your name is %s<br/>", user_name);
		htmlResponse += String.format("Your password is %s</h2>", password);
		htmlResponse += "</html>";
		out.println(htmlResponse);
	}

}
