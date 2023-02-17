package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/front/*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.HandleRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.HandleRequest(request, response);
	}

	protected void HandleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			Controller controller = HandlerMapping.getInstance().create(command);
			String url = controller.execute(request, response).trim();
			if (url.startsWith("redirect:"))
				response.sendRedirect(url.substring(9));
			else
				request.getRequestDispatcher(url).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}

	}

}
