package com.finalproject.demo.controllers;

import com.finalproject.demo.models.Product;
import com.finalproject.demo.models.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.Optional;
import java.util.UUID;

@Controller
public class MainController {

    @Autowired
    ProductRepo productRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productlist", productRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("view");
        Optional<Product> inventory = productRepo.findById(id);
        Product prodToMap = inventory.get();
        mv.addObject("selectedItem", prodToMap);
        return mv;
    }

    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("edit");
        Optional<Product> inventory = productRepo.findById(id);
        Product prodToMap = inventory.get();
        mv.addObject("selectedItem", prodToMap);
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("id") String id, @RequestParam("description") String description, @RequestParam("price") float price, @RequestParam("category") String category){
        ModelAndView mv = new ModelAndView("redirect:/");
        Product prodToSave ;
        if(!id.isEmpty())
        {
            Optional<Product> users = productRepo.findById(id);
            prodToSave = users.get();
        }
        else
        {
            prodToSave = new Product();
            prodToSave.setId(UUID.randomUUID().toString());
        }
        prodToSave.setDescription(description);

        prodToSave.setPrice(price);
        prodToSave.setCategory(category);
        productRepo.save(prodToSave);
        mv.addObject("productlist", productRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("redirect:/");
        productRepo.deleteById(id);
        return mv;
    }
}