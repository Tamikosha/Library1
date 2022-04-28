package com.tamer.library.Controller;

import java.util.List;

import com.tamer.library.Model.Book;
import com.tamer.library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class AuthorizationController {

    @Autowired
    BookService bookservice;


    @RequestMapping("/404")
    public String error() {
        return "error";
    }


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/")
    public String search(Model model, WebRequest request) {
        String name = request.getParameter("search");

        if (name == null) {
            model.addAttribute("isMessage", false);
            return "search";
        }

        model.addAttribute("isMessage", true);
        List<Book> books = bookservice.search(name);
        model.addAttribute("books", books);
        return "search";
    }


}