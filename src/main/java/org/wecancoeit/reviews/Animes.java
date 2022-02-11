package org.wecancoeit.reviews;

import javax.persistence.Entity;

@Entity
public class Animes {
    public long ID;
    public String Title;
    public String Producer;
    public String Description;

    public Animes(long ID, String title, String producer, String description) {
        this.ID = ID;
        Title = title;
        Producer = producer;
        Description = description;
    }

    public long getID() {
        return ID;
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
