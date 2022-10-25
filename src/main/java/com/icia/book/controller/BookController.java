package com.icia.book.controller;

import com.icia.book.dto.BookDTO;
import com.icia.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/save")
    public String saveForm() {

        return "bookSave";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BookDTO bookDTO) {
        boolean saveResult = bookService.save(bookDTO);
        if (saveResult) {
            return "index";
        } else {
            return "saveFail";
        }
    }

    @GetMapping("/findBook")
    public String findBook(Model model) {
//      특정 책 제목에 대한 전체 정보가 필요하기 때문에 DTO에서 정보를 가져온다
        BookDTO findResult = bookService.findBook();
        model.addAttribute("book", findResult);
        return "findBook";
    }

}
