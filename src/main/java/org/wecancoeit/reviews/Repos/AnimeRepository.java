package org.wecancoeit.reviews.Repos;


import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Animes;

public interface AnimeRepository extends CrudRepository<Animes, Long> {
}
