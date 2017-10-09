import java.io.IOException;
import java.sql.*;

public class StudentServlet extends javax.servlet.http.HttpServlet {
    private Connection conn;

    @Override
    public void init() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/univer2017",
                    "postgres",
                    "postgres"
            );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String id = request.getParameter("id");
        if (id == null) {
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from students");
                while (rs.next()) {
                    response.getWriter().println(rs.getString("last_name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                PreparedStatement st = conn.prepareStatement(
                        "select * from students where id = ?"
                );
                st.setInt(1, Integer.parseInt(id));
                ResultSet rs = st.executeQuery();
                rs.next();
                response.getWriter().println(rs.getString("last_name"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
