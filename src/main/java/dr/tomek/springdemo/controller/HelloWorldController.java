package dr.tomek.springdemo.controller;

import dr.tomek.springdemo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("greeting", "Dr. Tomek says:");
        model.addAttribute("message", new Message("Spring rules!"));
        return "/index";
    }
}