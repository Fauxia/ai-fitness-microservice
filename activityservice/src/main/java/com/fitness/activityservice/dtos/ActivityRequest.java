package com.fitness.activityservice.dtos;

import com.fitness.activityservice.models.ActivityType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityRequest {
    private String userId;
    private ActivityType activityType;
    private Integer duration;
    private Integer caloriesBurned;
    private Map<String, Object> additionalMatrices;
    private LocalDateTime startTime;
}
