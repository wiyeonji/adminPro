package controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Controller {
	public String execute(HttpServletRequest reqeust, HttpServletResponse response) throws Exception;

}
