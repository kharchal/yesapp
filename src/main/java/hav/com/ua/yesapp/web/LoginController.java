package hav.com.ua.yesapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    public static final String LOGIN = "test";
    public static final String PASS = "123";

    @RequestMapping("/login")
    public String login(@RequestParam(defaultValue = "", required = true) String login,
                        @RequestParam(defaultValue = "", required = true) String pass) {
        if (LOGIN.equals(login) && PASS.equals(pass)) {
            return "main";
        }
        return "index";
    }
}
