package org.launchcode.spoiledmilk.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @GetMapping("")
    public String displayHomePage(Model model) {


        return "index";

    }

    @PostMapping("")
    public String displayPostRequest(Model model) {

        return "postDisplay";

    }



}
