package hav.com.ua.yesapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping("/main")
    public String main(Model model) {
        return "main";
    }
}
