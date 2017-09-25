import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    // checks is user exists and password is correct
    private boolean check(String username, String password) {
        return true;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // проверка, что username существует и пароль ему соответствует
        if (check(username, password)) {
            request.getSession().setAttribute("current_user", username);
            response.sendRedirect("/secret");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println(
                "<form method='POST'>" +
                        "<input type='text' name='username'/>" +
                        "<input type='password' name='password'/>" +
                        "<input type='submit' value='sign in'/></form>"
        );
    }
}
