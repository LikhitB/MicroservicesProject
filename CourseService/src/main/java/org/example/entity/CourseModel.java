package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseModel {
    private Long courseId;
    private String title;
    private String description;
    private Long instructorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
