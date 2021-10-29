package com.onwelo.hackathon.controllers;

import com.onwelo.hackathon.entities.Activity;
import com.onwelo.hackathon.services.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/activities")
@RequiredArgsConstructor
public class ActivityResource {

    private final ActivityService activityService;

    @GetMapping
    public List<Activity> getActivities() {
        return activityService.getActivities();
    }
}
