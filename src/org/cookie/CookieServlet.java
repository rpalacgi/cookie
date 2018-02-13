package org.cookie;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Invoke this url by http://localhost:8080/Cookie/cook?value="Hello"
//Try to implement a basic JWT and save it as a cookie.
public class CookieServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String passengerName = request.getParameter("passengerName");
		System.out.println("Passenger Name " + passengerName);
		Cookie cookie = new Cookie("passengerName", passengerName );
		response.addCookie(cookie);
		response.sendRedirect("display");

	}

}
