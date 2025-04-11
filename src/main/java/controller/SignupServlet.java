package controller;

import model.User;
import util.HibernateUtil;
import util.PasswordUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.hibernate.Session;

import java.io.IOException;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        String hashedPassword = PasswordUtil.hashPassword(password);

        User user = new User();
        user.setName(name); // ✅ avoid PropertyValueException
        user.setEmail(email);
        user.setPassword(hashedPassword);
        user.setRole("USER");

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            resp.sendRedirect("login.html");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Signup failed: " + e.getMessage());
        }
    }
}
