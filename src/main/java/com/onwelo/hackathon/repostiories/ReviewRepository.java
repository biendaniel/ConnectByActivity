package com.onwelo.hackathon.repostiories;

import com.onwelo.hackathon.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
