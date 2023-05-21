package leanhthu.Lab3.controller;
import leanhthu.Lab3.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private List<Book> books;

    @GetMapping
    public String Home()
    {
        return "home/index";
    }
}
