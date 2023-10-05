package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pizza;

/**
 * Servlet implementation class getPizza
 */
@WebServlet("/getPizza")
public class getPizza extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String toppings = request.getParameter("Toppings");
		String size = request.getParameter("Size");
		String crust = request.getParameter("Crust");
		String sauce = request.getParameter("Sauce");
		
		Pizza stats = new Pizza();
		stats.setName(name);
		stats.setToppings(toppings);
		stats.setSize(size);
		stats.setCrust(crust);
		stats.setSauce(sauce);
		
		request.setAttribute("stats", stats);
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
	}
}