package hav.com.ua.yesapp.web;

import hav.com.ua.yesapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "main";
    }
}
