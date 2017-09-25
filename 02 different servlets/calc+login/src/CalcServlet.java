import java.io.IOException;

public class CalcServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String arg1 = request.getParameter("arg1");
        String arg2 = request.getParameter("arg2");
        String oper = request.getParameter("oper");
        response.setContentType("text/html");
        response.getWriter().println("<a href='/'>Back</a>");
        if (oper.equals("+")) {
            response.getWriter().println(
                    "Answer: " + (Double.parseDouble(arg1) + Double.parseDouble(arg2))
            );
        }
    }
}
