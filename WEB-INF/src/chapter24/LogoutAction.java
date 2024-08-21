package chapter24;

import bean.Customer;
import dao.CustomerDAO;
import tool.Action;
import jakarta.servlet.http.*;

public class LogoutAction extends Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("customer") != null) {
			session.invalidate();
			return "logout-out.jsp";
		}
		
		return "logout-error.jsp";
	}
}