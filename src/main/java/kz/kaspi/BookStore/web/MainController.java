package kz.kaspi.BookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String root() {
        return "homepage";
    }

    @GetMapping("/home")
    public String login(Model model) {
        return "homepage";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/book")
    public String book() {
        return "bookList";
    }

}
