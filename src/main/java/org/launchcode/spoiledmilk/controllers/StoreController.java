package org.launchcode.spoiledmilk.controllers;

import org.launchcode.spoiledmilk.data.StoreRepository;
import org.launchcode.spoiledmilk.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("store")
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public String displayAllStores(Model model) {
        model.addAttribute("title", "All Stores");
        model.addAttribute("stores", storeRepository.findAll());
        return "store/index";
    }

    @GetMapping("create")
    public String renderCreateStoreForm(Model model) {
        model.addAttribute("title", "Create Store");
        model.addAttribute("store", new Store());
        return "store/create";
    }

    @PostMapping("create")
    public String processCreateStoreForm(@ModelAttribute @Valid Store newStore, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Store");
            model.addAttribute(new Store());
            return "store/create";
        }
        storeRepository.save(newStore);
        return "redirect:";
    }

    @GetMapping("detail")
    public String displaySeedDetails(@RequestParam Integer storeId, Model model) {
        Optional<Store> result = storeRepository.findById(storeId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Store ID: " + storeId);
        } else {
            Store store = result.get();
            model.addAttribute("title", store.getTitle() + " Details");
            model.addAttribute("store", store);
        }
        return "store/detail";
    }
}
