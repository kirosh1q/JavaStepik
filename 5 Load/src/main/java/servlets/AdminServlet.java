package servlets;

import accountServer.AccountServer;
import accountServer.AccountServerI;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AdminServlet extends HttpServlet {

    public static final String PAGE_URL = "/admin";
    private final AccountServerI accountServer;
    public AdminServlet(AccountServerI accountService) {
        this.accountServer = accountService;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(accountServer.getUsersLimit());
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
