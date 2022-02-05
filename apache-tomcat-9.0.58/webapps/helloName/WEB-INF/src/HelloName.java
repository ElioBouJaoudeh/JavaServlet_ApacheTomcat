import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class HelloName extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Name!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Elio Naoum Bou Jaoudeh!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}