package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminDAO;

import java.io.IOException;

public class TotalCountController implements Controller {
	@Override
	public String execute(HttpServletRequest reqeust, HttpServletResponse response) throws Exception {
		int count = AdminDAO.getInstance().totalAdminCount();
		reqeust.setAttribute("count", count);
		return "totalCount.jsp";
	}
}