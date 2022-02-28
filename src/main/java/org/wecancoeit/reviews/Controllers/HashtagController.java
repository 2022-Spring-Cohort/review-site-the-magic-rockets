package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.HashtagRepository;

@Controller
public class HashtagController {
    private HashtagRepository hashtagRepo;

    public HashtagController(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/hashtags")
    public String showHashtagPage(Model model) {
        model.addAttribute("hashtags", hashtagRepo.findAll());
        return "HashtagsTemplate";
    }

    @RequestMapping("/hashtag/{ID}")
    public String showHashtagPage(Model model, @PathVariable long ID) {
        model.addAttribute("hashtag", hashtagRepo.findById(ID).get());
        return "HashtagTemplate";

    }
}