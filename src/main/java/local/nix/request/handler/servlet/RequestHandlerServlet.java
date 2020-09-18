package local.nix.request.handler.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public class RequestHandlerServlet extends HttpServlet {

   private ConcurrentHashMap<String, String> idAndHeader = new ConcurrentHashMap<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String ipAddr = req.getRemoteAddr();
        String header = req.getHeader("User-Agent");

        idAndHeader.put(ipAddr, header);



        req.setAttribute("ipAddr", ipAddr);
        req.setAttribute("userAgent", header);
        req.setAttribute("idAndHeader", idAndHeader.entrySet());


        req.getServletContext().getRequestDispatcher("/list.jsp").forward(req, resp);



    }
}
