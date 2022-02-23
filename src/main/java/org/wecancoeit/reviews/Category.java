package org.wecancoeit.reviews;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long ID;
    private String category;


    @ManyToMany(mappedBy = "category")
    private Collection<Animes> animeList;


    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public long getID() {
        return ID;
    }

    public Collection<Animes> getAnimeList() {
        return animeList;
    }

}
