package pro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

//import org.springframework.web.portlet.ModelAndView;
//import org.springframework.web.portlet.mvc.AbstractController;

public class ValidateController extends AbstractController
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String un=arg0.getParameter("username");
		String pwd=arg0.getParameter("password");
		if(un.equals("pro")&&pwd.equals("tech"))
		{
			ModelAndView mav=new ModelAndView("Welcome");
			mav.addObject("username",un);
			return mav;
		}
		else
		{
			ModelAndView mav=new ModelAndView("Error");
			return mav;
		}
	}
	
}
