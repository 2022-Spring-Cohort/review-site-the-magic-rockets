package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Category;
import org.wecancoeit.reviews.Hashtag;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
    Hashtag hashtags = new Hashtag();
}
