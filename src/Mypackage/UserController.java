package Mypackage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class UserController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user(){
		return new ModelAndView("user","command",new User());
	}
	
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	public ModelAndView addUser(User user){
		ModelAndView model = new ModelAndView("result","user",user);
		return model;
	}

}
