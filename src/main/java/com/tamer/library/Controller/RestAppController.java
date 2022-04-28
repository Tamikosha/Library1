package com.tamer.library.Controller;

import java.util.List;

import com.tamer.library.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamer.library.Model.Author;
import com.tamer.library.Service.AuthorService;
import com.tamer.library.Service.BookService;

@RestController
public class RestAppController {

    @Autowired
    BookService bs;
    @Autowired
    AuthorService as;

    @RequestMapping("/allbooks")
    public List<Book> getAllBooks()
    {
        return bs.getAll();
    }
    @RequestMapping("/allauthor")
    public List<Author> getAllAuthor()
    {
        return as.getAll();
    }
}