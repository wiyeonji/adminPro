package controller;


import controller.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutController implements Controller {

	@Override
	public String execute(HttpServletRequest reqeust, HttpServletResponse response) throws Exception {
		HttpSession session = reqeust.getSession(false);
		
		if(session != null)
			session.invalidate();
		
		return "redirect:home.jsp";
		}
	}

