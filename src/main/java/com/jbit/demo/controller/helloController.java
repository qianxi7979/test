package com.jbit.demo.controller;

import com.jbit.demo.bean.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class helloController {
    @Autowired
    book book;

    @ResponseBody
    @GetMapping("/book")
    public String success() {
        return book.toString();
    }

    @RequestMapping("/success")
    public String succe() {
        return "success";
    }

    @RequestMapping("/books")
    public String book(Model model) {
        List<book> books = new ArrayList<book>();

        book book1 = new book();
        book1.setName("三国演义");
        book1.setAuthor("罗贯中");
        int a = 1;
        book1.setPrice(30);
        book book2 = new book();
        book2.setName("红楼梦");
        book2.setAuthor("曹雪芹");
        book2.setPrice(32);
        books.add(book1);
        books.add(book2);
        model.addAttribute("books", books);
        model.addAttribute("hello", "你好！");
        return "books";
    }
}
