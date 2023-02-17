package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminDAO;
import model.adminDTO;

import java.io.IOException;

public class SignInController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String no = request.getParameter("no");
		
		adminDTO dto = new adminDTO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		dto.setNo(no);
		
		if (dto != null) 
			AdminDAO.getInstance().signIn(dto);
			
			return "redirect:home.jsp";
	}
}
