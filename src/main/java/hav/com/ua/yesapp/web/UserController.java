package hav.com.ua.yesapp.web;

import hav.com.ua.yesapp.model.User;
import hav.com.ua.yesapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public String list(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

    @RequestMapping("/users/delete/{id}")
    public String delete(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/users";
    }

    @RequestMapping("/users/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        System.out.println("edit...");
        System.out.println("id = " + id);
        User user = userRepository.findById(id).orElse(new User());
        System.out.println(user);
        model.addAttribute("user", user);
        return "user_form";
    }

    @RequestMapping(value = "/users/save", method = RequestMethod.POST)
    public String save(User user) {
        System.out.println("user = " + user);
        userRepository.save(user);
        return "redirect:/users";
    }
}
