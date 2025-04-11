package controller;

import dao.DonorDAO;
import model.Donor;
import model.User;
import util.HibernateUtil;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = {"/donors/*"})
public class DonorServlet extends HttpServlet {
    private DonorDAO donorDAO;
    private Gson gson;

    @Override
    public void init() throws ServletException {
        donorDAO = new DonorDAO();
        gson = new Gson();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");

        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            resp.getWriter().write("{\"error\": \"Unauthorized access\"}");
            return;
        }

        User user = (User) session.getAttribute("user");
        String path = req.getPathInfo();
        if (path == null || path.equals("/")) path = "/";

        try {
            if (path.equals("/")) {
                Map<String, Object> respData = new HashMap<>();
                respData.put("user", user.getName());
                respData.put("donors", donorDAO.getAllDonors());
                resp.getWriter().write(gson.toJson(respData));
            } else if (path.startsWith("/edit/")) {
                String idStr = path.substring("/edit/".length());
                try {
                    int id = Integer.parseInt(idStr);
                    Donor donor = donorDAO.getDonor(id);
                    if (donor != null) {
                        resp.getWriter().write(gson.toJson(donor));
                    } else {
                        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                        resp.getWriter().write("{\"error\":\"Donor not found\"}");
                    }
                } catch (NumberFormatException e) {
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    resp.getWriter().write("{\"error\":\"Invalid donor ID format\"}");
                }
            } else {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                resp.getWriter().write("{\"error\":\"Invalid endpoint\"}");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            Map<String, String> error = new HashMap<>();
            error.put("error", "Internal server error: " + e.getMessage());
            resp.getWriter().write(gson.toJson(error));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String action = req.getParameter("action");

        Map<String, String> response = new HashMap<>();

        try {
            if ("register".equalsIgnoreCase(action)) {
                Donor donor = new Donor(
                        req.getParameter("firstName"),
                        req.getParameter("lastName"),
                        req.getParameter("email"),
                        req.getParameter("mobileNumber"),
                        req.getParameter("event"),
                        Double.parseDouble(req.getParameter("amount"))
                );
                donorDAO.saveDonor(donor);
                response.put("message", "Donor registered successfully");

            } else if ("update".equalsIgnoreCase(action)) {
                int donId = Integer.parseInt(req.getParameter("donId"));
                Donor donor = donorDAO.getDonor(donId);
                if (donor != null) {
                    donor.setFirstName(req.getParameter("firstName"));
                    donor.setLastName(req.getParameter("lastName"));
                    donor.setEmail(req.getParameter("email"));
                    donor.setMobileNumber(req.getParameter("mobileNumber"));
                    donor.setEvent(req.getParameter("event"));
                    donor.setAmount(Double.parseDouble(req.getParameter("amount")));

                    donorDAO.updateDonor(donor);

                    // ✅ Redirect after update
                    resp.sendRedirect("displayDon.html");
                    return; // stop further execution
                } else {
                    resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    response.put("error", "Donor not found");
                }
            }  else if ("delete".equalsIgnoreCase(action)) {
                int donId = Integer.parseInt(req.getParameter("donId"));
                donorDAO.deleteDonor(donId);
                response.put("message", "Donor deleted successfully");

            } else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.put("error", "Invalid action");
                
                
            }
        } catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.put("error", "Invalid ID or number format: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.put("error", "Error: " + e.getMessage());
        }

        resp.getWriter().write(gson.toJson(response));
    }

    @Override
    public void destroy() {
        HibernateUtil.shutdown();
        System.out.println("Servlet destroyed, SessionFactory closed");
    }
}
