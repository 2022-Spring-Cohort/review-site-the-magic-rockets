package org.wecancoeit.reviews;

import org.wecancoeit.reviews.Repos.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.Animes;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    AnimeRepository animeRepo;
    @Override
    public void run(String... args) throws Exception {
        Animes anime = new Animes("Attack on Titan", "We Can Code IT", "Technically the titans are attacking on things.", "/Pics/Attack On Titan.jpg");
        Animes anime1 = new Animes("Demon Slayer", "Warner Bros.", "Mess around and find out","/Pics/Demon Slayer.webp");
        Animes anime2 = new Animes("Inuyasha","Funimation","Half-Demon Homie", "/Pics/Inuyasha.jpg");

        animeRepo.save(anime);
        animeRepo.save(anime1);
        animeRepo.save(anime2);

    }
}
