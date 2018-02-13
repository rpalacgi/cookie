package org.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayCookieServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Cookie cookies[] = request.getCookies();
		String passengerName = null;

		for (Cookie c : cookies) {
			if (c.getName().equals("passengerName")) {
				passengerName = c.getValue();
				System.out.println("Name: "+  passengerName);
			}
		}

		PrintWriter out = response.getWriter();
		out.println(passengerName);

	}

}
