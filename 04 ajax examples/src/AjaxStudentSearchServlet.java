import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxStudentSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String q = request.getParameter("q").toLowerCase();
        // узнать у БД фамилии студентов, в которых есть q
        String lastnames [] = {"Vlad", "Sasha", "Mark"};
        // построить json по ResultSet
        JSONObject jo = new JSONObject();
        JSONArray ja = new JSONArray();
        for (String name: lastnames) {
            if (name.toLowerCase().contains(q)) {
                ja.put(name);
            }
        }
        try {
            jo.put("lastnames", ja);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        // передать json в response
        response.setContentType("text/json");
        response.getWriter().print(jo.toString());
        response.getWriter().close();
    }
}
