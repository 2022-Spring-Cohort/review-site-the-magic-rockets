package Controllers;

import Repos.AnimeRepository;
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
    public String showShowTemplate(Model model) {
        model.addAttribute("anime", animeRepo.findById(1l));
        return "ShowTemplate";
    }


}