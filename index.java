import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class EventRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle form submission
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Collect form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String event = request.getParameter("event");
        String mode = request.getParameter("mode");

        // Set response type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display registered participant
        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Email</th><th>Phone</th><th>Event</th><th>Mode</th></tr>");
        out.println("<tr>");
        out.println("<td>" + name + "</td>");
        out.println("<td>" + email + "</td>");
        out.println("<td>" + phone + "</td>");
        out.println("<td>" + event + "</td>");
        out.println("<td>" + mode + "</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}
