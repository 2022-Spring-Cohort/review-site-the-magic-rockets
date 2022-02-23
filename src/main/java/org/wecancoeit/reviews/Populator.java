package org.wecancoeit.reviews;

import org.wecancoeit.reviews.Repos.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.Animes;
import org.wecancoeit.reviews.Repos.CategoryRepository;
import org.wecancoeit.reviews.Repos.HashtagRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    HashtagRepository hashtagRepo;
    @Autowired
    AnimeRepository animeRepo;
    @Autowired
    ReviewRepository reviewRepo;

    @Override
    public void run(String... args) throws Exception {



        Category action = new Category("Action");
        Category romance = new Category("Romance");
        Category horror = new Category("Horror");
        Category comedy = new Category("Comedy");
        categoryRepo.save(action);
        categoryRepo.save(romance);
        categoryRepo.save(horror);
        categoryRepo.save(comedy);

        Hashtag yolo = new Hashtag("#yolo");
        Hashtag gore = new Hashtag("#gore");
        Hashtag food = new Hashtag("#food");
        Hashtag boring = new Hashtag("#boring");
        hashtagRepo.save(yolo);
        hashtagRepo.save(gore);
        hashtagRepo.save(food);
        hashtagRepo.save(boring);

        Animes anime = new Animes("Attack on Titan",
                "We Can Code IT",
                "Technically the titans are attacking on things.",
                "/Pics/Attack On Titan.jpg", action);
        Animes anime1 = new Animes("Demon Slayer",
                "Warner Bros.",
                "Mess around and find out",
                "/Pics/Demon Slayer.webp", action, romance);
        Animes anime2 = new Animes("Inuyasha",
                "Funimation",
                "Half-Demon Homie",
                "/Pics/Inuyasha.jpg", horror, action);


        anime.addHashtag(yolo);
        anime.addHashtag(boring);
        anime1.addHashtag(gore);
        anime2.addHashtag(food);

        animeRepo.save(anime);
        animeRepo.save(anime1);
        animeRepo.save(anime2);

        Review one = new Review("Test text 1", anime);
        Review two = new Review("Test text 2", anime1);
        Review three = new Review("Testing 3", anime2);
        Review four = new Review("Testestestest", anime2);
        reviewRepo.save(one);
        reviewRepo.save(two);
        reviewRepo.save(three);
        reviewRepo.save(four);




    }
}
