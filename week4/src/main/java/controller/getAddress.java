package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Address;
import model.Pizza;


/**
 * Servlet implementation class getAddress
 */
@WebServlet("/getAddress")
public class getAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phoneNumber = request.getParameter("phoneNumber");
		String toppings = request.getParameter("toppings");
		String crust = request.getParameter("crust");
		String size = request.getParameter("size");
		String sauce = request.getParameter("sauce");
		
		
		Address addr = new Address();
		addr.setName(name);
		addr.setAddress(address);
		addr.setPhoneNumber(phoneNumber);
		
		Pizza stats = new Pizza();
		stats.setToppings(toppings);
		stats.setCrust(crust);
		stats.setSize(size);
		stats.setSauce(sauce);
		stats.setPrice();
		
		request.setAttribute("addr", addr);
		request.setAttribute("stats", stats);
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
	}
}
