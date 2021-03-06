package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.CategoryRepository;

@Controller
public class CategoryController {
    private CategoryRepository categoryRepo;

    public CategoryController(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @RequestMapping("/categories")
    public String showCategoriesPage(Model model) {
        model.addAttribute("categories", categoryRepo.findAll());
        return "CategoriesTemplate";
    }

    @RequestMapping("/category/{ID}")
    public String showCategoryPage(Model model, @PathVariable long ID) {
        model.addAttribute("category", categoryRepo.findById(ID).get());
        return "CategoryTemplate";

    }
}
