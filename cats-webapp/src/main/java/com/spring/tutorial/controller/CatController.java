package com.spring.tutorial.controller;

import com.spring.tutorial.model.Cat;
import com.spring.tutorial.DAO.CatsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HD29QN on 2017-02-16.
 */
@Controller
public class CatController {

////    @Autowired
////    private CatsDAO catsDAO;
//    @Autowired
//    private Cat cat;

    @RequestMapping("/welcome")
    public String showMessage(Model model){
        model.addAttribute("message","Good morning");
        return "mainView";
    }

//    @RequestMapping("/add")
//    public String addCatToDB(Model model, HttpServletRequest request, @ModelAttribute("form") @Valid FormDTO form, BindingResult result) {
//
//        if (request.getMethod().equalsIgnoreCase("get") || result.hasErrors()) {
//            return "add";
//        } else {
//
//            String catName = form.getCatName();
//            String catRace = form.getRace();
//            String catEyeColor = form.getCatEyeColor();
//
//            Cat createdCat = new Cat(catName, catRace, catEyeColor);
//            catsDAO.addCatToDB(createdCat);
//
////            model.addAttribute("feedback", "Cat " + catName + " added successfully to DataBase");
//
//            return "redirect:/add";
//        }
//    }
//
//    @RequestMapping("/showCats")
//    public String showAllCats(Model model){
//
//        List<String> catsFromDB = catsDAO.getAllCatNamesFromDB();
//        model.addAttribute("cats", catsFromDB);
//
//        return "showCats";
//    }
//
//
//    @RequestMapping("/catDetails/{catName}")
//    public String showCatDetails(Model model, @PathVariable("catName") String catName){
//
//        Cat detailedCat = catsDAO.getCatByNameFromDB(catName);
//
//        if (detailedCat != null) {
//
//            model.addAttribute("catName", detailedCat.getName());
//            model.addAttribute("catRace", detailedCat.getRace());
//            model.addAttribute("catEyeColor", detailedCat.getEyeColor());
//
//            return "catDetails";
//
//        } else {
//
//            return "noDetailsAvaible";
//
//        }
//    }
//
//
//
//    @RequestMapping("/deleteCat/{catName}")
//    public String deleteCat(Model model, @PathVariable("catName") String catName){
//
//        if (catsDAO.deleteCatByNameFromDB(catName)){
//            model.addAttribute("deletedCats", "Cats successfully deleted.");
//            return "/deleteCat";
//        }
//        else{
//            model.addAttribute("deletedCats", "Delete operation failed.");
//            return "/deleteCat";
//        }
//
//    }
}
























