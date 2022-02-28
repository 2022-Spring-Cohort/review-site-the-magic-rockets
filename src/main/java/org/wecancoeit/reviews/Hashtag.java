package org.wecancoeit.reviews;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long ID;
    private String hashtag;


    @ManyToMany(mappedBy = "hashtags")
    private Collection<Animes> animes;


    public Hashtag() {
    }

    public Hashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getHashtag() {
        return hashtag;
    }

    public long getID() {
        return ID;
    }

    public Collection<Animes> getAnimes() {
        return animes;
    }
}
