package com.fitness.activityservice.dtos;

import com.fitness.activityservice.models.ActivityType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityResponse {
    private String id;
    private String userId;
    private ActivityType ActivityType;
    private Integer duration;
    private Integer caloriesBurned;
    private Map<String, Object> additionalMatrices;
    private LocalDateTime startTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
