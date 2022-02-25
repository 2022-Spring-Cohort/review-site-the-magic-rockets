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

        Hashtag yolo = new Hashtag("#Yolo");
        Hashtag gore = new Hashtag("#Gore");
        Hashtag food = new Hashtag("#Food");
        Hashtag boring = new Hashtag("#Boring");
        Hashtag heartwarming = new Hashtag("#Heartwarming");
        Hashtag coolFights = new Hashtag("#Cool Fights");
        Hashtag lotsOfFiller = new Hashtag("#Lots Of Filler");
        Hashtag wild = new Hashtag("#Wild");
        Hashtag highschool = new Hashtag("#High School");
        Hashtag fanservice = new Hashtag("#Fan Service");
        Hashtag scifi = new Hashtag("#Sci-Fi");
        Hashtag monsters = new Hashtag("#Monsters");
        Hashtag fantasy = new Hashtag("#Fantasy");



        hashtagRepo.save(yolo);
        hashtagRepo.save(gore);
        hashtagRepo.save(food);
        hashtagRepo.save(boring);
        hashtagRepo.save(heartwarming);
        hashtagRepo.save(coolFights);
        hashtagRepo.save(lotsOfFiller);
        hashtagRepo.save(wild);
        hashtagRepo.save(highschool);
        hashtagRepo.save(fanservice);
        hashtagRepo.save(scifi);
        hashtagRepo.save(monsters);
        hashtagRepo.save(fantasy);

        Animes AttackOnTitan = new Animes("Attack on Titan",
                "WIT Studio, MAPPA",
                "Set in a world where humanity lives inside cities surrounded by three enormous walls that protect them from the gigantic man-eating humanoids referred to as Titans.",
                "/Pics/Attack On Titan.jpg", action, horror);
        Animes DemonSlayer = new Animes("Demon Slayer",
                "Ufotable",
                "A family is attacked by demons and only two members survive - Tanjiro and his sister Nezuko, who is turning into a demon slowly.",
                "/Pics/Demon Slayer.webp", action, horror);
        Animes Inuyasha = new Animes("Inuyasha",
                "Sunrise",
                "The story of a dog half-demon who is constantly after a jewel of immense power, the Shikon jewel.",
                "/Pics/Inuyasha.jpg", horror, action, romance);
        Animes Clannad = new Animes("Clannad",
                "Kyoto Animation",
                "The story follows the life of Tomoya Okazaki, from adolescence to adulthood.",
                "/Pics/clannad.webp",romance);
        Animes toradora = new Animes("Toradora",
                "Genco",
                "Ryuuji finds out that Taiga has a secret crush on Kitamura and Taiga agrees to help Ryuuji with his love interest as long as he helps her get closer to hers.",
                "/Pics/toradora.webp", comedy,romance);
        Animes thatTimeIGotReincarnatedAsASlime = new Animes("That Time I Got Reincarnated as a Slime",
                "Eight Bit",
                "The story is about a salaryman who is murdered and reincarnates in a sword and sorcery world as a slime. \n" +
                        "\n",
                "/Pics/slime.webp", action);
        Animes parasyteTheMaxim = new Animes("Parasyte: The Maxim",
                "Madhouse",
                "17-year-old Shinichi Izumi is partially infected by a Parasyte. He must learn to co-exist with the creature if he is to survive both the life of a Parasyte and a human as part monster.",
                "/Pics/parasyte.webp", horror, action);
        Animes naruto = new Animes("Naruto",
                "TV Tokyo",
                "A young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.",
                "/Pics/naruto.jpg", action);
        Animes maidSama = new Animes("Maid Sama",
                "JC Staff",
                "Once an all-boys high school, Seika High, infamous for its rowdy students, has recently become a co-ed school.",
                "/Pics/maid sama.webp", romance, comedy);
        Animes tokyoGhoul = new Animes("Tokyo Ghoul",
                "Pierrot",
                "A college student is attacked by a ghoul, a being that feeds on human flesh. He later receives an organ transplant from the ghoul, becoming part monster himself.",
                "/Pics/ghoul.webp", horror, action);
        Animes killLaKill = new Animes("Kill la Kill",
                "Trigger",
                "The series follows vagrant schoolgirl Ryuko Matoi on her search for her father's killer, which brings her into violent conflict with Satsuki Kiryuin, the iron-willed student council president of Honnouji Academy, and her mother's fashion empire.",
                "/Pics/Killlakillpromo.jpg", action );
        Animes gurrenLagann = new Animes("Gurren Lagann",
                "Gainax",
                "Gurren Lagann takes place in a fictional future where Earth is ruled by the Spiral King, Lordgenome, who forces mankind to live in isolated subterranean villages",
                "/Pics/Gurren_Lagann_key_visual.jpg", action );
        Animes bloodC = new Animes("Blood-C",
                "Hiroo Maruyama",
                "Blood-C focuses on Saya Kisaragi, an outwardly normal teenage high school girl who serves as a shrine maiden to a country town; in reality, she is a skilled swordswoman charged by her father to defeat Elder Bairns, monsters who feed on human blood.",
                "/Pics/Horror.jpg", horror );
        Animes DragonBall = new Animes("Dragon Ball",
                "Toei",
                "An epic tale, centered around a strange boy named Goku and his ragtag team of friends!",
                "/Pics/dragonball.jpg", action);
        Animes MyHero = new Animes("My Hero Academia",
                "Animax",
                "A superhero anime following a boy born without powers in a world where they're commonplace.",
                "/Pics/myhero.jpg", action);
        Animes Fullmetal = new Animes("Fullmetal Alchemist",
                "Animax",
                "A tale following two brothers on a quest to regain their destroyed bodies.",
                "/Pics/fullmetal.jpg", action);
        Animes foodWars = new Animes("Food Wars",
                "JC Staff",
                "Teenager Soma Yukihira aspires to become a full-time chef in his father, Joichiro's family restaurant and surpass his father's culinary skills, but Joichiro gets a new job that requires him to travel around the world and close his shop",
                "/Pics/foodwars.jpg", comedy);

        AttackOnTitan.addHashtag(yolo);
        AttackOnTitan.addHashtag(boring);
        AttackOnTitan.addHashtag(gore);
        AttackOnTitan.addHashtag(coolFights);
        DemonSlayer.addHashtag(gore);
        DemonSlayer.addHashtag(fantasy);
        Inuyasha.addHashtag(coolFights);
        Inuyasha.addHashtag(highschool);
        Clannad.addHashtag(heartwarming);
        Clannad.addHashtag(highschool);
        toradora.addHashtag(yolo);
        toradora.addHashtag(heartwarming);
        thatTimeIGotReincarnatedAsASlime.addHashtag(coolFights);
        parasyteTheMaxim.addHashtag(gore);
        parasyteTheMaxim.addHashtag(wild);
        naruto.addHashtag(coolFights);
        naruto.addHashtag(lotsOfFiller);
        naruto.addHashtag(heartwarming);
        maidSama.addHashtag(yolo);
        maidSama.addHashtag(heartwarming);
        maidSama.addHashtag(highschool);
        tokyoGhoul.addHashtag(gore);
        tokyoGhoul.addHashtag(coolFights);
        tokyoGhoul.addHashtag(highschool);
        killLaKill.addHashtag(highschool);
        killLaKill.addHashtag(fanservice);
        gurrenLagann.addHashtag(coolFights);
        gurrenLagann.addHashtag(scifi);
        bloodC.addHashtag(monsters);
        bloodC.addHashtag(coolFights);
        bloodC.addHashtag(gore);
        DragonBall.addHashtag(coolFights);
        DragonBall.addHashtag(heartwarming);
        DragonBall.addHashtag(lotsOfFiller);
        MyHero.addHashtag(highschool);
        MyHero.addHashtag(coolFights);
        MyHero.addHashtag(fantasy);
        Fullmetal.addHashtag(fantasy);
        Fullmetal.addHashtag(coolFights);
        Fullmetal.addHashtag(wild);
        foodWars.addHashtag(food);
        foodWars.addHashtag(yolo);



        animeRepo.save(AttackOnTitan);
        animeRepo.save(DemonSlayer);
        animeRepo.save(Inuyasha);
        animeRepo.save(Clannad);
        animeRepo.save(toradora);
        animeRepo.save(thatTimeIGotReincarnatedAsASlime);
        animeRepo.save(parasyteTheMaxim);
        animeRepo.save(naruto);
        animeRepo.save(maidSama);
        animeRepo.save(tokyoGhoul);
        animeRepo.save(killLaKill);
        animeRepo.save(gurrenLagann);
        animeRepo.save(bloodC);
        animeRepo.save(DragonBall);
        animeRepo.save(MyHero);
        animeRepo.save(Fullmetal);
        animeRepo.save(foodWars);

        Review one = new Review("This series has a lot of well animated action sequences that grip you. The settings and characters feel very detailed and you never know how things will turn out. My only complaint is that it takes a while for the story to pick up.", AttackOnTitan);
        Review two = new Review("With stunning swordfights and supernatural powers, high stakes, a lot of heart, and even a fair amount of humor, the 26-episode first season has everything you need for your next anime binge watch.", DemonSlayer);
        Review three = new Review("Inuyasha has a little bit of everything - folklore, love triangles, anachronism, demon racism, villains that are just as relatable as protagonists - and nicely wraps it up in an intricately detailed story.", Inuyasha);
        Review four = new Review("I only post reviews for shows I have watched completely to the last episode and I will never recommend an anime to every person because frankly, what I like may not be the same for another person.", naruto);
        Review five = new Review("Its an incredibly well executed adaptation of an incredibly popular manga that's popular for a reason. The combination of incredible cooking animation and ridiculous reactions make this show a much watch of the season or even a must watch in general.", foodWars );
        Review six = new Review("It's a show that will have your feelings violently oscillating between emotional exhaustion and overwhelming exultation for the well-placed humor and the well-deserved triumphs.", Fullmetal);
        Review seven = new Review("If you love superheroes but are put off by the many barriers to entry for getting into modern cape comics, My Hero Academia is for you.", MyHero);
        Review eight = new Review("An amazingly unique concept with heartwarming storyline and screenplay. As you watch it you feel light and stress free. Amazingly binging.", DragonBall);
        Review nine = new Review("Most people see this and ignore the quality of the story just because of the goryness. It's a thrilling and entertaining script, with nice twists. And for those who enjoy some violence and blood, is a must!", bloodC);
        Review ten = new Review("\"Gurenn Lagann\" is one of the best anime titles of all time, a series where imagination, originality and implementation are of the highest degree.", gurrenLagann);
        Review eleven = new Review("It's the way it takes well-worn tropes from countless anime series and throws them back with a nod and a wink that makes it frequently funny.", killLaKill);
        Review twelve = new Review("\"Tokyo Ghoul\" is an excellent title, that may not reach exactly the level the top titles of the category have, due to a few clichés here and there, but is definitely not far behind.", tokyoGhoul);
        Review thirteen = new Review("Nothing special. It's nice to watch. Sometimes boring. It does not contain any particular message. Simple, fun. But there is no ending. As if someone halfway just decided to end the series.", maidSama);
        Review fourteen = new Review("If you love 80's body horror and/or genuinely cerebral horror, then you need to watch this. One of the two smartest animes animes I've ever seen .", parasyteTheMaxim);
        Review fifteen = new Review("9/10 A story of the hardships of a young man and his experience in romance. This was an anime that was cute and funny at times and heart wrenching and wholesome at other.", Clannad);
        Review sixteen = new Review ("This anime is amazing. I just finished it and I can't stop crying. This desperately needs a second season although I know it's not gonna happen. I recommend this anime to everybody who loves high school romances.",toradora);
        Review seventeen = new Review ("Watching this show is really entertaining and satisfying.. There's intelligence and logic behind the writing, the action, drama and comedy are well balanced and exhilarating..",thatTimeIGotReincarnatedAsASlime);
        reviewRepo.save(one);
        reviewRepo.save(two);
        reviewRepo.save(three);
        reviewRepo.save(four);
        reviewRepo.save(five);
        reviewRepo.save(six);
        reviewRepo.save(seven);
        reviewRepo.save(eight);
        reviewRepo.save(nine);
        reviewRepo.save(ten);
        reviewRepo.save(eleven);
        reviewRepo.save(twelve);
        reviewRepo.save(thirteen);
        reviewRepo.save(fourteen);
        reviewRepo.save(fifteen);
        reviewRepo.save(sixteen);
        reviewRepo.save(seventeen);




    }
}
