import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest r = (HttpServletRequest) req;
        if (r.getSession().getAttribute("current_user") != null) {
            chain.doFilter(req, resp);
        }
        else {
            ((HttpServletResponse)resp).sendRedirect("/login");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
