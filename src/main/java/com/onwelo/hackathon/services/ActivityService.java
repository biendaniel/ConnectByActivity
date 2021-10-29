package com.onwelo.hackathon.services;

import com.onwelo.hackathon.entities.Activity;
import com.onwelo.hackathon.repostiories.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    public List<Activity> getActivities() {
        return activityRepository.findAll();
    }
}
