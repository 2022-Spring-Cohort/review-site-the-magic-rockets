package org.wecancoeit.reviews.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.wecancoeit.reviews.Repos.AnimeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimeController {
    private AnimeRepository animeRepo;


    public AnimeController(AnimeRepository animeRepo) {
        this.animeRepo = animeRepo;
    }

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("animes", animeRepo.findAll());
        return "AnimeTemplate";
    }

    @RequestMapping("/show/{ID}")
    public String showShowPage(Model model, @PathVariable long ID) {
        model.addAttribute("anime", animeRepo.findById(ID).get());
        return "ShowTemplate";



//    @RequestMapping("/show/{ID}")
//    public String showShowPage(Model model) {
//
//    }
}}