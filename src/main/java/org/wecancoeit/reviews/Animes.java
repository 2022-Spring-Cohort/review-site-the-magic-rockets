package org.wecancoeit.reviews;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Animes {
    @Id
    @GeneratedValue
    public long ID;
    public String Title;
    public String Producer;
    public String Description;
    public String ImageUrl;

    @ManyToMany
    private Collection<Category> category;

    @ManyToMany
    private Collection<Hashtag> hashtags;

    @OneToMany(mappedBy = "animes")
    private Collection<Review> reviews;

    public Animes(String title, String producer, String description, String imageUrl, Category...categories) {

        Title = title;
        Producer = producer;
        Description = description;
        ImageUrl = imageUrl;
        this.category = Arrays.asList(categories);
        this.hashtags = new ArrayList<Hashtag>();
        this.reviews = new ArrayList<Review>();
    }

    public void addHashtag(Hashtag hashtag) {
        hashtags.add(hashtag);
    }
    public void addReview(Review review){
        reviews.add(review);
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public long getID() {
        return ID;
    }

    private Animes() {
    }

    public String getTitle() {
        return Title;
    }

    public String getProducer() {
        return Producer;
    }

    public String getDescription() {
        return Description;
    }

    public Collection<Category> getCategory() {
        return category;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
}
