package org.launchcode.spoiledmilk.controllers;

import org.launchcode.spoiledmilk.data.CoordsRepository;
import org.launchcode.spoiledmilk.data.StoreRepository;
import org.launchcode.spoiledmilk.models.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MapController {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    CoordsRepository coordsRepository;

    @PostMapping
    public String processInfoWindowClick(@ModelAttribute @Valid Store store, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Store Detail");
            model.addAttribute(new Store());
            return "store/create";
        }
        storeRepository.save(store);
        return "store/detail";
    }



}
