import java.io.IOException;

public class FormServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println(
                "<form method=\"GET\" action=\"/calc\">\n" +
                        "\t<input type=\"text\" name=\"arg1\"/>\n" +
                        "\t<br/>\n" +
                        "\t<input type=\"text\" name=\"arg2\"/>\n" +
                        "\t<br/>\n" +
                        "\t<select name=\"oper\">\n" +
                        "\t\t<option value=\"+\">+</option>\n" +
                        "\t\t<option value=\"-\">-</option>\n" +
                        "\t\t<option value=\"*\">*</option>\n" +
                        "\t\t<option value=\"/\">/</option>\n" +
                        "\t</select>\n" +
                        "\t<br/>\n" +
                        "\t<input type=\"submit\" value=\"calc\"/>\n" +
                        "</form>"
        );
    }
}
