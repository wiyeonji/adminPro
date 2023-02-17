package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminDAO;


public class CheckDuplicatedIdController implements Controller {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url="";
		
		String id = request.getParameter("id");
		
		Boolean flag = AdminDAO.getInstance().checkDuplicatedId(id);
		if(flag)
			url = "checkIdOk.jsp";
			else 
				url= "checkIdFail.jsp";
		return url;
	}
}
