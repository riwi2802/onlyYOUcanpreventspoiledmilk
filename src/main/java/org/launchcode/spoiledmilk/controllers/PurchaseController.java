package org.launchcode.spoiledmilk.controllers;

import org.launchcode.spoiledmilk.data.PurchaseRepository;
import org.launchcode.spoiledmilk.data.StoreRepository;
import org.launchcode.spoiledmilk.models.Brand;
import org.launchcode.spoiledmilk.models.FatContent;
import org.launchcode.spoiledmilk.models.MilkSize;
import org.launchcode.spoiledmilk.models.PurchaseEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("purchase")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public String displayAllPurchases(Model model) {
        model.addAttribute("title", "All Milk Purchases");
        model.addAttribute("purchaseEntries", purchaseRepository.findAll());
        return "purchase/index";
    }

    @GetMapping("create")
    public String renderCreatePurchaseForm(Model model) {
        model.addAttribute("title", "Create Purchase Info");
        model.addAttribute("purchaseEntry", new PurchaseEntry());
        model.addAttribute("stores", storeRepository.findAll());
        model.addAttribute("brands", Brand.values());
        model.addAttribute("fatContents", FatContent.values());
        model.addAttribute("milkSizes", MilkSize.values());

        return "purchase/create";
    }

    @PostMapping("create")
    public String processCreatePurchaseForm(@ModelAttribute @Valid PurchaseEntry newPurchaseEntry, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Purchase");
            return "purchase/create";
        }
        purchaseRepository.save(newPurchaseEntry);
        return "redirect:";
    }

}
