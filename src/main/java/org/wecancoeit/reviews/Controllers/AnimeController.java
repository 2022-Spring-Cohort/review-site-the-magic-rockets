package org.wecancoeit.reviews.Controllers;

import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.Animes;
import org.wecancoeit.reviews.Hashtag;
import org.wecancoeit.reviews.Repos.AnimeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.wecancoeit.reviews.Repos.HashtagRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;
import org.wecancoeit.reviews.Review;

import java.util.Optional;

@Controller
public class AnimeController {
    private AnimeRepository animeRepo;
    private ReviewRepository reviewRepo;
    private HashtagRepository hashtagRepo;

    public AnimeController(AnimeRepository animeRepo, ReviewRepository reviewRepo, HashtagRepository hashtagRepo) {
        this.animeRepo = animeRepo;
        this.reviewRepo = reviewRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("animes", animeRepo.findAll());
        return "AnimeTemplate";
    }

    @GetMapping("/show/{ID}")
    public String showShowTemplate(Model model, @PathVariable long ID) {
        Optional<Animes> tempAnime = animeRepo.findById(ID);
        if (tempAnime.isPresent()) {
            model.addAttribute("anime", tempAnime.get());
        }
        return "ShowTemplate";
    }

    @PostMapping("/show/{ID}")
    public String addReview(@PathVariable long ID, @RequestParam String review){
        Animes myAnime = animeRepo.findById(ID).get();
        Review myReview = new Review(review, myAnime);
        reviewRepo.save(myReview);
        return "redirect:/show/"+ ID;
    }

    @PostMapping("/show/{ID}/addhashtag")
    public String addHashtag(@PathVariable long ID, @RequestParam String hashtag){
        Animes myAnime = animeRepo.findById(ID).get();
        Optional <Hashtag> optHashtag = hashtagRepo.findByHashtag(hashtag);

        if (optHashtag.isPresent() && myAnime.getHashtags().contains(optHashtag.get())) {
            return "redirect:/show/"+ ID;
        } else if (optHashtag.isPresent()) {
            myAnime.addHashtag(optHashtag.get());
            animeRepo.save(myAnime);
        } else {
            Hashtag hashtag1 = new Hashtag(hashtag);
            hashtagRepo.save(hashtag1);
            myAnime.addHashtag(hashtag1);
            animeRepo.save(myAnime);
        }

        return "redirect:/show/"+ ID;
    }
}