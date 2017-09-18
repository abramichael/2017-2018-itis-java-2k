import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SayServlet")
public class SayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nombre");
        response.setContentType("text/html");
        PrintWriter wr = response.getWriter();
        if (name == null || "".equals(name)) {
            wr.println("Hello, anon");
        } else {
            wr.println("Hello, " + name);
        }
        wr.println("<a href='/say'>Back</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println(
                "<form method=\"POST\" action=\"/say\">" +
                        "<input type=\"text\" name=\"nombre\"/>" +
                        "<input type=\"submit\" value=\"say\"/>" +
                        "</form>");
    }
}
