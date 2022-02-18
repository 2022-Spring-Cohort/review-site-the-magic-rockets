package org.wecancoeit.reviews;



import javax.persistence.*;
import java.util.Collection;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long ID;

    private String review;

    @ManyToOne
    private Animes animes;

    public Review(String review) {
        this.review = review;
    }

    public String getReview() {
        return review;
    }

    public long getID() {
        return ID;
    }

    public Animes getAnimes() {
        return animes;
    }
}
