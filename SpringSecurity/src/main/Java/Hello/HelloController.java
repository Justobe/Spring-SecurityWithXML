package Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by YanMing on 2017/3/15.
 */
@Controller
public class HelloController {
    @RequestMapping(value = {"/" ,"/welcome"},method = RequestMethod.GET)
    public ModelAndView homePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","Hello world");
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping(value = {"/logoutPage"},method = RequestMethod.GET)
    public ModelAndView logoutPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("logout");
        return modelAndView;
    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public ModelAndView adminPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","Please log in");
        modelAndView.setViewName("admin");
        return modelAndView;
    }
}
