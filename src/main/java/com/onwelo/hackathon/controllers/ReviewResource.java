package com.onwelo.hackathon.controllers;

import com.onwelo.hackathon.entities.Review;
import com.onwelo.hackathon.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewResource {

    private final ReviewService reviewService;

    @PostMapping
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.getReviews();
    }
}
