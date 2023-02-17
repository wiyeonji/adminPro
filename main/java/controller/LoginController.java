package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.AdminDAO;
import model.adminDTO;

import java.io.IOException;

public class LoginController implements Controller{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String url = "";
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		adminDTO to = new adminDTO(id, password);
		adminDTO dto = AdminDAO.getInstance().login(to);
		
		if(dto == null ) {
			url="redirect:loginFail.jsp";
			
			HttpSession session = request.getSession();
			
			session.setAttribute("dto", dto);
		}
		
		return url;
		
	}
}
