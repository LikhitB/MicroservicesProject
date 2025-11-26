package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionModel {
    private Long submissionId;
    private Long userId;
    private Long assessmentId;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

