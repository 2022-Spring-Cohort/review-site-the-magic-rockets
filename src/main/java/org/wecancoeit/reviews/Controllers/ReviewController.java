//package org.wecancoeit.reviews.Controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.wecancoeit.reviews.Repos.HashtagRepository;
//import org.wecancoeit.reviews.Repos.ReviewRepository;
//
//@Controller
//public class ReviewController {
//    private ReviewRepository reviewRepo;
//
//    public ReviewController(ReviewRepository reviewRepo) {
//        this.reviewRepo = reviewRepo;
//    }
//
//    @GetMapping("/books/{id}")
//    public String showBookTemplate(Model model, @PathVariable long id) {
//        Optional<Book> tempBook = bookRepo.findById(id);
//        if (tempBook.isPresent())
//        {
//            model.addAttribute("inBook", tempBook.get());
//        }
//
//    @PostMapping("/books/{id}")
//    public String addReview(@PathVariable long id, @RequestParam String review){
//        Book mybook = bookRepo.findById(id).get();
//        mybook.addReview(review);
//        bookRepo.save(mybook);
//        return "redirect:/books/"+ id;
//    }
//}