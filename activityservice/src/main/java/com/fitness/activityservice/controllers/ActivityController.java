package com.fitness.activityservice.controllers;

import com.fitness.activityservice.dtos.ActivityRequest;
import com.fitness.activityservice.dtos.ActivityResponse;
import com.fitness.activityservice.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<ActivityResponse>> getUserActivities(@PathVariable String userId){
        return ResponseEntity.ok(activityService.getActivities(userId));
    }
    @GetMapping("/activity/{id}")
    public ResponseEntity<ActivityResponse> getActivityById(@PathVariable String id){
        return ResponseEntity.ok(activityService.getActivityById(id));
    }
}
