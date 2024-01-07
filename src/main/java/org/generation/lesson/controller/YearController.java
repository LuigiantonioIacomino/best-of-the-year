package org.generation.lesson.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class YearController {
    @GetMapping
    public String year(Model model) {
        int year=2023;
        String name="Luigiantonio";
        model.addAttribute("year",year);
        model.addAttribute("name",name);
        return "index";
    }


}
