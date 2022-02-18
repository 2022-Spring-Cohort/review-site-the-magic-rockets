package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
    Category categories = new Category("");
}
