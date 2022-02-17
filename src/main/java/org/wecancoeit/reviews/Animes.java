package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Animes {
    @Id
    @GeneratedValue
    public long ID;
    public String Title;
    public String Producer;
    public String Description;
    public String ImageUrl;

    public Animes(String title, String producer, String description, String imageUrl) {

        Title = title;
        Producer = producer;
        Description = description;
        ImageUrl = imageUrl;
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
}
